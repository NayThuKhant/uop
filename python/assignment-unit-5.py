def my_sqrt(a):
    #choosing starting value for x
    x = 1
    while True:
        y = (x + a/x) / 2.0
        if y == x:
            break
        x = y
    return x

print(my_sqrt(36))


import math
def test_sqrt():
   a = 1
   #Iterate only when a is less than or equal to 25
   while a<=25:
        print('a =', a,'| my_sqrt(a) =',my_sqrt(a),'| math.sqrt(a) =', math.sqrt(a),'| diff =', abs(math.sqrt(a)-my_sqrt(a)))
        a = a + 1

test_sqrt()
