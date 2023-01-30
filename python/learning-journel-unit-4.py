import math

#This stage will help to check if the function was correctly called or not. The function is currently returning only 0 to check if it works as we want.
def hypotenuse(x, y):
    print(x, y)
    return 0

print(hypotenuse(1, 2))

OUTPUT
1 2
0


#We need to give the power of 2 to both of x and y, then add those results to put into hypotenuse formula.
def hypotenuse(x, y):
    return x**2 + y**2

print(hypotenuse(1, 2))

OUTPUT
5


#final stage, all of the stages are working right now and we only need to implement using a formula
def hypotenuse(x, y):
    return math.sqrt(x**2 + y**2)

print(hypotenuse(1, 2))
OUTPUT
2.23606797749979

print(hypotenuse(3, 4))
OUTPUT
5.0

print(hypotenuse(5, 6))
OUTPUT
7.810249675906654

#This stage will help to check if the function was correctly called or not. The function is currently returning only 0 to check if it works as we want.
def convertUSDtoMMK(usd, exchangeRate):
    print(usd, exchangeRate)
    return 0

print("1000 USD is equal to " + str(convertUSDtoMMK(1000, 1850)) + " MMK with the exchange rate of 1850")
OUTPUT
1000 1850
1000 USD is equal to 0 MMK with the exchange rate of 1850

#We need to multiply usd and exchange rate, then print to see if our function is working as we expected or not.
def convertUSDtoMMK(usd, exchangeRate):
    print(usd * exchangeRate)
    return 0

print("1000 USD is equal to " + str(convertUSDtoMMK(1000, 1850)) + " MMK with the exchange rate of 1850")
OUTPUT
1850000
1000 USD is equal to 0 MMK with the exchange rate of 1850

#final stage, all of the stages are working right now and we only need to return the correct value
def convertUSDtoMMK(usd, exchangeRate):
    return usd * exchangeRate

print("1000 USD is equal to " + str(convertUSDtoMMK(1000, 1850)) + " MMK with the exchange rate of 1850")OUTPUT
1000 USD is equal to 1850000 MMK with the exchange rate of 1850

print("10000 USD is equal to " + str(convertUSDtoMMK(10000, 1850)) + " MMK with the exchange rate of 1850")
10000 USD is equal to 18500000 MMK with the exchange rate of 1850

print("100000 USD is equal to " + str(convertUSDtoMMK(100000, 1850)) + " MMK with the exchange rate of 1850")
100000 USD is equal to 185000000 MMK with the exchange rate of 1850

