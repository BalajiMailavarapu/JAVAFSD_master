CREATE TABLE employees3 (
    emp_id SERIAL PRIMARY KEY,
    emp_name VARCHAR(100),
    email VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE PRECISION,
    dept_id INT
);

INSERT INTO employees3 (emp_name, email, department, salary, dept_id)
VALUES ('BALAJI', 'balaji@example.com', 'IT', 55000.00, 101);

INSERT INTO employees3 (emp_name, email, department, salary, dept_id)
VALUES ('GOWTHAMI', 'gowthami@example.com', 'HR', 48000.00, 102);

emp_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY
