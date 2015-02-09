/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DBConnection;
import model.DBHandel;
import model.customer_model;
/**
 *
 * @author janaka
 */
public class customer_controler {
    public static void add_customer(customer_model a){
        try{
            Connection connection=DBConnection.getConnection();
            String add_customer_quary="INSERT INTO customer VALUES ('"+a.getCustID()+" ',' "+a.getCustName()+" ',' "+a.getCustAddress()+" ',' "+a.getCustContect()+"')";
            int res = DBHandel.setData(connection, add_customer_quary);
            
            if(res !=0){
                JOptionPane.showMessageDialog(null, "Customer added successfully");
            } 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Customer Adding Fail");
        }
    }
    
    public static ArrayList<customer_model> get_customer_details(String name) throws ClassNotFoundException, SQLException, Exception{
        
        String get_customer_sql="SELECT * FROM customer WHERE cust_name LIKE '% "+ name + "%'";
        Connection connection=DBConnection.getConnection();
        ResultSet resultSet=DBHandel.getData(connection, get_customer_sql);
        ArrayList<customer_model> arrayList=new ArrayList<customer_model>();
        //System.out.println((String)resultSet.getString(1));
        while(resultSet.next()){
            String custID=resultSet.getString(1);
            String cust_name=resultSet.getString(2);
            String cust_address=resultSet.getString(3);
            String cust_contect=resultSet.getString(4);
            //System.out.println(cust_name);
            customer_model cust_model=new customer_model(custID, cust_name, cust_address, cust_contect);
            arrayList.add(cust_model);
        }
        return arrayList;
    }
    
    public static void update_customer_details(customer_model cm){
        try{
            Connection connection=DBConnection.getConnection();
            String update_customer_quary="UPDATE customer SET cust_name='"+cm.getCustName()+"' , cust_address='"+cm.getCustAddress()+"' , cust_contect='"+cm.getCustContect()+"' WHERE cust_id='"+cm.getCustID()+"' ";
            int res = DBHandel.setData(connection, update_customer_quary);
            
            if(res !=0){
                JOptionPane.showMessageDialog(null, "Customer Updated successfully");
            } 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Customer Update Fail");
        }
    }
    
        public static void remove_customer_details(customer_model cm){
        try{
            Connection connection=DBConnection.getConnection();
            String remove_customer_quary="DELETE FROM customer WHERE cust_id='"+cm.getCustID()+"'";
            int res = DBHandel.setData(connection, remove_customer_quary);
            
            if(res !=0){
                JOptionPane.showMessageDialog(null, "Customer Removed successfully");
            } 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Customer Remove Fail");
        }
    }
    
    
}