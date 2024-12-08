def palindrome(input):

    # we're going to create a list of the words forming the input 
    # to ignore punctuation we're going to use isalnum.() (we're only going to take alphanumeric characters)
    # to ignore capitalization we're going to turn the input to lowercase with .lower()
    words = [i for i in input.lower() if i.isalnum()]

    # the inverse of a list is words[::-1]. now we only need to check if the list remains the same after inversing it
    return words == words[::-1]


print(palindrome("Madam, in Eden, I'm Adam")) # returns true
print(palindrome("Complete the project report")) # returns false
print(palindrome("")) # if string is empty return true
