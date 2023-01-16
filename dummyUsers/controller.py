from flask import Flask, abort
import json
import service
import userList as ul

app = Flask(__name__)

@app.route("/DATA-SERVICE/findAll/")
def findAll():

    users = service.findAll()
    
    if users is None:
        abort(500)
    
    result = ul.UserList(users)
    
    return json.dumps(result.__dict__)

