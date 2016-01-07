class Person:
    def getGender(self):
        print'find f or m'
class Male(Person):
    def getGender(self):
        print'male'
class Female(Person):
     def getGender(self):
         print'female'
m=Male()
f=Female()
m.getGender()
f.getGender()
