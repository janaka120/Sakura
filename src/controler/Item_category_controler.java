/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.Connection;
import javax.swing.JOptionPane;
import model.DBConnection;
import model.DBHandel;
import model.add_item_category_model;

/**
 *
 * @author Kasun
 */
public class Item_category_controler {
    
    public static void addItemCategory(add_item_category_model c) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO item_catagery  VALUES ('" + c.getId() + "','" + c.getType() + "','" + c.getDescription() + "')";
            int res = DBHandel.setData(con, query);

            if (res != 0) {
                JOptionPane.showMessageDialog(null, "Category added successfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Adding Fail");
            e.printStackTrace();
        }
    }
    
}
