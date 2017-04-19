class Car(object):



    def __init__(self,car_name="",car_model="",car_type=""):

        self.speed = 0



        if len(car_name)>0:

            self.name=car_name

        else:

            self.name="General"

        if len(car_type)>0:

            self.type=car_type

        else:

            self.type="salon"

        if len(car_model)>0:

            self.model=car_model

        else:

            self.model="GM"

        if self.name=="Porshe" or self.name=="Koenigsegg":

            self.num_of_doors=2

        else:

            self.num_of_doors=4

        if self.type=="trailer":

            self.num_of_wheels=8

        else:

            self.num_of_wheels=4



    def is_saloon(self):

        return self.type



    def drive(self, v):

        if v == 3:

            self.speed = 1000

        elif v == 7:

            self.speed = 77

        return self