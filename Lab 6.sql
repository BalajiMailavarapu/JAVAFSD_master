create function addnumbers(a int,b int)
returns int 
as $$ 
BEGIN 
return a+b;
END;
$$ language plpgsql;

select addnumbers(100,300);

create function multiplynumbers(a int,b int)
returns int 
as $$ 
BEGIN 
return a*b;
END;
$$ language plpgsql;


select multiplynumbers(100,300);

create function get_sum(a int, b int, out total int)
as $$
BEGIN 
total:=a+b;
END;
$$ language plpgsql;

select * from get_sum(4,10);

create function incrementvalue(INOUT a int)
as $$
BEGIN
a:=a+1;
END;
$$ language plpgsql;

select * from incrementvalue(2);

create function greet(name TEXT default 'Hello')
returns TEXT
as $$
BEGIN 
RETURN name;
END;
$$ language plpgsql;

select greet();

select * from employees3;

create function get_emp()
returns table(empid int,empname varchar)
as $$
BEGIN 
RETURN QUERY select emp_id,emp_name from employees3;
END;
$$ language plpgsql;

select * from get_emp();

create table stud(id int, name TEXT);

create procedure add_stud1(sid int, sname TEXT)

Language plpgsql
AS $$
BEGIN 
INSERT INTO STUD VALUES(sid,sname);
END;
$$;

call add_stud1(1,'Ravi');
select * from stud;

call add_stud1(2,'Sowmya');

select * from stud;

create procedure update_stud1()

Language plpgsql
AS $$
DECLARE
s_id INT;
BEGIN
select id into s_id from stud where name = 'Ravi';
update stud set name = 'Tanvi' where id = s_id;
END;
$$;

CALL update_stud1();

select * from stud;

create table accounts(id int, name TEXT,balance numeric);

insert into accounts values(1, 'Uma',50000), (2,'Swati',60000);

select * from accounts;

BEGIN;
UPDATE accounts set balance= balance-2000
where id=1;

UPDATE accounts set balance = balance+2000
where id=2;

select * from accounts;
commit;
rollback;

BEGIN;

UPDATE account set balance = balance+2000 where id=2;

savepoint sp1;
UPDATE account set balance = balance-2000 where id=1;

rollback to savepoint sp1;

commit;

select * from accounts;

rollback;

---Lab 6-------
create table CUSTOMER(customer_id INT PRIMARY KEY,
customer_name VARCHAR(50),
address VARCHAR(100),
gender CHAR(1),
age INT,
phone_number BIGINT,
salary NUMERIC(10,2)
);

delete from CUSTOMER; 

select * from Customer;

BEGIN; 
INSERT INTO CUSTOMER VALUES(6000,'John','#115 Chicago','M',25,7878776,10000);
INSERT INTO CUSTOMER VALUES(6001, 'Jack','#116 France','M',25,434524,20000);
INSERT INTO CUSTOMER VALUES(6002, 'James','#114 New York','M',45,431524,15000.50);
Savepoint sp1;
select * from customer;
INSERT INTO CUSTOMER VALUES(6003, 'John','#114 Chicago','M',45,439525,19000.60);

ROLLBACK to sp1;























