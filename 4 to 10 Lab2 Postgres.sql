select * from staff_master;


select count(*) from staff_master;

select sum(staff_sal) from staff_master;
select avg(staff_sal) from staff_master;

select max(staff_sal) from staff_master;

select min(staff_sal) from staff_master;

select dept_code,sum(staff_sal) as TotalSalary from staff_master GROUP BY dept_code having sum(staff_sal)>50000;

select dept_code,count(*) as employeecount from staff_master group by dept_code;

select trunc(12.9876,3)

select round(12.9878)

select ceil(12.3)

select floor(12.9)

select abs(-25)

select power(2,3)

select sqrt(64)

select sign(-15)

select LOWER("HELLO");

select upper('hello');

select INITCAP('Today is friday');

select concat('hello', '  ', 'hi');

select SUBSTRING('Postgressql', 1,4);

SELECT LTRIM('     Hello');

SELECT RTRIM('     Hello     ');

select TRIM('    Hello    ');

select length('Postgressql');


select replace('Java programming', 'Java', 'python');

select LPAD('Hi',10, '*');

select RPAD('Hi',10, '*');

select POSITION('g' IN 'Postgres');

select current_date+interval '2 months'

select age('2026-05-15', '01-01-2000');

select (date_trunc(month,current_date+interval  '1 month - 1 day '))

select current_date;

select current_timestamp;

select extract(month from current_date);

select extract(day from current_date);

select extract(year from current_date);

select date_trunc('month', current_timestamp);

select date_trunc('year' , current_timestamp);

select to_char(current_date,'DD-MM-YYYY');

select to_date('15-05-2026', 'DD-MM-YYYY');

select to_number('123456.67', '9999');

select to_timestamp('15-05-2026 10:30:45','DD-MM-YYYY  HH24-MI-SS');

select * from Staff_Master where (Staff_Name LIKE 'A%S' OR Staff_Name LIKE 'A%N')
OR
(
(Staff_Name LIKE '_N%' OR Staff_Name LIKE '_N%') AND (Staff_Name LIKE '%N' OR Staff_Name LIKE '%S')
);

select Staff_Name from Staff_Master where Staff_Name like '%\_%' escape '\';


select Staff_name,LPAD(Staff_sal::text , 15, '$') AS formatted_salary from Staff_Master;

select Student_Name, TO_CHAR(Student_dob, 'FMMonth  DD, YYYY') AS formatted_dob from Student_Master 
where extract(dow from Student_dob) IN (0,6);


select Staff_Name, ROUND(EXTRACT(YEAR FROM AGE(CURRENT_DATE,HireDate)) *12 + EXTRACT(MONTH FROM AGE(CURRENT_DATE, HireDate))) AS "months worked" from Staff_master ORDER BY "months worked";