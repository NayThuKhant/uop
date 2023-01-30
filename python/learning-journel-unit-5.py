prefixes = 'JKLMNOPQ'
suffix = 'ack'
for letter in prefixes:
    if letter not in 'OQ':
        print(letter + suffix)
    else:
        print(letter + 'u' + suffix)

#how to slice with a stride
#The first one number 0 will be the staring index, the second number 6 will be the last index to be sliced. And the last number 2 is the step to slice.

string = 'aAbBcC'
print(string[0:6:2])

#String slice with no starting, ending, step will give the same string
print(string[:])

#string slice with staring as 0 and ending as 0 will give empty
print(string[0:0])
