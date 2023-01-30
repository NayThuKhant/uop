x=2
y=1
if x == y:
    print (x, "and", y, "are equal")
else:
    if x < y:
        print (x, "is less than", y)
    else:
        print (x, "is greater than", y)


#define a function that print '.'
def new_line:

    print('.')

#define a function that call new_line function 3 times to get total of 3 lines
def three_lines():

    new_line()

    new_line()

    new_line()

#define a function that call three_line function 3 times to get total of 9 lines
def nine_lines():

    three_lines()

    three_lines()

    three_lines()


def clear_screen():
    #to get total of 25 lines, we have to combine as following
    # 9 + 9 + 3 + 3 + 1 = 25

    nine_lines()

    nine_lines()

    three_lines()

    three_lines()

    new_line()


#calling functions

print("Printing nine lines")
nine_lines()

print("Calling clearScreen()")
clear_screen()
