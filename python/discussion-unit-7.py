#Tuples can be useful with loops over dictionaries to iterate over all dictionary element. We can use items() to get collection of tuples which are the element of original dictionaries.

person = {'Name' : 'Nay Thu Khant', 'Age': 21, 'Education' : 'First year computer science @ UOPeople'} #dictionary

for key, value in list(person.items()): #person.items() will return a collection of tuples
    print(key, ":", value)

#Tuples can be useful with loops over lists in the following way. Two iterate two lists in one loop, we can use zip function which returns the collection of tuples in the (a, b) format in which a is the i-th element of the first list and b is the i-ith element of the second list.

firstList = ['Name', 'Age', 'Education'] #List 1
secondList = ['Nay Thu Khant', 21, 'First year computer science @ UOPeople'] #List 2

for a, b in list(zip(firstList, secondList)): # zip() will return a collection of tuples and it was wrapped with list function to transform into a list object
    print(a, ":", b)


#Usage of enumerate function -  to traverse the elements of a sequence and their indices

for index, element in enumerate('university of the people'):
    print(index, element.upper())




