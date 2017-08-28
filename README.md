
# Employee-Department-Salary Service
## Description
It is microservice architecture using 3 service. In this project we are assuming that an employee working in a department will have same salary as the other employee working in the same department with same designation.So we can fetch the salary of the employee using the mapping of department and employee :
1) #### [onboarding an employee service](https://github.com/satyamsah/microservice/tree/master/employee-onboard-service-javaspring): 
   It is used to register an employee . It is written is java-spring
2) #### [department-salary service](https://github.com/satyamsah/microservice/tree/master/create-deptmentandsalary-service-python):
   It is use to invoke POST operation to create a table. It will have department, designation and salary. So that a specific department haing a specific designation will have a unique salary. It is written in python
3) #### [getting the salary of an employee service](https://github.com/satyamsah/microservice/tree/master/fetch-salary-service-nodejs): 
   While entering the employee Id you will get the salary of that employee.Its starting point is java-spring which is calling a service    in node-js service to retrive the information of salary


## Pre- requisite 
1)  install java 8 using this and configure the classpath [link](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
2) install [mysql](https://dev.mysql.com/downloads/mysql/)
3) install [python3](https://www.python.org/downloads/)
4) install [pip](https://pip.pypa.io/en/stable/installing/)
5) run "pip install flask" to install flask 

## Database and tables:
create the 2 databases for employee and salaryslab by excuting the mysql script [here](https://github.com/satyamsah/microservice/tree/master/sqlscript):

1) [create-employee.sql](https://github.com/satyamsah/microservice/blob/master/sqlscript/create-employee.sql) : It is creating employee table to stire emp id, name, dept,gender . 
2) [create-salaryslab.sql](https://github.com/satyamsah/microservice/blob/master/sqlscript/create-salaryslab.sql) : It is creating a salaryslab table with dept , deignation and salary as columns.The reason is to create a relation between department and designation to map them to fixed salary.


## Booting the micoservices :
1) ##### onboarding an employee service(java spring boot):
   Run the jar located[here](https://github.com/satyamsah/microservice/blob/master/employee-onboard-service-javaspring/target/demo-0.0.1-SNAPSHOT.jar). It will run this service at port 8080:
   
   java -jar demo-0.0.1-SNAPSHOT.jar

2) department-salary service( python-flask) : we can enable this service by going in the [directory](https://github.com/satyamsah/microservice/blob/master/create-deptmentandsalary-service-python/salary.py) and run salary.py.It will run the service in port 5002:

   python salary.py

3) getting the salary of an employee service (nodejs) You can navigate to [link](https://github.com/satyamsah/microservice/tree/master/fetch-salary-service-nodejs) . Type:
   
   node server.js

# consuming the micoservies using UI
we can access the link [here](https://github.com/satyamsah/microservice/tree/master/web) to access the web UI

1) [Welcome.html](https://github.com/satyamsah/microservice/blob/master/web/Welcome.html) : Welcome link for all the services

2) [addemployee.html](https://github.com/satyamsah/microservice/blob/master/web/addemployee.html) : It will ask for basic info of new employee: Name,Designation, Department,Gender

3) [addSalarySlab.html](https://github.com/satyamsah/microservice/blob/master/web/addSalarySlab.html) : It will ask for Department, Designation and Salary assigned. The salary is mapped to dept and designation

4) [FindSalary.html](https://github.com/satyamsah/microservice/blob/master/web/FindSalary.html) : It will ask for Employee id to fetch the salary of the employee. Only numeric values are allowed

