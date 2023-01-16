
class User(dict):

    def __init__(self, id, name, age, gender, imageUrl):
        dict.__init__(self, id=id, name=name, age=age, gender=gender, imageUrl=imageUrl)
        self.id = id
        self.name = name
        self.age = age
        self.gender = gender
        self.imageUrl = imageUrl
    
