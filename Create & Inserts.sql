CREATE TABLE Staff_Master (
    Staff_Code   INT PRIMARY KEY,
    Staff_Name   VARCHAR(100),
    Dept_Code    INT,
    Design_Code  VARCHAR(50),
    Staff_Sal    DECIMAL(10,2),
    HireDate     DATE,
    Mgr_Code     INT
);

CREATE TABLE Student_Master (
    Student_Code INT PRIMARY KEY,
    Student_Name VARCHAR(100),
    Dept_Code    INT,
    Student_DOB  DATE
);

CREATE TABLE Book_Master (
    Book_Code     INT PRIMARY KEY,
    Book_Name     VARCHAR(200),
    Book_Pub_Year INT,
    Author_Name   VARCHAR(100)
);


INSERT INTO Staff_Master 
(Staff_Code, Staff_Name, Dept_Code, Design_Code, Staff_Sal, HireDate, Mgr_Code)
VALUES
(101, 'Ravi Kumar', 10, 'D001', 45000.00, '2005-06-15', NULL),
(102, 'Anita Sharma', 30, 'D002', 55000.00, '2010-03-20', 101),
(103, 'Sunil Mehta', 20, 'D003', 60000.00, '2000-11-10', NULL),
(104, 'Priya Singh', 10, 'D004', 47000.00, '2012-09-05', 102);

INSERT INTO Student_Master 
(Student_Code, Student_Name, Dept_Code, Student_DOB)
VALUES
(201, 'Amit Verma', 10, '1981-05-12'),
(202, 'Neha Gupta', 20, '1982-07-23'),
(203, 'Rajesh Khanna', 30, '1983-03-15'),
(204, 'Meena Joshi', 10, '1980-12-01');

INSERT INTO Book_Master 
(Book_Code, Book_Name, Book_Pub_Year, Author_Name)
VALUES
(301, 'Computer Basics & Applications', 2002, 'Dr. S. Rao'),
(302, 'Advanced COMP Programming', 2004, 'K. Sharma'),
(303, 'COMP Networks Essentials', 2001, 'R. Mehta'),
(304, 'Mathematics & Logic', 2003, 'P. Singh');


CREATE TABLE Department_Master (
    Dept_Code   INT PRIMARY KEY,
    Dept_Name   VARCHAR(100)
);


CREATE TABLE Designation_Master (
    Design_Code VARCHAR(50) PRIMARY KEY,
    Design_Name VARCHAR(100)
);


CREATE TABLE Student_Marks (
    Student_Code INT PRIMARY KEY,
    Subject1     INT,
    Subject2     INT,
    Subject3     INT,
    FOREIGN KEY (Student_Code) REFERENCES Student_Master(Student_Code)
);


CREATE TABLE Book_Transactions (
    Transaction_ID INT PRIMARY KEY,
    Student_Code   INT,
    Staff_Code     INT,
    Book_Code      INT,
    Book_Issue_Date DATE,
    Book_Expected_Return_Date DATE,
    FOREIGN KEY (Student_Code) REFERENCES Student_Master(Student_Code),
    FOREIGN KEY (Staff_Code) REFERENCES Staff_Master(Staff_Code),
    FOREIGN KEY (Book_Code) REFERENCES Book_Master(Book_Code)
);

INSERT INTO Book_Master (Book_Code, Book_Name, Book_Pub_Year, Author_Name) VALUES
(301, 'Computer Basics & Applications', 2002, 'Dr. S. Rao'),
(302, 'Advanced COMP Programming', 2004, 'K. Sharma'),
(303, 'COMP Networks Essentials', 2001, 'R. Mehta'),
(304, 'Mathematics & Logic', 2003, 'P. Singh');


