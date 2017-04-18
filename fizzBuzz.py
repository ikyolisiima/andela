def fizz_buzz(arg):
    
   numbers_types = (int, float, complex)

   if isinstance(arg, numbers_types):

       value = ''

       divisible = False

       if arg % 3 == 0:

           divisible = True

           value += 'Fizz'

       if arg % 5 == 0:

           divisible = True

           value += 'Buzz'

       if divisible:

           return value

       else:

           return arg

   else:

       return arg

print (fizz_buzz(12))