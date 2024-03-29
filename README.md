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

**Using a large prime number as n in the case where x % n is a better hash function than the other option. In this example above, the keys are increasing by 10, which is a pattern. In this case, it is obvious how prime numbers would distribute the keys better than composite numbers, which print out the answers in a pattern. However, if the keys don't have a uniform pattern, then n as a composite number would also work. With fewer factors, it is easier to avoid collisions.**
  

CHALLENGE TWO: Is char values summed % 599 a good hash function for strings? Why or why not?

**Since 599, is a really large prime number, using the x % 599 hash function would reduce the number of collisions by putting different strings under the same index. The larger the number, however, the more evenly distributed and less collisions there will be.**


CHALLENGE THREE: Take a look at Java's HashMap class and how it produces hashed values, then describe how it works. (You may have to look at other classes to find the actual mathematical function! Follow the trail of breadcrumbs...)

Java's HashCode function follows this formula:  s[0]*31^(n - 1) + s[1]*31^(n - 2) + ... + s[n - 1]. 
* n = the length of the string 
* s[i] = the specific character of that string
* the entire string of characters needs to be broken down and analyzed through the function.
* this phrase (s[0]*31^(n - 1)) is repeated like this --> s[i]*31^(n - i+1) + s[i+1]*31^(n- i+2)+...

