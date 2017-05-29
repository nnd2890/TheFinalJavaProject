/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.DaoModel;

/**
 *
 * @author nnd2890
 */
public class AdminController {
//    // Login
//    public static void Login(AdminController admin){
//        try {
//           Statement statement = DaoModel.getConnection().createStatement();
//           String query = "select * from managelibrary ";
//           ResultSet rs = statement.executeQuery(query);
//           while (rs.next()) {
//                if (true) {
//                   
//               }
//            }
//        } catch (SQLException e) {
//            System.err.println("Lỗi khi select.");
//        }
//    }
    public static void listAmin(){
        try {
           Statement statement = DaoModel.getConnection().createStatement();
           String query = "select * from admin ";
           ResultSet rs = statement.executeQuery(query);
           while (rs.next()) {
                
                String account = rs.getString("account");
                System.out.format("|  %s  |", account);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        AdminController.listAmin();
    }
   
}
