package employeeManagementSystem.dao;
import employeeManagementSystem.dbutil.DBUtil;
import employeeManagementSystem.pojo.Employee;
import java.sql.*;
import java.util.ArrayList;
public class EmployeeDAO {
    public static boolean addEmp(Employee e) throws SQLException{
        Connection conn=DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("INSERT INTO Employees VALUES(?,?,?)");
        ps.setInt(1, e.getEmpNo());
        ps.setString(2, e.getEmpName());
        ps.setDouble(3, e.getEmpSal());
        int rowsAffected=ps.executeUpdate();
        return rowsAffected>0;
    }
    public static Employee findEmpById(int empNo) throws SQLException{
        Connection conn=DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("SELECT * FROM Employees WHERE empNo=?");
        ps.setInt(1,empNo);
        ResultSet rs=ps.executeQuery();
        Employee e=new Employee();
        if(rs.next()){
            e.setEmpNo(rs.getInt(1));
            e.setEmpName(rs.getString(2));
            e.setEmpSal(rs.getDouble(3));
        }
        return e;
    }
    public static ArrayList<Employee> getAllEmp() throws SQLException{
        Connection conn=DBUtil.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM Employees");
        ArrayList<Employee> list=new ArrayList<>();
        while(rs.next()==true){
            Employee e=new Employee();
            e.setEmpNo(rs.getInt(1));
            e.setEmpName(rs.getString(2));
            e.setEmpSal(rs.getDouble(3));
            list.add(e);
        }
        return list;
        
    }
    public static boolean deleteEmp(int empNo) throws SQLException{
        Connection conn=DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("DELETE FROM Employees WHERE EmpNo=?");
        ps.setInt(1, empNo);
        int rowsAffected=ps.executeUpdate();
        if(rowsAffected>0){
            return true;
        }
        return false;
    }
    /*public static Employee updateEmp(int empNo) throws SQLException{
        Connection conn=DBUtil.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE Employees SET EmpName=?,EmpSal=? WHERE EmpNo=?");
        
        ps.setString(1, );
    }*/
}
