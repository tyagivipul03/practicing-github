/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author lenovo
 */
public class db1 {
    public static void main(String[] arr){
    try{
     Class.forName("org.gjt.mm.mysql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
       PreparedStatement stmt=con.prepareStatement("create database db1");
        stmt.executeUpdate();
         stmt=con.prepareStatement("use db1");
          stmt.executeUpdate();
          stmt=con.prepareStatement("create table products (pid int primary key,name varchar(20),price varchar(30),qty int)");
          stmt.executeUpdate();
          stmt=con.prepareStatement("Insert into products values(101,'computer','20000',20)");
          stmt.executeUpdate();
          
          new Frame1().setVisible(true);
}catch(Exception ee){
    System.out.print(ee);
     
          new Frame1().setVisible(true);
}
}
}
