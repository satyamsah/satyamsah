
# Employee-Department-Salary Service
## Description
It is microservice architecture using 3 service. In this project we are assuming that an employee working in a department will have same salary as the other employee working in the same department with same designation.So we can fetch the salary of the employee using the mapping of department and employee :
1) # onboarding an employee service: It is used to register an employee . It is written is java-spring
2) # department-salary service: It is use to invoke POST operation to create a table. It will have department, designation and salary. So that a specific department haing a specific designation will have a unique salary. It is written in python
3) # getting the salary of an employee service: While entering the employee Id you will get the salary of that employee.Its starting point is java-spring which is calling a service in node-js service to retrive the information of salary


Pre- requisite 
1.install java 8 using this [link](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.htmlm)
2.install [mysql](https://dev.mysql.com/downloads/mysql/)
4. create the 2 databases for employee and salaryslab using the sql script:
a.create-employee.sql
b.create-salaryslab.sql
3. install [python3](https://www.python.org/downloads/)
4. install [pip](https://pip.pypa.io/en/stable/installing/)
5. run "pip install flask" to install flask
6.cd to the node js microservice  in your machine
a.type "node server.js" 
5.cd to the python microservice/salarymicroservice
a. type python salary.py"
8. run the specified jar using java -jar *.jar

--- 

1. create an employee

http://localhost:8080/demo/add

name
gender
dept
designation

2. create a salary slab
http://localhost:5002/addSalarySlab
designation
dept
pay

3. get the salary of an employee


http://localhost:8080/employee/findSalary?id=1

it will redirect it to 

http://localhost:3000/getAllSalarySlab/IT/developer1




5.run the jar 
6.do 
