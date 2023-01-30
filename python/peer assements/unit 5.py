import math
def my_sqrt(a):
    x=1
    while True:
        y = (x + a/x) / 2.0
        if y == x:
            break
        x = y
    return y
print("Square root of 4 is ",my_sqrt(4))
def test_sqrt():
    a=1
    while a<26:
        print("a = ",a,"| my_sqrt(a) = ",round(my_sqrt(a),11)," | math.sqrt(a)=",math.sqrt(a),"| diff =",abs(my_sqrt(a)-math.sqrt(a)))
        a=a+1
test_sqrt()
              
