from flask import Flask, jsonify, make_response, request
import itertools
import json
import pymysql.cursors
conn= pymysql.connect(host='localhost',user='root',passwd='root123',db='salaryslab',autocommit=True,cursorclass=pymysql.cursors.DictCursor)
curr=conn.cursor()


app = Flask(__name__)





@app.route('/getAllSalarySlab', methods=['GET'])
def getAllSalaryInfo():
    ''' Greet the user '''
    global allSalaryInfo
    result = "select * from salaryslab"
    curr.execute(result)
    data= curr.fetchall();
    print(type(data))
    print (data)
    global allSalaryInfo
    allSalaryInfo=jsonify(result=data)
    print(type(allSalaryInfo))
    return allSalaryInfo


@app.route('/getAllSalarySlab/<dept>/<designation>', methods=['GET'])
def getaSingleSalaryInfo(dept,designation):
    query="select pay from salaryslab where dept ='%s' AND designation = '%s' "%(dept,designation)
    #query="select pay from salaryslab"
    curr.execute(query)
    data=curr.fetchone()
    return jsonify(data)


@app.route('/addSalarySlab', methods=['POST'])
def addProduct():
    ''' Greet the user '''
    designation=request.form['designation']
    print('designation -> ' + designation)
    dept=request.form['dept']
    print('dept -> ' + dept)
    pay=request.form['pay']
    print('pay -> ' + pay)

    query = "INSERT INTO salaryslab (dept,designation,pay) VALUES ( '%s', '%s', '%s')"%(dept,designation,pay)
    print("query-> " + query)

    curr.execute(query)
    return "added"


@app.route('/', methods=['GET'])
def hello():
    ''' Greet the user '''
    return "Todo service is up"


if __name__ == '__main__':
    app.run(port=5002, debug=True)
