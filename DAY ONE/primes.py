def prime_number(n):
    output= []
    for n in range(2,n+1):
        if n ==2 or n ==3:
            output.append(n)
        if n % 2 != 0 and n % 3 !=0:
            output.append(n)
    return n,output
print (prime_number(1))