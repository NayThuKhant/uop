alphabet = "abcdefghijklmnopqrstuvwxyz"

test_dups = ["zzz","dog","bookkeeper","subdermatoglyphic","subdermatoglyphics"]

test_miss = ["zzz","subdermatoglyphic","the quick brown fox jumps over the lazy dog"]

# From Section 11.2 of:

# Downey, A. (2015). Think Python: How to think like a computer scientist. Needham, Massachusetts: Green Tree Press.

def histogram(s):
     d = dict()
     for c in s:
          if c not in d:
               d[c] = 1
          else:
               d[c] += 1
     return d

def has_duplicates(string):
    for count in histogram(string).values(): #iterate the return values from histogram function by transforming it into list contained only values
        if count > 1:                        #if the count is grater than 1, it means there is duplicated word
            return True

    return False




def missing_letters(string):
    word_dictionary = histogram(string)
    missing_letters_list = []

    for letter in alphabet:
        if letter not in word_dictionary: #if letter if not found in the dictionary, append it into list
            missing_letters_list.append(letter)
    return ''.join(missing_letters_list)



for word in test_dups:
   output = word
   if has_duplicates(word):
       output += ' has duplicates'
   else:
       output += ' has no duplicates'
   print(output)

print('.........................') #printing divider to the output


for string in test_miss:
    output = ''
    missing_letters_string = missing_letters(string)

    if len(missing_letters_string):
        output = string + ' is missing letters ' + missing_letters_string
    else:
        output = 'it uses all the letters'

    print(output)

d = {'a' : 1, 'b': 2}
result = dict()
for key in d:
    val = d[key]
    if val not in result:
        result[val] = [key]
    else:
        result[val].append(key)
    print(result)

for dict in d:
    print(dict)
