# HashTable
CHALLENGE ONE: Which is a better hash function:
  x % n where n is a large number with several factors
  x % n where n is a large prime number
  
* 10 % 11 = 10
* 20 % 11 = 9
* 30 % 11 = 7
* 40 % 11 = 6
* 50 % 11 = 5 
* 60 % 11 = 4
* --> has varying integar answers
* 10 % 8 = 2
* 20 % 8 = 4
* 30 % 8 = 6
* 40 % 8 = 0
* 50 % 8 = 2
* 60 % 8 = 4 
* --> follows a pattern

**Using a large prime number as n in the case where x % n is a better hash function than the other option. In this example above, the keys are increasing by 10, which is a pattern. In this case, it is obvious how prime numbers would distribute the keys better than composite numbers, which print out the answers in a pattern. However, if the keys don't have a uniform pattern, then n as a composite number would also work.**
  

CHALLENGE TWO: Is char values summed % 599 a good hash function for strings? Why or why not?

CHALLENGE THREE: Take a look at Java's HashMap class and how it produces hashed values, then describe how it works. (You may have to look at other classes to find the actual mathematical function! Follow the trail of breadcrumbs...)
