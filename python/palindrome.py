string_value = raw_input("enter the strin_value is:")
rev_str = reversed(string_value)
if list(string_value) == list(rev_str):
    print "the given string_value is a palindrome"
else:
    print "the given string_value is is not a palindrome"
