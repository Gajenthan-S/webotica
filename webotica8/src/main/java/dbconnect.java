


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.mail.MessagingException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KD1999
 */
public class dbconnect {
    public void Connector2(String no1) throws SQLException, MessagingException{
        Connection conn = DriverManager.getConnection(("jdbc:sqlserver://localhost;user=webotica;password=@123;database=admindb"));
        Statement sta = conn.createStatement();
        System.out.println(no1);
        String Sql = "select * from Repair_Job where Job_Number ='" + no1 + "'";

        ResultSet rs = sta.executeQuery(Sql);
        while (rs.next()) {
           String Progress  = rs.getString(8);
           String JobNumber = rs.getString(1);
           String Mail=rs.getString(4);
           String done ="DONE";
           if (done.equals(Progress)){
               Sendmail se = new Sendmail();
               se.send2(Mail,JobNumber);
           }
           
        }
    }
    
   
    public void Connector3(String no2) throws SQLException, MessagingException{
        Connection conn = DriverManager.getConnection(("jdbc:sqlserver://localhost;user=webotica;password=@123;database=admindb"));
        Statement sta = conn.createStatement();
        System.out.println(no2);
        String Sql = "select * from Restoration_Job where RESJob_Number  ='" + no2 + "'";

        ResultSet rs = sta.executeQuery(Sql);
        while (rs.next()) {
           String resProgress  = rs.getString(8);
           String RESJob_Number  = rs.getString(1);
           String resMail=rs.getString(4);
           String done ="DONE";
           if (done.equals(resProgress)){
               Sendmail se = new Sendmail();
               se.send3(resMail,RESJob_Number );
           }
           
        }
    }
}
