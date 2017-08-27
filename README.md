1.install java 8  using this link] (http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.htm)
2.install mysql
4. create the 2 databases for employee and salaryslab using the sql script:
a.create-employee.sql
b.create-salaryslab.sql
3. install python3
4. install pip 
5. run "pip install flask"
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