def invert_dict(dictionary):
    inverted_dictionary = dict()
    for key in dictionary:
        for element in dictionary[key]:             #since the element is list here, we will iterate every loop, check the key on inverted_dictionary if it already exists
            if not element in inverted_dictionary:
                inverted_dictionary[element] = [key]    #if not exists, create new key with the value of list
            else:
                inverted_dictionary[element].append(key) #if exists, append the key into the existing list
    return inverted_dictionary


# A dictionary contains of uppercase letters, lowercase letter and mixedcase letters

print('\n... Printing Original Dictionary ...')
original_dictionary = {"uppercases" : ['A', 'B', 'C', 'D'], "lowercases" : ['a', 'b', 'c'], "mixedcases" : ['a', 'B', 'c']}
print(original_dictionary)

print('\n... Printing Inverted Dictionary ...')
inverted_dictionary =invert_dict(original_dictionary)
print(inverted_dictionary)


OUTPUT

... Printing Original Dictionary ...
{'uppercases': ['A', 'B', 'C', 'D'], 'lowercases': ['a', 'b', 'c'], 'mixedcases': ['a', 'B', 'c']}

... Printing Inverted Dictionary ...
{'A': ['uppercases'], 'B': ['uppercases', 'mixedcases'], 'C': ['uppercases'], 'D': ['uppercases'], 'a': ['lowercases', 'mixedcases'], 'b': ['lowercases'], 'c': ['lowercases', 'mixedcases']}



Description

my invert function will accept a dictionary contains of values as lists and key as anything we like. It will iterate the incoming
dictionary first with the help of for...in loop, the iterate again every element on the list of values from dictionary and check
if the value if already exists in inverted_dictionary or not. If exists, it will append to the current list and if not, it will
create another key and value (list) as a member of inverted_dictionary


Useful part of my function

My inverted_dictionary can help to define the element from the list (value) of original_dictionary to put in the correct group(uppercases, lowercases, mixedcases)

Is converted dictionary useful or meaningful, and why?

According to my knowledge, the inverted dictionary is useful because I can clearly define and know which letters are from which group (uppercases, lowercases, mixedcases)

