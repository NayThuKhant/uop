alphabet = "abcdefghijklmnopqrstuvwxyz"   

test_dups = ["zzz","dog","bookkeeper","subdermatoglyphic","subdermatoglyphics"] 

test_miss = ["zzz","subdermatoglyphic","the quick brown fox jumps over the lazy dog"] 

#From Section 11.2 of: 

#Downey, A. (2015). Think Python: How to think like a computer scientist. Needham, Massachusetts: Green Tree Press. 

def histogram(s):
    d = dict()
    for c in s:
        if c not in d:
            d[c] = 1
        else:
            d[c] += 1
    return d

#Part 1

#Returns True if the string repeats letters, returns False otherwise
def has_duplicates(s):
    #stores histogram
    duplicates_bool = histogram(s)
    #loops through each key in the histogram
    for result in duplicates_bool:
        #if key appears more than once return True
        if duplicates_bool[result] > 1:
            return True
    #If key is less than 1 or equal to 1 return False
    return False

#loops through each string in the test_dups list and prints a statement based on the return value of has_duplicates
for string in test_dups:
    if has_duplicates(string):
         print(string, 'has duplicates')
    else:
        print(string, 'has no duplicates')


#Part 2

#Returns all missing letters in the alphabet missing from the string
def missing_letters(s):
    #careates empty list to store missing letters
    lettersmissing = []
    #stores histogram
    histo = histogram(s)
    #loops through each letter in the alphabet string
    for letter in alphabet:
        #if the letter is not in the histogram add it to the list of missing letters
        if letter not in histo:
            lettersmissing.append(letter)
    #return the lettermissing list
    return lettersmissing

#Loops through the string test_miss and calls the missing_letters method to test for missing letters in each string
for string in test_miss:
    #stores missing letters
    missingletters = missing_letters(string)
    #if the missingletters list is empty, all letters are used
    if not missingletters:
        print(string, 'uses all the letters')
    #else letters are missing
    else:
        #concatenates the elements in list using join() with a delimiter
        delimiter = ''
        missingstring = delimiter.join(missingletters)
        print(string, 'is missing letters', missingstring)