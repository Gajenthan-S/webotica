/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author KD1999
 */

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
        Connection conn = DriverManager.getConnection(("jdbc:sqlserver://localhost;user=webotica;password=@123;database=admindb"));
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
   
}
/**
 *
 *
 */
