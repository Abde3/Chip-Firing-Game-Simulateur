/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import core.PatternUpdate;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.ModelIteration;

public class ViewIteration extends javax.swing.JFrame implements Observer {
    private ModelIteration model;

    /**
     * Creates new form ViewIteration
     */
    public ViewIteration() {
        initComponents();
    }

    public ViewIteration(ModelIteration modelIteration) {
        initComponents();
        this.model = modelIteration;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setIterationPanel = new javax.swing.JPanel();
        inputPattern = new javax.swing.JFormattedTextField();
        buttonValidate = new javax.swing.JButton();
        stateTextField = new javax.swing.JTextField();
        currentIterationPanel = new javax.swing.JPanel();
        currentIterationTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        setIterationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Set iteration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 2, 10))); // NOI18N

        inputPattern.setFont(new java.awt.Font("Ubuntu", 2, 12)); // NOI18N

        buttonValidate.setText("Validate");

        stateTextField.setEditable(false);
        stateTextField.setBackground(java.awt.Color.lightGray);

        javax.swing.GroupLayout setIterationPanelLayout = new javax.swing.GroupLayout(setIterationPanel);
        setIterationPanel.setLayout(setIterationPanelLayout);
        setIterationPanelLayout.setHorizontalGroup(
            setIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setIterationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPattern)
                    .addGroup(setIterationPanelLayout.createSequentialGroup()
                        .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(buttonValidate)))
                .addContainerGap())
        );
        setIterationPanelLayout.setVerticalGroup(
            setIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setIterationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPattern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(setIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonValidate))
                .addGap(24, 24, 24))
        );

        currentIterationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current ieration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 2, 10))); // NOI18N

        currentIterationTextField.setEditable(false);
        currentIterationTextField.setBackground(java.awt.Color.lightGray);

        javax.swing.GroupLayout currentIterationPanelLayout = new javax.swing.GroupLayout(currentIterationPanel);
        currentIterationPanel.setLayout(currentIterationPanelLayout);
        currentIterationPanelLayout.setHorizontalGroup(
            currentIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentIterationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentIterationTextField)
                .addContainerGap())
        );
        currentIterationPanelLayout.setVerticalGroup(
            currentIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentIterationPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(currentIterationTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setIterationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentIterationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setIterationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentIterationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getButtonValidate() {
        return buttonValidate;
    }

    public JPanel getCurrentIterationPanel() {
        return currentIterationPanel;
    }

    public JTextField getCurrentIterationTextField() {
        return currentIterationTextField;
    }

    public JFormattedTextField getInputPattern() {
        return inputPattern;
    }

    public JPanel getSetIterationPanel() {
        return setIterationPanel;
    }

    public JTextField getStateTextField() {
        return stateTextField;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonValidate;
    private javax.swing.JPanel currentIterationPanel;
    private javax.swing.JTextField currentIterationTextField;
    private javax.swing.JFormattedTextField inputPattern;
    private javax.swing.JPanel setIterationPanel;
    private javax.swing.JTextField stateTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        if (o1 instanceof String) {
            getStateTextField().setText((String)o1);
        } else if (o1 instanceof PatternUpdate) {
            getCurrentIterationTextField().setText(((PatternUpdate)o1).getOrderedPartionText());
        }
    }
}