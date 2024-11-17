package employeemManagementSystem.gui;

import javax.swing.JOptionPane;
import java.sql.*;
import static employeeManagementSystem.dao.EmployeeDAO.findEmpById ;
import employeeManagementSystem.pojo.Employee;

public class SearchDetailsJFrame extends javax.swing.JFrame {
    public SearchDetailsJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnSearchEmpDetails = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblNo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSal = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnSearchEmpDetails.setBackground(new java.awt.Color(0, 0, 0));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Search Employee Details");

        lblNo.setBackground(new java.awt.Color(0, 0, 0));
        lblNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNo.setForeground(new java.awt.Color(255, 255, 255));
        lblNo.setText("EmpNo");

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("EmpName");

        lblSal.setBackground(new java.awt.Color(0, 0, 0));
        lblSal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSal.setForeground(new java.awt.Color(255, 255, 255));
        lblSal.setText("EmpSal");

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnSearchEmpDetailsLayout = new javax.swing.GroupLayout(pnSearchEmpDetails);
        pnSearchEmpDetails.setLayout(pnSearchEmpDetailsLayout);
        pnSearchEmpDetailsLayout.setHorizontalGroup(
            pnSearchEmpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSearchEmpDetailsLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(pnSearchEmpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSearchEmpDetailsLayout.createSequentialGroup()
                        .addGroup(pnSearchEmpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblSal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(pnSearchEmpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtSal)))
                    .addGroup(pnSearchEmpDetailsLayout.createSequentialGroup()
                        .addComponent(lblNo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtNo))
                    .addGroup(pnSearchEmpDetailsLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(22, 22, 22)))
                .addGap(96, 96, 96))
            .addGroup(pnSearchEmpDetailsLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSearchEmpDetailsLayout.setVerticalGroup(
            pnSearchEmpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSearchEmpDetailsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle)
                .addGap(31, 31, 31)
                .addGroup(pnSearchEmpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSearchEmpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnSearchEmpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSal)
                    .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnSearchEmpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSearch))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSearchEmpDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSearchEmpDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
       
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        OptionJFrame optionframe=new OptionJFrame();
        optionframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        txtSal.setText("");
        txtName.setText("");
        txtName.requestFocus();
        String no=txtNo.getText().trim();  //validateInput
        if(no.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please input employee number.","ERROR!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            int empNo=Integer.parseInt(no);
            Employee emp=findEmpById(empNo);
            if(emp.getEmpName()==null && emp.getEmpSal()==0.0){
                JOptionPane.showMessageDialog(null,"No record of emp id: "+empNo+" present","Record not found",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            txtName.setText(emp.getEmpName());
            txtSal.setText("".valueOf(emp.getEmpSal()));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Please input numeric data.","ERROR!",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"DB Error","ERROR!",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDetailsJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblSal;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnSearchEmpDetails;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtSal;
    // End of variables declaration//GEN-END:variables
}
