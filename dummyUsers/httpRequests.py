import requests

def getRequest(url):
    
    result = requests.get(url)

    if(result.status_code == 200):
        return result.json()

    return None

