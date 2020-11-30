/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gajenthan
 */
public class Repair_Job {

    String Job_Number;
    String Vehicle_Number;
    String Customer_Name;
    String Mail_Address;
    String Contact_Number;
    String Repair;
    String Spare_Part;
    String Progress;
    int SparePart_Price;
    int Repair_Price;
    int Total_Amount;
    String Employee_ID;

    public Repair_Job(String Job_Number, String Vehicle_Number, String Customer_Name, String Mail_Address, String Contact_Number, String Repair, String Spare_Part, String Progress, int SparePart_Price, int Repair_Price, int Total_Amount, String Employee_ID) {
        this.Job_Number = Job_Number;
        this.Vehicle_Number = Vehicle_Number;
        this.Customer_Name = Customer_Name;
        this.Mail_Address = Mail_Address;
        this.Contact_Number = Contact_Number;
        this.Repair = Repair;
        this.Spare_Part = Spare_Part;
        this.Progress = Progress;
        this.SparePart_Price = SparePart_Price;
        this.Repair_Price = Repair_Price;
        this.Total_Amount = Total_Amount;
        this.Employee_ID = Employee_ID;
    }

    public String getJob_Number() {
        return Job_Number;
    }

    public String getVehicle_Number() {
        return Vehicle_Number;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public String getMail_Address() {
        return Mail_Address;
    }

    public String getContact_Number() {
        return Contact_Number;
    }

    public String getRepair() {
        return Repair;
    }

    public String getSpare_Part() {
        return Spare_Part;
    }

    public String getProgress() {
        return Progress;
    }

    public int getSparePart_Price() {
        return SparePart_Price;
    }

    public int getRepair_Price() {
        return Repair_Price;
    }

    public int getTotal_Amount() {
        return Total_Amount;
    }

    public String getEmployee_ID() {
        return Employee_ID;
    }

    public void setJob_Number(String Job_Number) {
        this.Job_Number = Job_Number;
    }

    public void setVehicle_Number(String Vehicle_Number) {
        this.Vehicle_Number = Vehicle_Number;
    }

    public void setCustomer_Name(String Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public void setMail_Address(String Mail_Address) {
        this.Mail_Address = Mail_Address;
    }

    public void setContact_Number(String Contact_Number) {
        this.Contact_Number = Contact_Number;
    }

    public void setRepair(String Repair) {
        this.Repair = Repair;
    }

    public void setSpare_Part(String Spare_Part) {
        this.Spare_Part = Spare_Part;
    }

    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    public void setSparePart_Price(int SparePart_Price) {
        this.SparePart_Price = SparePart_Price;
    }

    public void setRepair_Price(int Repair_Price) {
        this.Repair_Price = Repair_Price;
    }

    public void setTotal_Amount(int Total_Amount) {
        this.Total_Amount = Total_Amount;
    }

    public void setEmployee_ID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

}
