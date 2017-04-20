def prime_number(number):
    output= []
    for number in range(2,number+1):
        if number ==2 or number ==3:
            output.append(number)
        if number % 2 != 0 and number % 3 !=0:
            output.append(number)
    return n,output
print (prime_number(1))