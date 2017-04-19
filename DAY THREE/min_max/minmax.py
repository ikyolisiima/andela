def find_max_min(items):
	if min(items)== max(items):
		return [len(items)]
	return [min(items), max(items)]
	
#print minmax([4,4,4,4])
		