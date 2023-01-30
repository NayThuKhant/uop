def any_lowercase4(s):
     flag = False
     for c in s:
          flag = flag or c.islower()
     return flag

print(any_lowercase4('BzB'))

"""
any_lowercase1 will iterate the incoming parameter sting and check if the only first letter of the word is lowercase or not.

And this doesn't work correctly because this will return true if only the first letter in a word is lowercase. Or else, the else block will work immediately and return False even the nth
 letter can be a lowercase.

example -
any_lowercase1("Abcdefg")
This will return false even though  the provided included multiple lowercase letters.
  """


"""
any_lowercase2 will ignore (do nothing) the incoming parameter string and only focus on the
'c' is lowercase or not. And this will always return only true since it's checking only 'c', not the parameter we provided.
And this does not work correctly.

example -
any_lowercase2("THIS DOES NOT INCLUDE ANY LOWERCASE")
This will return true even though  the string we provided does not include any lowercase.
  """


"""
any_lowercase3 will iterate the incoming string parameter and override (reassign) the value of flag variable until the last index of the sting.
And this does not work correctly.

example -
any_lowercase3("abcdefG")
This will return false even though the string we provided includes multiple lowercase letters.

In the iteration,flag is true for a,b,c,d,e,f and false for G. Since G is the last letter (last index) here and iteration will stop.
And assigning of the variable flag is terminated with False.
"""

""" any_lowercase4 will iterate the incoming sting parameter, check if there is any lowercase using Boolean Operator.
Since this function is using Boolean operator, True will be returned if there is condition like TURE or FALSE, FALSE or TRUE.
Note: If there is any lowercase letter, flag will become TURE and TRUE or ANY BOOLEAN (TRUE, FALSE) will always be TRUE.

This function works correctly.
"""


""" any_lowercase5 will iterate the incoming string parameter and returns FALSE if any letter of the sting is UPPERCASE.
If there is no UPPERCASE during iteration, the function will return True. This basically means that this function will return true
only if there is no uppercase included.
This function does not work correctly.

example -
any_lowercase3("abcdefG")
This will return false even though there are multiple lowercase letters
"""














