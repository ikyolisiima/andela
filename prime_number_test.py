import unittest
from prime_number import prime_number
class prime_number_test(unittest.TestCase):

    def test_prime_number_one(self):
        
        self.assertEqual(prime_number(2)[1], [2], msg="Result is invalid")

    
    def test_prime_number_two(self):        
        self.assertEqual(prime_number(3)[1], [2,3], msg="Result is invalid")

    def test_prime_number_three(self):        
        self.assertEqual(prime_number(1)[1], [], msg="Result is invalid")
    
    def test_arg_is_int(self):
        self.assertIsInstance(prime_number(1)[0], int, msg="Argument is not integer")
    
    import unittest
from prime_number import prime_number
class prime_number_test(unittest.TestCase):

   def test_prime_number_one(self):
        
        self.assertEqual(prime_number(2)[1], [2], msg="Result is invalid")

    
   def test_prime_number_two(self):        
        self.assertEqual(prime_number(3)[1], [2,3], msg="Result is invalid")
       
   def test_prime_number_three(self):        
        self.assertEqual(prime_number(1)[1], [], msg="Result is invalid")