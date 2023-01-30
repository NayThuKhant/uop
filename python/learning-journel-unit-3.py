""" def countdown(n):
     if n <= 0:
          print('Blastoff!')
     else:
          print(n)
          countdown(n-1)

def countup(n):
    if n >= 0:
        print('Blastoff')
    else:
        print(n)
        countup(n+1)


count = int(input('Enter the count to start counting! \n'))

if count > 0:
    countdown(count)
elif count < 0:
    countup(count)
else:
    countdown(count)



#runtime error code
count = int(input('Enter the count! \n')) """

""" def ask_count_from_user():
    return int(input('Enter the count \n')) """

def ask_count_from_user():
    count = input('Enter the count! \n')

    if count.isdigit():
        return int(count)
    else:
        print("Please enter digit only")
        ask_count_from_user()


count = ask_count_from_user()
print("No error occurred")
