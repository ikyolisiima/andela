import requests
def get_data(get_url, post_id):
	try:
		isinstance(int(post_id), int)
		if int(post_id) <= 50 and int(post_id) > 0:
			r = requests.get(get_url + post_id)
			return r
		else:
			print("Please enter a number between 1 and 50")
	except ValueError as e:
		print("please enter a whole number for your request to succeed")
		raise(e)
	return "* empty *"

def post_data(post_url,title, body, userId=11):
	post_data = {
		'title': title,
		'body': body,
		'userId': userId
		}
	r = requests.post(post_url, data=post_data)
	return r

def main():
	print("\n\t---- Python HTTP API cmd App -----\n\t%s\n" %("-"*31))
	print("Welcome to this simple Python HTTP API command line app")
    #using API from website bellow
	print("Let's get some data from the 'jsonplaceholder.typicode.com' website")

	url = "https://jsonplaceholder.typicode.com/posts/"

	post_id = input("Enter a number between 1 and 50: ")
	print("\n\tGetting your request...\n")
	get_r = get_data(url,post_id)
	print("\tGET Response data\n\t%s\n%s\n\tStatus code\n\t%s\n%s\n\tHeaders\n\t%s\n%s" % 
		("-"*17,get_r.text, "-"*11, get_r.status_code,"-"*7, get_r.headers))

	print("\nplease add a new post...")
	title = input("Enter your post title: ")
	body = input("Enter a body for your post: ")

	print("\n\tCreating your new post...\n")
	post_r = post_data(url,title,body)
	print("\tPOST Response data\n\t%s\n%s\n\tStatus code\n\t%s\n%s\n\tHeaders\n\t%s\n%s" % 
		("-"*17,post_r.text, "-"*11, post_r.status_code,"-"*7, post_r.headers))

if __name__ == '__main__':
	main()