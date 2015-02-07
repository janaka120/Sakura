/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;
import java.sql.Connection;
import javax.swing.JOptionPane;
import model.DBConnection;
import model.DBHandel;
import model.add_customer_model;
/**
 *
 * @author janaka
 */
public class customer_controler {
    public static void add_customer(add_customer_model a){
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
}
