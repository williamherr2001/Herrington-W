Problem A - Equality
Given a string of upper case characters of length n containing every letter A through the k-th letter of the alphabet,
I needed to output the maximum length of the string after making a number deletions needed to make in order to have 
every letter to appear the same number of times in the string. To do this I looped through every character in the string
and added 1 to an index in an integer array 'a' specified by a[s.charAt(i)-'A']. I then sorted the array and printed the
value at index 0 multiplied by k.
