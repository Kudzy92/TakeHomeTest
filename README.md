# Section A: Code Review
## Option 1: Python Task 
```python
class Solution:
       def groupAnagrams(self, strs):
      result = {}
      for i in strs:
         x = "".join(sorted())
         if x in result:
            result[x].append(i)
         else:
            result[x] = [i]
      return list(result.values())
ob1 = Solution()
print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
```

#### NOTES

1.  Classname should be informative  `class AnagramSolution:`
2.  Your should indent your code to avoid IndentationError. Just like

```python
class Solution:
    def groupAnagrams(self, strs):
         result = {}
         for i in strs:
             x = "".join(sorted(i))
         if x in result:
             result[x].append(i)
         else:
             result[x] = [i]
         return list(result.values())
ob1 = Solution()
print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))

```

## Option 2: JAVA Task
```java
1. public class recursion {
 
	1. public static void main(String[] args) {
 
		// Saves the string that would be reversed
		1. String myStr = "emosewA si avaJ";
 
 
		//create Method and pass and input parameter string 
		1. String reversed = reverse_string(myStr);
		1. System.out.println("The reversed string is: " + reversed + "\nFibonacci Series of 10 numbers:0 1 1 2 3 5 8 13 21 34 ");
	

	}
 
 
	//Method take string parameter and check string is empty or not
	1. public static String reverse_string(String myStr)
	{
		1. if (myStr.isEmpty()){
		 System.out.println("String in now Empty");
		 return myStr;
		}
		//Calling Function Recursively
		System.out.println("String to be passed in Recursive Function: "+myStr.substring(1));
		return reverseString(myStr.substring(1)) + myStr.charAt(0);}

	public static <T> void function(T maxNumber) {
		// Set it to the number of elements you want in the Fibonacci Series
		int maxNumber = 10; 
		int previousNumber = 0;
		int nextNumber = 1;
		 
	    System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	for (int i = 1; i <= maxNumber; ++i){
	    System.out.print(previousNumber+" ");
	    // On each iteration, we are assigning second number
	    // to the first number and assigning the sum of last two
	    // numbers to the second number
	    int sum = previousNumber + nextNumber;
	    previousNumber = nextNumber;
	    nextNumber = sum;
	    }
 
	}
 
}
```


