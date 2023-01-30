#Precondition
""" An assertion that indicates what is to be true at the beginning of execution of a function body or, more generally, of any sequence of statements.
 Wrong pre condition may lead the program to work unexpectedly and cause the bugs, errors. For example - If a function need an integer value as it's parameter and It may go wrong
 if we put string value in the argument of the function call"""

#Postcondition
""" The Post condition is simply a statement expressing what work has been accomplished by the function. This work might involve reading or writing data,
 changing the values of variable parameters, or other actions. For example - If a function does the wrong mathematical operation and this result will go wrong."""

#Wrong return value or usage of the function
""" If we return a boolean value instead of integer it should be from a function, the operation based on the return value of this function will go wrong and might face
with some bugs, and errors """

def isDivisible(x, y):
    isDivisible = x%y == 0
    return isDivisible


if(isDivisible(4,2) == 'This value will not be returned from the function'):
    print('4 is divisible by 2')
else:
    print('4 is not divisible by 2')


def function2(param):
    print (param, param)
    print (cat)

def function1(part1, part2):
    cat = part1 + part2
    function2(cat)

chant1 = "See You "
chant2 = "See Me "
function1(chant1, chant2)
