select s.Staff_Name,s.Dept_Code, d.Dept_Name,s.Staff_Sal FROM Staff_Master S JOIN department_master d ON s.Dept_Code = d.Dept_Code where s.Staff_Sal > 20000;

select s.Staff_Code AS "Staff#",
s.Staff_Name AS "Staff",
d.Dept_Name,
m.Staff_Code AS "Mgr#",
m.Staff_Name AS "Manager"

FROM Staff_Master s

join department_master d

ON s.Dept_code = d.Dept_Code LEFT JOIN Staff_Master m
ON s.Mgr_Code = m.Staff_Code;

select s.Student_Code,
s.Student_Name,
d.Dept_Name,
m.Subject1,
m.Subject2,
m.Subject3 

FROM Student_Master s
JOIN Department_Master d
ON s.Dept_Code = d.Dept_Code
JOIN Student_Marks m
ON s.Student_Code = m.Student_Code
WHERE m.Subject1>=60
AND m.Subject2>=60
AND m.Subject3>=60
AND s.Dept_Code IN(10,20);

select s.Student_Code,
s.Student_Name,
b.Book_Code,
b.Book_Name 
from Student_Master s
JOIN Book_Transactions bt
ON s.Student_Code = bt.Student_Code
JOIN Book_Master b
ON bt.Book_Code = b.Book_Code
where DATE(bt.Book_expected_return_date) = CURRENT_DATE;

select * from staff_master;
update book_transactions set book_issue_date = CURRENT_DATE - INTERVAL '10 days' where staff_code = 1001;
select * from book_master;
select * from book_transactions;
update book_transactions set book_issue_date = CURRENT_DATE - INTERVAL '15 days' where book_code = 5001;
select staff_code, book_code,book_issue_date from Book_transactions;

select s.staff_code,
s.Staff_Name,
d.Dept_Name,
dg.Design_name,
b.Book_Code,
b.Book_Name,
bt.Book_Issue_date
FROM Staff_Master s
JOIN Department_Master d
ON s.dept_code = d.dept_code 
JOIN Designation_Master dg
ON s.Design_Code = dg.Design_Code
JOIN book_transactions bt
ON s.Staff_code = bt.Staff_Code
JOIN Book_Master b
ON bt.Book_Code = b.Book_Code
where bt.Book_Issue_Date>= CURRENT_DATE - INTERVAL '30 days';


