#Chained Conditional

age = int(input('Tell me your age! \n'))

if  age >= 18:
    print('You are old enough to smoke and you can buy cigarettes here')
elif age < 18:
    print('You are still an underage and not allowed to smoke')
else:
    print('You have to tell your age to buy these cigarettes')


#Nested Conditional


value_for_a_cigarette = 100
print('We are selling cigarettes with the price of ' + str(value_for_a_cigarette) + ' per item. \n')
age = int(input('Tell me your age! \n'))

if  age >= 18:
    print('You are old enough to smoke and you can buy cigarettes here. \n')
    balance = int(input('What\'s your balance now? \n'))

    if balance >= value_for_a_cigarette:
         print('You can buy ' + str(balance // 100) + 'cigarettes at most with the balance you have')
    else:
        print('You don\'t have enough balance to buy a cigarette')

elif age < 18:
    print('You are still an underage and not allowed to smoke')


""" Difference between Chained Conditional and Nested Conditional
Chained conditional - A conditional statement with a series of alternative branches. Chained conditionals are simply a "chain" or a combination or multiple conditions.

Nested conditional - A conditional statement that appears in one of the branches of another conditional statement. A conditional statement that can be nested within another.
"""


#Nested Conditional


value_for_a_cigarette = 100
print('We are selling cigarettes with the price of ' + str(value_for_a_cigarette) + ' per item. \n')
age = int(input('Tell me your age! \n'))
balance = int(input('What\'s your balance now? \n'))

if  age >= 18:
    print('You are old enough to smoke and you can buy cigarettes here. \n')

    if balance >= value_for_a_cigarette:
         print('You can buy ' + str(balance // 100) + 'cigarettes at most with the balance you have')
    else:
        print('You don\'t have enough balance to buy a cigarette')

elif age < 18:
    print('You are still an underage and not allowed to smoke')


#Single Conditional to reduce the difficulty of Nested Conditional

value_for_a_cigarette = 100
print('We are selling cigarettes with the price of ' + str(value_for_a_cigarette) + ' per item. \n')
age = int(input('Tell me your age! \n'))
balance = int(input('What\'s your balance now? \n'))

if age < 18:
    print('You are still an underage and not allowed to smoke')
elif age >= 18 and balance >= value_for_a_cigarette:
      print('You are old enough to smoke and you can buy cigarettes here. \n')
      print('You can buy ' + str(balance // 100) + 'cigarettes at most with the balance you have')
else:
      print('You are old enough to smoke and you can buy cigarettes here. \n')
      print('You don\'t have enough balance to buy a cigarette')












