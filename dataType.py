def data_type(x):
	"""This allows one argument input and returns a value that corresponds to data type of the input  """
	x_type =type(x)
	if x_type == str:
		return len(x)
	elif x_type ==bool:
		return x
	elif x_type ==int:
		if x == 100:
			return 'qual to 100'
		elif x < 100:
			return 'less than 100'
		else:
			return "more than 100"
       
	elif x_type ==list:
	  	
		if len(x) < 3:
		   return None
		else:
		   return x[2]
		
	else:
		return 'no value'
