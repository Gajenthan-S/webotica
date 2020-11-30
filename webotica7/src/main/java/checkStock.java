/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.mail.MessagingException;
/**
 *
 * @author KD1999
 */
public class checkStock {
    
  /*  public void item () throws SQLException, MessagingException {
    Scanner cs = new Scanner(System.in);
    System.out.println("Enter item number");
    int itm = cs.nextInt();
    DatabaseConnector dc = new DatabaseConnector();
    dc.Connector(itm);
    
    
}*/
    public void getstock(int quantity,String email,String prtname) throws MessagingException{
        System.out.println(quantity);
        if (quantity<5){
            sendEmail se = new sendEmail();
            se.send(email,prtname);
        }
        
    }
}
