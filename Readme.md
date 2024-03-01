This is my solution to the Kattis challenge "Pea Soup and Pancakes", which can be found at:
https://open.kattis.com/problems/peasoup

The trickiest part of this challenge was to keep track of which dishes are offered in which restaurants,
I found that using a LinkedHashMap worked very well for this task. Each restaurant is represented by
its name and the menu is an arraylist that is mapped to the restaurant name. 

The name of the first restaurant that satisfies the problem's constraints must be printed out
in the same order as the input, this was a clear indication that I needed a LinkedHashMap in order
to preserve the insertion order.