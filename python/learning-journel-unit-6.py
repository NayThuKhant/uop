randomString = 'priority quality king permission topic customer attention education introduction phone comparison gate device meal church engineering cabinet role village disease literature player reaction property ear employment potato perspective winner knowledge bath ladder scene mud category wood conclusion teacher assistance lab inspection hat throat statement writing user guidance river birthday tea'

#Turning the list into list using split
randomWordList = randomString.split()


#Delete 3 words from list
randomWordList.pop() #The last element of the list (tea) was deleted


randomWordList.remove('birthday') #The element with the value of 'birthday' was deleted


del randomWordList[len(randomWordList) - 1] #The last element of the remaining list (river) is deleted


#Sorting the list
randomWordList.sort()


#Adding 3 words to list
randomWordList.append('university') # 'university' was added to the last index of the list


randomWordList.insert(0, 'zoo' )# 'zoo' as added to the 0 index of the list

listToBeExtended = ['cycle']
randomWordList.extend(listToBeExtended) # 'cycle' was added to the last index of the list


#Joining the remaining list of words
separator = ' '
randomWordList = separator.join(randomWordList)
print(randomWordList)

# Output - zoo assistance attention bath cabinet category church comparison conclusion customer device disease ear education employment engineering gate guidance hat inspection introduction king knowledge lab ladder literature meal mud permission perspective phone player potato priority property quality reaction role scene statement teacher throat topic user village winner wood writing university cycle

# nested list
nestedList = [['a', 'b', 'c'], ['d', 'e', 'f']]
print(nestedList)
# Output - [['a', 'b', 'c'], ['d', 'e', 'f']]


# '*' operator on a list
duplicateNestedList = nestedList * 2
print(duplicateNestedList)
# Output - [['a', 'b', 'c'], ['d', 'e', 'f'], ['a', 'b', 'c'], ['d', 'e', 'f']]

# slice
originalNestedList = duplicateNestedList[:2]
print(originalNestedList)
# Output - [['a', 'b', 'c'], ['d', 'e', 'f']]

# '+= operator'
listToBeAdded = [['G', 'H', 'I']]
originalNestedList += listToBeAdded
print(originalNestedList)
#Output - [['a', 'b', 'c'], ['d', 'e', 'f'], ['G', 'H', 'I']]

def isLowerCaseList(list):
    for element in list:
        if element.isupper():
            return False
    return True

# filter
originalNestedList = list(filter(isLowerCaseList, originalNestedList))
print(originalNestedList)
#Output - [['a', 'b', 'c'], ['d', 'e', 'f']]

# A list operation that is legal but does the "wrong" thing, not what the programmer expects
listOfNumberUnder5 = [1, 2, 3, 4]
listOfNumberUnder6 = listOfNumberUnder5.append(5) # trying to put 5 at the last index of list
print(listOfNumberUnder6)
#Output - None



#How do you feel about the aspect assessments and feedback you have received from your peers?
    #I think they all are really focusing on their peers' assessments and they can really give me the useful ideas, tips and suitable rating as well. I'm really satisfied with their ratings.

#How do you think your peers feel about the aspect assessments and feedback you provided them?
    #As a student from this community, I try to give the best ideas I have to them, give the suitable ratings. So I think they will be satisfied due to my ratings and some helps.


