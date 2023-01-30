try:
    file = open('ThisFileDoesNotExist.txt')
except FileNotFoundError:
    print('Sorry, this file does not exist')

#Output - Sorry, this file does not exist


try:
    file = open(1234567)
except OSError:
    print('Sorry, something went wrong')

#Output - Sorry, this file does not exist


try:
    file = open('new_file.txt', 'w')
    file.write(1234567)
except TypeError:
    print('Something went wrong and trying with new value')
    file.write('1234567')

#Output - Something went wrong and trying with new value

""" Throwing error without handling will stop the program immediately and the user of the program will be difficult to use our program.
In a large production program, I will try to handle all the possible exceptions(errors) by using try except and will try not to quit immediately the program at least.

Suppose that we are handling a banking transfer system and we have to deal with two functions here.
1- Deduct the transferred amount from sender account
   *extra* --- Do some work here (Recording The date time of the transaction)
2- Add the transferred amount to recipient account

If there is some exception unhandled between step 1 and step 2 (*extra*), the program will just deduct the transferred amount from sender and will add nothing to recipient account
because the program quited immediately because of the unhandled exception.unhandled

Instead, I would rather try to handle those kind of possible exceptions in except block and will do some reverted actions. (refund to sender account)

"""

