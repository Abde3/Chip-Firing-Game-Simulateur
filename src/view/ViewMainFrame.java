package view;

import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.ModelMainFrame;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.ui.view.Viewer;

public class ViewMainFrame extends javax.swing.JFrame implements Observer {

    // L'instance de notre objet contrôleur
    private ModelMainFrame model;
    private Viewer viewer;

    public ViewMainFrame() {
        initComponents();
    }

    public ViewMainFrame(ModelMainFrame modelMainFrame) {
        initComponents();

        this.model = modelMainFrame;

        viewer = new Viewer(model.getGraph(), Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
        viewer.enableAutoLayout();
        viewGraph.add(viewer.addDefaultView(false));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iterationMode = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        playCFG = new javax.swing.JPanel();
        viewGraph = new javax.swing.JPanel();
        optionsControl = new javax.swing.JPanel();
        iterationModeParallel = new javax.swing.JRadioButton();
        iterationModeSeqentiel = new javax.swing.JRadioButton();
        separator4 = new javax.swing.JSeparator();
        optionControlRun = new javax.swing.JButton();
        optionControlForward = new javax.swing.JButton();
        optionControlBegin = new javax.swing.JButton();
        optionControlBackward = new javax.swing.JButton();
        optionControlEnd = new javax.swing.JButton();
        optionControlTime = new javax.swing.JTextField();
        optionControlTimeLabel = new javax.swing.JLabel();
        iterationButton = new javax.swing.JButton();
        graphTransButton = new javax.swing.JButton();
        editGraphButton = new javax.swing.JButton();
        infoGraphButton = new javax.swing.JButton();
        logButton = new javax.swing.JButton();
        validateTime = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        optionsChips = new javax.swing.JPanel();
        inputNbChips = new javax.swing.JTextField();
        modeAddChips = new javax.swing.JRadioButton();
        modeRemoveChips = new javax.swing.JRadioButton();
        valideOptionChips = new javax.swing.JButton();
        selectedNode = new javax.swing.JScrollPane();
        selectedNodeText = new javax.swing.JTextArea();
        nbChipsLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        separator5 = new javax.swing.JSeparator();
        importGraph = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        separator1 = new javax.swing.JPopupMenu.Separator();
        Save = new javax.swing.JMenuItem();
        saveas = new javax.swing.JMenuItem();
        separator2 = new javax.swing.JPopupMenu.Separator();
        import_ = new javax.swing.JMenuItem();
        separator3 = new javax.swing.JPopupMenu.Separator();
        quit = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        viewGraph.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        viewGraph.setLayout(new java.awt.BorderLayout());

        iterationMode.add(iterationModeParallel);
        iterationModeParallel.setSelected(true);
        iterationModeParallel.setText("Bloc-Seq");
        iterationModeParallel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iterationModeParallelActionPerformed(evt);
            }
        });

        iterationMode.add(iterationModeSeqentiel);
        iterationModeSeqentiel.setText("Async");

        separator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        optionControlRun.setText("||>");

        optionControlForward.setText(">>");

        optionControlBegin.setText("|<");

        optionControlBackward.setText("<<");

        optionControlEnd.setText(">|");

        optionControlTimeLabel.setText("ms");

        iterationButton.setText("Iteration");

        graphTransButton.setText("Graph trans");

        editGraphButton.setText("Edit Graph");

        infoGraphButton.setText("Info Graph");

        logButton.setText("Log");

        validateTime.setText("OK");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout optionsControlLayout = new javax.swing.GroupLayout(optionsControl);
        optionsControl.setLayout(optionsControlLayout);
        optionsControlLayout.setHorizontalGroup(
            optionsControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionControlBegin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlBackward)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlRun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlForward)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlEnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iterationModeParallel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iterationModeSeqentiel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlTime, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlTimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iterationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphTransButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editGraphButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoGraphButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logButton)
                .addContainerGap())
        );
        optionsControlLayout.setVerticalGroup(
            optionsControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsControlLayout.createSequentialGroup()
                .addGroup(optionsControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(optionsControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iterationModeParallel)
                        .addComponent(iterationModeSeqentiel)
                        .addComponent(optionControlTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(optionControlTimeLabel)
                        .addComponent(iterationButton)
                        .addComponent(graphTransButton)
                        .addComponent(editGraphButton)
                        .addComponent(infoGraphButton)
                        .addComponent(logButton)
                        .addComponent(validateTime)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(optionsControlLayout.createSequentialGroup()
                .addGroup(optionsControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator4)
                    .addGroup(optionsControlLayout.createSequentialGroup()
                        .addGroup(optionsControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optionControlRun)
                            .addComponent(optionControlForward)
                            .addComponent(optionControlBackward)
                            .addComponent(optionControlBegin)
                            .addComponent(optionControlEnd))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        optionsChips.setBorder(javax.swing.BorderFactory.createTitledBorder("Options Chip"));

        buttonGroup1.add(modeAddChips);
        modeAddChips.setSelected(true);
        modeAddChips.setText("+");

        buttonGroup1.add(modeRemoveChips);
        modeRemoveChips.setText("-");

        valideOptionChips.setText("Confirm");

        selectedNodeText.setEditable(false);
        selectedNodeText.setColumns(20);
        selectedNodeText.setRows(5);
        selectedNode.setViewportView(selectedNodeText);

        nbChipsLabel.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        nbChipsLabel.setText("Nb Chip");

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel2.setText("Mode");

        separator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout optionsChipsLayout = new javax.swing.GroupLayout(optionsChips);
        optionsChips.setLayout(optionsChipsLayout);
        optionsChipsLayout.setHorizontalGroup(
            optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsChipsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionsChipsLayout.createSequentialGroup()
                        .addComponent(nbChipsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNbChips, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(optionsChipsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modeAddChips)
                            .addComponent(modeRemoveChips))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedNode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valideOptionChips, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        optionsChipsLayout.setVerticalGroup(
            optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsChipsLayout.createSequentialGroup()
                .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionsChipsLayout.createSequentialGroup()
                        .addComponent(selectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valideOptionChips))
                    .addGroup(optionsChipsLayout.createSequentialGroup()
                        .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nbChipsLabel)
                            .addComponent(inputNbChips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(optionsChipsLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel2))
                            .addGroup(optionsChipsLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(optionsChipsLayout.createSequentialGroup()
                                        .addComponent(modeAddChips)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(modeRemoveChips))
                                    .addComponent(separator5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout playCFGLayout = new javax.swing.GroupLayout(playCFG);
        playCFG.setLayout(playCFGLayout);
        playCFGLayout.setHorizontalGroup(
            playCFGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playCFGLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(playCFGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playCFGLayout.createSequentialGroup()
                        .addComponent(optionsChips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(599, Short.MAX_VALUE))
                    .addGroup(playCFGLayout.createSequentialGroup()
                        .addGroup(playCFGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionsControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewGraph, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        playCFGLayout.setVerticalGroup(
            playCFGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playCFGLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(optionsControl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewGraph, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionsChips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabs.addTab("Play CFG", playCFG);

        javax.swing.GroupLayout importGraphLayout = new javax.swing.GroupLayout(importGraph);
        importGraph.setLayout(importGraphLayout);
        importGraphLayout.setHorizontalGroup(
            importGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1046, Short.MAX_VALUE)
        );
        importGraphLayout.setVerticalGroup(
            importGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        tabs.addTab("Import Graph", importGraph);

        file.setText("File");

        open.setText("Open");
        file.add(open);
        file.add(separator1);

        Save.setText("Save");
        file.add(Save);

        saveas.setText("Save As");
        file.add(saveas);
        file.add(separator2);

        import_.setText("Import from template");
        file.add(import_);
        file.add(separator3);

        quit.setText("Quit");
        file.add(quit);

        menu.add(file);

        about.setText("About");
        menu.add(about);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iterationModeParallelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iterationModeParallelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iterationModeParallelActionPerformed

    //Implémentation du pattern observer
    @Override
    public void update(Observable o, Object o1) {

        if (o1 instanceof ModelMainFrame) {
            selectedNodeText.setText(((ModelMainFrame)o1).getSelectedNode().toString());
            optionControlTime.setText(Double.toString(((ModelMainFrame)o1).getTimeExec()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenu about;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton editGraphButton;
    private javax.swing.JMenu file;
    private javax.swing.JButton graphTransButton;
    private javax.swing.JPanel importGraph;
    private javax.swing.JMenuItem import_;
    private javax.swing.JButton infoGraphButton;
    private javax.swing.JTextField inputNbChips;
    private javax.swing.JButton iterationButton;
    private javax.swing.ButtonGroup iterationMode;
    private javax.swing.JRadioButton iterationModeParallel;
    private javax.swing.JRadioButton iterationModeSeqentiel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logButton;
    private javax.swing.JMenuBar menu;
    private javax.swing.JRadioButton modeAddChips;
    private javax.swing.JRadioButton modeRemoveChips;
    private javax.swing.JLabel nbChipsLabel;
    private javax.swing.JMenuItem open;
    private javax.swing.JButton optionControlBackward;
    private javax.swing.JButton optionControlBegin;
    private javax.swing.JButton optionControlEnd;
    private javax.swing.JButton optionControlForward;
    private javax.swing.JButton optionControlRun;
    private javax.swing.JTextField optionControlTime;
    private javax.swing.JLabel optionControlTimeLabel;
    private javax.swing.JPanel optionsChips;
    private javax.swing.JPanel optionsControl;
    private javax.swing.JPanel playCFG;
    private javax.swing.JMenuItem quit;
    private javax.swing.JMenuItem saveas;
    private javax.swing.JScrollPane selectedNode;
    private javax.swing.JTextArea selectedNodeText;
    private javax.swing.JPopupMenu.Separator separator1;
    private javax.swing.JPopupMenu.Separator separator2;
    private javax.swing.JPopupMenu.Separator separator3;
    private javax.swing.JSeparator separator4;
    private javax.swing.JSeparator separator5;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JButton validateTime;
    private javax.swing.JButton valideOptionChips;
    private javax.swing.JPanel viewGraph;
    // End of variables declaration//GEN-END:variables

    public ModelMainFrame getModel() {
        return model;
    }

    public JMenuItem getSave() {
        return Save;
    }

    public JMenu getAbout() {
        return about;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JButton getEditGraphButton() {
        return editGraphButton;
    }

    public JMenu getFile() {
        return file;
    }

    public JButton getGraphTransButton() {
        return graphTransButton;
    }

    public JPanel getImportGraph() {
        return importGraph;
    }

    public JMenuItem getImport_() {
        return import_;
    }

    public JButton getInfoGraphButton() {
        return infoGraphButton;
    }

    public JTextField getInputNbChips() {
        return inputNbChips;
    }

    public JButton getIterationButton() {
        return iterationButton;
    }

    public ButtonGroup getIterationMode() {
        return iterationMode;
    }

    public JRadioButton getIterationModeParallel() {
        return iterationModeParallel;
    }

    public JRadioButton getIterationModeSeqentiel() {
        return iterationModeSeqentiel;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JMenuBar getMenu() {
        return menu;
    }

    public JRadioButton getModeAddChips() {
        return modeAddChips;
    }

    public JRadioButton getModeRemoveChips() {
        return modeRemoveChips;
    }

    public JLabel getNbChipsLabel() {
        return nbChipsLabel;
    }

    public JMenuItem getOpen() {
        return open;
    }

    public JButton getOptionControlBackward() {
        return optionControlBackward;
    }

    public JButton getOptionControlBegin() {
        return optionControlBegin;
    }

    public JButton getOptionControlEnd() {
        return optionControlEnd;
    }

    public JButton getOptionControlForward() {
        return optionControlForward;
    }

    public JButton getOptionControlRun() {
        return optionControlRun;
    }

    public JTextField getOptionControlTime() {
        return optionControlTime;
    }

    public JLabel getOptionControlTimeLabel() {
        return optionControlTimeLabel;
    }

    public JButton getValidateTime() {
        return validateTime;
    }

    public JPanel getOptionsChips() {
        return optionsChips;
    }

    public JPanel getOptionsControl() {
        return optionsControl;
    }

    public JPanel getPlayCFG() {
        return playCFG;
    }

    public JMenuItem getQuit() {
        return quit;
    }

    public JMenuItem getSaveas() {
        return saveas;
    }

    public JScrollPane getSelectedNode() {
        return selectedNode;
    }

    public JTextArea getSelectedNodeText() {
        return selectedNodeText;
    }

    public JPopupMenu.Separator getSeparator1() {
        return separator1;
    }

    public JPopupMenu.Separator getSeparator2() {
        return separator2;
    }

    public JPopupMenu.Separator getSeparator3() {
        return separator3;
    }

    public JSeparator getSeparator4() {
        return separator4;
    }

    public JSeparator getSeparator5() {
        return separator5;
    }

    public JTabbedPane getTabs() {
        return tabs;
    }

    public JButton getValideOptionChips() {
        return valideOptionChips;
    }

    public JPanel getViewGraph() {
        return viewGraph;
    }

    public JButton getLogButton() {
        return logButton;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public JPanel getpPlayCFG() {
        return playCFG;
    }
}
