"""This program contains a function find_missing which allows two lists
It checks whether it is not list one and two then returns a zero
Checks for whether not set list one and set list two"""

def find_missing(number1, number2):
    
    if not number1 and not number2:

        return 0

    if not set(number1) ^ set(number2):

        return 0

    else:

        return list(set(number1) ^ set(number2))[0]

print(find_missing([50],[67]))