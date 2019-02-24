Create Table Customer(
CustID int Primary Key,
CustName Varchar(25) not null,
Account_Type Varchar(25) not null,
Account_No Varchar(25) not null,
ManagerID int references Manager(ManagerID)
);



INSERT INTO Customer Values(2,'Ram','Current','12398',102);
Select * from Customer;
Create Table Manager(
ManagerID INT Primary Key,
ManagerName Varchar(25) not null,
Branch Varchar(25) not null
);

INSERT INTO Manager Values(101,'Ranjan','HDFC');
INSERT INTO Manager Values(102,'Sema','SBI');

Select * from Manager;
Select * from Customer c left join Manager m on c.ManagerID = m.ManagerID;