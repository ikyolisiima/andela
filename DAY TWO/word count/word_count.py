def words (sentence):
    
    #The sentence is first split into wotds using spaces only
    words= sentence.split()
    
    for delimiter in [".",",","-"]:
        #print (words)
        words = [word.split(delimiter)[0] for word in words]
    print (words)

    #The occurance of the words in the sentences are then counted
    dictionary_of_words = ({ word:words.count(word) for word in words if not word.isdigit()})
    #The occurance of the numbers in the sentences are then counted
    dictionary_of_words.update({ int(word):words.count(word) for word in words if word.isdigit()})

    return dictionary_of_words

D = words('''Python available 2. 2. 2-2 for 2 many many. operating 22 systems. systems,''')

print(D)