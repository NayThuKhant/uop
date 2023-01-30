"""
An object holds value whereas as a value is contained within an object. The ‘is’ operator is used to show if two objects are identical.
If the objects are identical, the interpreter returns True. When it comes to python lists, if different variables  refer to the same objects
they are not identical but equivalent (Downey, 2015).  If the ‘is’ operator is used in this case, the python interpreter returns False.  """

list1 = ['a', 'b', 'c']
list2 = ['a', 'b', 'c']

print(list1 is list2) #False
print(list1 == list2) #True

#In the above code,the value of list1 and list 2 are equivalent, but their referenced object are not identical.

""" Aliasing refers to the act of giving an object more than one name. A reference refers the assignment of a variable to an object """

list1 = ['a', 'b', 'c'] # Reference to an object
list2 = list1 #Aliasing
print(list1 is list2) #True

list1[1] = 'd' #Since list2 is aliasing the same object of list1, changes made to list1 is reflected to list2 as well.
print(list2) #['a', 'd', 'c']

def remove_evens_from_list(parameterList):
    odd_list = []
    for number in parameterList:
        if  number % 2 is not 0:
            odd_list.append(number)

    return odd_list


argumentList = [1,2,3,4,5,6,7,8,9,10]
print(remove_evens_from_list(argumentList)) # [1, 3, 5, 7, 9]

""" In the above example, the parameterList and the argumentList are aliases for the same object. The function takes a list as an argument ,concatenates it with the same list, remove
all the even number from the list and return the result """

"""
Reference
Downey, A. (2015).Think Python: How to think like a computer scientist, 2nd Edition. This book is licensed under Creative Commons Attribution-NonCommercial 3.0 Unported (CC BY-NC 3.0). """
def print_n(s, n):
     if n > 0:
          print(s)
          print_n(s, n-1)
     return n
n = 3
while print_n("hi", n):
     print_n("there!", n)
     n = 0
