Problem A - Palindromic Twist
I soved this problem by looping through a string with two index values at opposite ends of the string and iterating towards the middle.
I compared the values at each index using the .compareTo() method and checked if the absolute difference was either equal to 1 or greater than 2.
If it returned true I would return false and break the loop. If I got to the end of the loop before that happened, then I would return true.
