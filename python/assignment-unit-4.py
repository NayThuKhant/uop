def is_divisible(x, y):
    if x % y == 0:
        return True
    else:
        return False

def is_power(x, y):
    if x == 1: # When we give every number to the power of 0, it will become 1
        return True

    if  y == 1: # The only positive integer that is a power of "1" is "1" itself. And we have already filtered out the case of x being 1 in first condition.
        return False

    if x == y: # When we give every number to the power of 1, it will remain the same as it's original value
        return True

    if is_divisible(x, y): # If x is divisible by y, call the is_power function to determine if the result of x/y is the power of y
        return is_power(x/y, y)
    else: # If none of the condition above are matched, return False
        return False

print("is_power(10, 2) returns: ", is_power(10, 2))
print("is_power(27, 3) returns: ", is_power(27, 3))
print("is_power(1, 1) returns: ", is_power(1, 1))
print("is_power(10, 1) returns: ", is_power(10, 1))
print("is_power(3, 3) returns: ", is_power(3, 3))
