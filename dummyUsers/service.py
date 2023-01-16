import httpRequests as http
import user as u

def findAll():

    users = http.getRequest("https://randomuser.me/api?results=20")

    if users:
        userList = []
        for user in users["results"]:
            userList.append(u.User(user["id"]["value"], user["name"]["first"] + " " + user["name"]["last"], user["dob"]["age"], user["gender"], user["picture"]["large"]))

        return userList
    
    return None
    