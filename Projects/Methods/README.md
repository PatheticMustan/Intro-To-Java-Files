# Instructions
* Complete the following methods with the given signatures.
* **All user input and output must occur in your main method**.
* You are permitted to create other methods if you feel they would help you complete the task.
* Call your java file Methods. This is to be submitted to DropBox by **November 7**, in a folder called Methods.



In your main method, display a menu to ask the user for their desired calculation. The options are listed below.
```
public static int factorial(int n)
  This method takes a nonnegative integer as a parameter and returns the product n * (n – 1) * ... * 2 * 1.
```

```
public static int firstDigit(int n)
  This method takes an integer as a parameter and returns the first numeric digit.
```

```
public static boolean allDigitsOdd(int n)
  This method takes an integer and returns true if all of the individual digits in the number are odd; false otherwise
```

```
public static boolean allDigitsSame(int n)
  This method takes an integer and returns true if all of the individual digits in the number are all odd or all even; 
  false otherwise
```

```
public static boolean hasMidpoint(int a, int b, int c)
  This method takes three integers as parameters and returns true if the average of any two of them is the third.
```

This project will be graded on:
1. Documentation (4 points): Your code must be fully commented and employ standard Java-style conventions.
2. User-Friendliness (4 points): All interactions with the user must be clear and unambiguous.
3. Methods (10 points): Each method has the proper signature and works as expected.

**TOTAL: 18 points**

# Explanation

[Factorial](https://github.com/PatheticMustan/Intro-To-Java-Files/blob/d629cccf514d749e7bca6ae4db72ff4d7efd94ac/Projects/Methods/Methods.java#L103)
```
public static int factorial(int n)
  This method takes a nonnegative integer as a parameter and returns the product n * (n – 1) * ... * 2 * 1.
```
HINT: factorial(0) is 1, so it should start as 1.

Loop through 2-n, and multiply 1 by every single one of those numbers.

[FirstDigit](https://github.com/PatheticMustan/Intro-To-Java-Files/blob/d629cccf514d749e7bca6ae4db72ff4d7efd94ac/Projects/Methods/Methods.java#L114)
```
public static int firstDigit(int n)
  This method takes an integer as a parameter and returns the first numeric digit.
```
Because ints can only be whole numbers, you can just divide n by 10 until it's a single digit.

[AllDigitsOdd](https://github.com/PatheticMustan/Intro-To-Java-Files/blob/d629cccf514d749e7bca6ae4db72ff4d7efd94ac/Projects/Methods/Methods.java#L127)
```
public static boolean allDigitsOdd(int n)
  This method takes an integer and returns true if all of the individual digits in the number are odd; false otherwise
```
Loop through all the digits, and check if any of them are even. If they are, return false.
Otherwise, return true.

[allDigitsSame](https://github.com/PatheticMustan/Intro-To-Java-Files/blob/d629cccf514d749e7bca6ae4db72ff4d7efd94ac/Projects/Methods/Methods.java#L143)
```
public static boolean allDigitsSame(int n)
  This method takes an integer and returns true if all of the individual digits in the number are all odd or all even; 
  false otherwise
```
Loop through all the digits, and check if they're all equal to the last digit.

[HasMidpoint](https://github.com/PatheticMustan/Intro-To-Java-Files/blob/d629cccf514d749e7bca6ae4db72ff4d7efd94ac/Projects/Methods/Methods.java#L158)
```
public static boolean hasMidpoint(int a, int b, int c)
  This method takes three integers as parameters and returns true if the average of any two of them is the third.
```
HINT: `(a + b) / 2 == c` can be re-written as `a + b == c + c`.

You also need to make sure your function works if a, b, and c are swapped around.
