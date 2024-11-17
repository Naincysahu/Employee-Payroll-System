package employeemManagementSystem.gui;

import employeeManagementSystem.dao.EmployeeDAO;
import employeeManagementSystem.pojo.Employee;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddJFrame extends javax.swing.JFrame {
    public AddJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnAddNewEmp = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSal = new javax.swing.JTextField();
        lblNo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnAddNewEmp.setBackground(new java.awt.Color(0, 0, 0));

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Emp");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Add New Employee");

        txtNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtSal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

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

        javax.swing.GroupLayout pnAddNewEmpLayout = new javax.swing.GroupLayout(pnAddNewEmp);
        pnAddNewEmp.setLayout(pnAddNewEmpLayout);
        pnAddNewEmpLayout.setHorizontalGroup(
            pnAddNewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAddNewEmpLayout.createSequentialGroup()
                .addGroup(pnAddNewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAddNewEmpLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnAdd)
                        .addGap(83, 83, 83)
                        .addComponent(btnBack))
                    .addGroup(pnAddNewEmpLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(pnAddNewEmpLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(pnAddNewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNo, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnAddNewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNo)
                    .addComponent(txtName)
                    .addComponent(txtSal, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        pnAddNewEmpLayout.setVerticalGroup(
            pnAddNewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAddNewEmpLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnAddNewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnAddNewEmpLayout.createSequentialGroup()
                        .addGroup(pnAddNewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNo))
                        .addGap(18, 18, 18)
                        .addGroup(pnAddNewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(pnAddNewEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnBack))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnAddNewEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnAddNewEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        OptionJFrame optionframe=new OptionJFrame();
        optionframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(!validateInput()){
            JOptionPane.showMessageDialog(null, "Please fill all the details","Incomplete details",JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        try{
            String empNo=txtNo.getText().trim();
            String empName= txtName.getText().trim();
            String empSal=txtSal.getText().trim();
            
            int no=Integer.parseInt(empNo);
            double sal=Double.parseDouble(empSal);
            Employee emp=new Employee();
            emp.setEmpNo(no);
            emp.setEmpName(empName);
            emp.setEmpSal(sal);
            boolean result=EmployeeDAO.addEmp(emp);
            if(result){
                JOptionPane.showMessageDialog(null, "Record added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Could not insert record. TRY Again!","Try Again",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please fill numeric data","ERROR!",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "DB Error!","ERROR!",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed
    private boolean validateInput(){
        if((txtNo.getText().trim().isEmpty()) || (txtName.getText().trim().isEmpty()) || (txtSal.getText().trim().isEmpty())){ //trim()=remove extra spaces from string
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblSal;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnAddNewEmp;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtSal;
    // End of variables declaration//GEN-END:variables
}
