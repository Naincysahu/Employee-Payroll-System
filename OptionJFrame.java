package employeemManagementSystem.gui;

import employeeManagementSystem.dbutil.DBUtil;
import javax.swing.JOptionPane;

public class OptionJFrame extends javax.swing.JFrame {
    public OptionJFrame() {
       
        initComponents();
       // setLocationRelaiveTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnSelectChoice = new javax.swing.JPanel();
        rbAdd = new javax.swing.JRadioButton();
        rbSearch = new javax.swing.JRadioButton();
        rbShowAll = new javax.swing.JRadioButton();
        rbQuit = new javax.swing.JRadioButton();
        btnDo = new javax.swing.JButton();
        lblChoices = new javax.swing.JLabel();
        rbDelete = new javax.swing.JRadioButton();
        rbUpdate = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnSelectChoice.setBackground(new java.awt.Color(0, 0, 0));
        pnSelectChoice.setForeground(new java.awt.Color(255, 255, 255));

        rbAdd.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbAdd);
        rbAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbAdd.setForeground(new java.awt.Color(255, 255, 255));
        rbAdd.setText("Add Employee");

        rbSearch.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbSearch);
        rbSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbSearch.setForeground(new java.awt.Color(255, 255, 255));
        rbSearch.setText("Search Employee");
        rbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSearchActionPerformed(evt);
            }
        });

        rbShowAll.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbShowAll);
        rbShowAll.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbShowAll.setForeground(new java.awt.Color(255, 255, 255));
        rbShowAll.setText("Show All Employees");
        rbShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbShowAllActionPerformed(evt);
            }
        });

        rbQuit.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbQuit);
        rbQuit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbQuit.setForeground(new java.awt.Color(255, 255, 255));
        rbQuit.setText("Quit");

        btnDo.setBackground(new java.awt.Color(0, 0, 0));
        btnDo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDo.setForeground(new java.awt.Color(255, 255, 255));
        btnDo.setText("Do Task");
        btnDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoActionPerformed(evt);
            }
        });

        lblChoices.setBackground(new java.awt.Color(0, 0, 0));
        lblChoices.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblChoices.setForeground(new java.awt.Color(255, 255, 255));
        lblChoices.setText("Select Your Choice");

        rbDelete.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbDelete);
        rbDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbDelete.setForeground(new java.awt.Color(255, 255, 255));
        rbDelete.setText("Delete Employee");

        rbUpdate.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbUpdate);
        rbUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbUpdate.setForeground(new java.awt.Color(255, 255, 255));
        rbUpdate.setText("Update Employee");

        javax.swing.GroupLayout pnSelectChoiceLayout = new javax.swing.GroupLayout(pnSelectChoice);
        pnSelectChoice.setLayout(pnSelectChoiceLayout);
        pnSelectChoiceLayout.setHorizontalGroup(
            pnSelectChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSelectChoiceLayout.createSequentialGroup()
                .addGap(0, 176, Short.MAX_VALUE)
                .addComponent(lblChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(pnSelectChoiceLayout.createSequentialGroup()
                .addGroup(pnSelectChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSelectChoiceLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnDo))
                    .addGroup(pnSelectChoiceLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(pnSelectChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbShowAll, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(rbQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSelectChoiceLayout.setVerticalGroup(
            pnSelectChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSelectChoiceLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblChoices)
                .addGap(18, 18, 18)
                .addComponent(rbAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSearch)
                .addGap(18, 18, 18)
                .addComponent(rbShowAll)
                .addGap(11, 11, 11)
                .addComponent(rbDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbQuit)
                .addGap(3, 3, 3)
                .addComponent(btnDo)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnSelectChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSelectChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void rbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSearchActionPerformed

    }//GEN-LAST:event_rbSearchActionPerformed
    private void rbShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbShowAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbShowAllActionPerformed

    private void btnDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoActionPerformed
        // TODO add your handling code here:
        if(validateInput()==false){
            JOptionPane.showMessageDialog(null,"Please Select an option first!","No Selction",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            if(rbAdd.isSelected()){
                AddJFrame add=new AddJFrame();
                add.setVisible(true);
                this.dispose();
            }
            else if(rbSearch.isSelected()){
                SearchDetailsJFrame search=new SearchDetailsJFrame();
                search.setVisible(true);
                this.dispose();
            }
            else if(rbShowAll.isSelected()){
                ViewAllJFrame viewAll=new ViewAllJFrame();
                viewAll.setVisible(true);
                this.dispose();
            }
            else if(rbDelete.isSelected()){
                DeleteJFrame delete=new DeleteJFrame();
                delete.setVisible(true);
                this.dispose();
            }
            else if(rbUpdate.isSelected()){
                UpdateJFrame update=new UpdateJFrame();
                update.setVisible(true);
                dispose();
            }
            else{ //Quitbtn
            JOptionPane.showMessageDialog(null,"Thank you for using the app","Thank You",JOptionPane.INFORMATION_MESSAGE);
            DBUtil.closeConnection();
            System.exit(0);
            }
        }
    }//GEN-LAST:event_btnDoActionPerformed
    private boolean validateInput(){
        if((rbAdd.isSelected()==true) || (rbSearch.isSelected()==true) || (rbShowAll.isSelected()==true) || (rbQuit.isSelected()==true) || (rbDelete.isSelected()==true) || (rbUpdate.isSelected()==true))
            return true;
        return false;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblChoices;
    private javax.swing.JPanel pnSelectChoice;
    private javax.swing.JRadioButton rbAdd;
    private javax.swing.JRadioButton rbDelete;
    private javax.swing.JRadioButton rbQuit;
    private javax.swing.JRadioButton rbSearch;
    private javax.swing.JRadioButton rbShowAll;
    private javax.swing.JRadioButton rbUpdate;
    // End of variables declaration//GEN-END:variables

}
