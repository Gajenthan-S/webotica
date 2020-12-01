/*
create table Login(
Username varchar(20) primary key,
Password varchar(20)
)
insert into Login values('Admin','@123')

create table Supplier(
Supplier_ID varchar(20) primary key,
Name varchar(30),
Address varchar(50),
Contact_Number varchar(20),
Email_Address varchar(50),
NIC varchar(20),
Due_Date varchar(20)
)

create table Spare_Parts(
Item_ID varchar(20) primary key,
Supplier_ID varchar(20),
Item_Name varchar(20),
Brand varchar(20),
Quantity int,
Cost_Price int,
Selling_Price int,
Country varchar(20),
Warrenty varchar(20),
In_Stock int,
constraint FK foreign key (Supplier_ID) references Supplier (Supplier_ID)
)

create table Employees(
Employee_ID varchar(10) primary key,
Name varchar(20),
Address varchar(20),
Mail_Address varchar(20),
Job_Category varchar(20),
Salary int,
Job_Assigned varchar(10),
Contact_Number int,
NIC int,
Age int
)
create table Repair_Job(
Job_Number varchar(10) primary key,
Vehicle_Number varchar(10),
Customer_Name varchar(20),
Mail_Address varchar(40),
Contact_Number varchar(20),
Repair varchar(20),
Spare_Part varchar(15),
Progress varchar(20),
SparePart_Price int,
Repair_Price int,
Total_Amount int,
Employee_ID varchar(10) 
)

create table Restoration_Job(
RESJob_Number varchar(10) primary key,
Vehicle_Number varchar(10),
Customer_Name varchar(20),
Mail_Address varchar(40),
Contact_Number varchar(20),
Repair varchar(20),
Spare_Part varchar(15),
Progress varchar(20),
SparePart_Price int,
Repair_Price int,
Total_Amount int,
Employee_ID varchar(10)
)

*/