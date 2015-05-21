package core;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.graphstream.algorithm.DynamicAlgorithm;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;

public class ModeSequentialBlock implements DynamicAlgorithm {

    private PatternUpdate patternUpdate;
    private ConfigurationContrainer configSet;
    private Graph graph;
    private double time;
    private double timeAnimation;

    public ModeSequentialBlock(PatternUpdate patternUpdate, ConfigurationContrainer configSet, double time, double timeAnimation) {
        this.patternUpdate = patternUpdate;
        this.timeAnimation = timeAnimation;
        this.configSet = configSet;
        this.time = time;
    }

    @Override
    public void terminate() {

        StringBuilder config = new StringBuilder(graph.getNodeCount());

        for (Node node : graph) {
            config.append(node.getAttribute("chips"));
            node.setAttribute("ui.label", node.getAttribute("chips").toString());
        }

        boolean isInserted = configSet.insertConfiguration(config.toString());

        if (!isInserted) {
            System.err.println("Cycle detecté : Taille cycle = " + configSet.retrieveLimitCycleSize());
        }

        try {
            Thread.sleep((long) (time));
        } catch (InterruptedException ex) {
            Logger.getLogger(ModeSequentialBlock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void init(Graph graph) {
        this.graph = graph;
    }

    @Override
    public void compute() {

        /* start */
        for (Map.Entry<Integer, LinkedList<String>> stepIter : patternUpdate.getAllStep()) {
            int numStep = stepIter.getKey();
            LinkedList<String> parallelPattern = stepIter.getValue();

            HashMap<String, Integer> initialState = new HashMap<>(parallelPattern.size());

            for (String nodeId : parallelPattern) {
                initialState.put(nodeId, (int) graph.getNode(nodeId).getAttribute("chips"));
            }

            for (Map.Entry<String, Integer> entry : initialState.entrySet()) {
                if (entry.getValue() >= graph.getNode(entry.getKey()).getOutDegree()) {
                    for (Edge edgeOut : graph.getNode(entry.getKey()).getEachLeavingEdge()) {
                        edgeOut.setAttribute("ui.class", "marked");
                    }
                }
            }

            try {
                Thread.sleep((long) (timeAnimation));
            } catch (InterruptedException ex) {
                Logger.getLogger(ModeSequentialBlock.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (Edge e : graph.getEdgeSet()) {
                e.setAttribute("ui.class", "unmarked");
            }

            /* Mise a jour des tokens */
            for (Map.Entry<String, Integer> entry : initialState.entrySet()) {
                if (entry.getValue() >= graph.getNode(entry.getKey()).getOutDegree()) {
                    for (Edge edgeOut : graph.getNode(entry.getKey()).getEachLeavingEdge()) {
                        edgeOut.getNode1().setAttribute("chips", (int) edgeOut.getNode1().getAttribute("chips") + 1);
                        edgeOut.getNode1().setAttribute("ui.label", edgeOut.getNode1().getAttribute("chips").toString());
                        edgeOut.getNode0().setAttribute("chips", (int) edgeOut.getNode0().getAttribute("chips") - 1);
                        edgeOut.getNode0().setAttribute("ui.label", edgeOut.getNode0().getAttribute("chips").toString());
                    }
                }
            }

        }
    }
}
