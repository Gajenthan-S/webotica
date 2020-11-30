/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

/**
 *
 * @author KD1999
 */
import DatabaseLayer.JavaConnect;
import FrontEnd.checkStock;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.mail.MessagingException;

public class DatabaseConnector {

    private Connection databaseConnection = null;
    String mail, prtname, suppno;
    int quan;

    public void Connector(String itmno) throws SQLException, MessagingException {
        Connection conn = JavaConnect.ConnectDB();
        Statement sta = conn.createStatement();
        System.out.println(itmno);
        String Sql = "select * from Spare_Parts where Item_ID='" + itmno + "'";

        ResultSet rs = sta.executeQuery(Sql);
        while (rs.next()) {
            suppno = rs.getString(2);
            System.out.println(suppno);
            prtname = rs.getString(3);
            System.out.println(prtname);
            //System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
            quan = rs.getInt(10);
            System.out.println(quan);
        }
        String Sql1 = "select * from Supplier where Supplier_Id='" + suppno + "'";
        ResultSet rs1 = sta.executeQuery(Sql1);
        while (rs1.next()) {

            mail = rs1.getString(5);
            System.out.println(mail);

        }
        conn.close();

        checkStock cs = new checkStock();
        cs.getstock(quan, mail, prtname);

    }
    
    /**
     *
     * @param no1
     */
    public void Connector2(String no1) throws SQLException, MessagingException{
        Connection conn = JavaConnect.ConnectDB();
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
               sendEmail se = new sendEmail();
               se.send2(Mail,JobNumber);
           }
           /* suppno = rs.getString(2);
            System.out.println(suppno);
            prtname = rs.getString(3);
            System.out.println(prtname);
            //System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
            quan = rs.getInt(10);
            System.out.println(quan);*/
        }
    }
    
   
    public void Connector3(String no2) throws SQLException, MessagingException{
        Connection conn = JavaConnect.ConnectDB();
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
               sendEmail se = new sendEmail();
               se.send3(resMail,RESJob_Number );
           }
           /* suppno = rs.getString(2);
            System.out.println(suppno);
            prtname = rs.getString(3);
            System.out.println(prtname);
            //System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
            quan = rs.getInt(10);
            System.out.println(quan);*/
        }
    }
    
}
/**
 *
 *
 */
