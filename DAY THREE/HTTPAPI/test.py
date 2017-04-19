


import unittest, requests
from api import get_data, post_data

class TestsHttpAndWeb(unittest.TestCase):
	url = "https://jsonplaceholder.typicode.com/posts/"
	title = "example title"
	body = "example body"

	def test_get_returns_nothing_to_show_out_of_range(self):
		"""
		should return '* empty *' if
		input is not within 1 and 100
		"""
		self.assertEqual("* empty *",
			get_data(self.url, "101"))

	def test_get_raises_value_error_for_non_int(self):
		"""
		should raise Value Error if input is not integer
		"""
		with self.assertRaises(ValueError):
			get_data(self.url, "s")

	def test_correct_get_returns_response_object(self):
		"""
		A correct get request should return Response object
		"""
		self.assertIsInstance(get_data(self.url, "3"), requests.models.Response)
	
	def test_correct_post_returns_response_object(self):
		"""
		A correct post request should return Response object
		"""
		self.assertIsInstance(post_data(self.url, self.title, self.body), requests.models.Response)

		
if __name__ == '__main__':
	unittest.main()