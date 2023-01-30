""" def fibonacci(number):
    if number in [0, 1]:
        return number
    else:
        return fibonacci(number - 1) + fibonacci(number - 2) """

known = {0:0, 1:1}
def fibonacci(number):
    if number in known:
        return known[number]
    else:
        result = fibonacci(number - 1) + fibonacci(number - 2)
        known[number] = result
        return result


from datetime import datetime
start_time = datetime.now()
print(fibonacci(10))
end_time = datetime.now()
print('Duration: {}'.format(end_time - start_time))
