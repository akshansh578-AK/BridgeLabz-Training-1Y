# Java Workshop Concepts Revision

## Arrays

### Program: Array Input and Output
- Concept Explanation: Arrays store multiple values of the same type in one variable.
- Why this concept is used: It simplifies reading and printing a sequence of values.
- Step-by-step logic explanation: Read size, create array, read elements, print elements.
- Important points for exams: Array indices start at 0 and go to length - 1.
- Common mistakes beginners make: Off-by-one errors and forgetting to read all elements.
- Related concepts: loops, Scanner input, array length.

### Program: Array Example (Basic Operations)
- Concept Explanation: Demonstrates traversal, updating, and searching in arrays.
- Why this concept is used: Arrays are foundational for storing and processing lists.
- Step-by-step logic explanation: Print all elements, update one index, scan for a target.
- Important points for exams: Direct index access is $O(1)$, searching is $O(n)$.
- Common mistakes beginners make: Using wrong index and not handling missing values.
- Related concepts: for-each loop, linear search.

### Program: Arrays Methods Demo
- Concept Explanation: `Arrays` class provides utilities for common array operations.
- Why this concept is used: It saves time and reduces manual code for tasks like sorting.
- Step-by-step logic explanation: Print array, sort, binary search, compare, fill.
- Important points for exams: Binary search needs a sorted array.
- Common mistakes beginners make: Using binary search on an unsorted array.
- Related concepts: sorting, searching, library methods.

### Program: Array Binary Search
- Concept Explanation: Uses `Arrays.binarySearch` to locate an element.
- Why this concept is used: Binary search is faster than linear search on sorted data.
- Step-by-step logic explanation: Read array and key, call `binarySearch`, print result.
- Important points for exams: The array must be sorted for correct results.
- Common mistakes beginners make: Forgetting to sort before searching.
- Related concepts: sorting, comparison logic.

### Program: Sum of Array
- Concept Explanation: Adds all elements of a 1D array.
- Why this concept is used: Summation is a basic array processing task.
- Step-by-step logic explanation: Read size, read elements, loop to accumulate sum.
- Important points for exams: Initialize sum to 0 before the loop.
- Common mistakes beginners make: Not initializing sum or missing elements.
- Related concepts: loops, accumulator pattern.

### Program: Sum of 2D Array
- Concept Explanation: Adds all elements in a matrix using nested loops.
- Why this concept is used: 2D arrays represent tables and grids.
- Step-by-step logic explanation: Read rows and columns, fill matrix, add elements.
- Important points for exams: Use two loops: rows and columns.
- Common mistakes beginners make: Mixing up row and column indices.
- Related concepts: nested loops, matrix input.

### Program: Matrix Diagonal Sum
- Concept Explanation: Sums elements where row index equals column index.
- Why this concept is used: Diagonal operations are common in matrices.
- Step-by-step logic explanation: Read matrix, loop from 0 to min(rows, cols), add diagonal.
- Important points for exams: Use the smaller dimension to avoid out-of-bounds.
- Common mistakes beginners make: Assuming a square matrix without checking.
- Related concepts: matrix traversal, min function.

### Program: Two Sum
- Concept Explanation: Finds two indices whose values add to a target.
- Why this concept is used: It is a classic problem to practice nested loops.
- Step-by-step logic explanation: Use two loops, check all pairs, return matching indices.
- Important points for exams: Use $j = i + 1$ to avoid duplicate pairs.
- Common mistakes beginners make: Returning wrong indices or missing cases.
- Related concepts: brute force search, arrays.

### Program: Move Zeroes
- Concept Explanation: Shifts all zero values to the end without changing order of others.
- Why this concept is used: It teaches in-place array modification.
- Step-by-step logic explanation: Copy non-zeros forward, then fill rest with zeros.
- Important points for exams: Maintain relative order of non-zero values.
- Common mistakes beginners make: Overwriting elements without a separate index.
- Related concepts: two-pointer style index, array updates.

### Program: Remove Duplicates from Sorted Array
- Concept Explanation: Compresses a sorted array to unique values.
- Why this concept is used: In-place filtering reduces extra space usage.
- Step-by-step logic explanation: Compare current with previous, write unique values forward.
- Important points for exams: Works only on sorted arrays.
- Common mistakes beginners make: Using it on unsorted arrays.
- Related concepts: two-pointer, in-place updates.

## Strings

### Program: String Methods
- Concept Explanation: Shows built-in methods available on String objects.
- Why this concept is used: Strings are used in almost every Java program.
- Step-by-step logic explanation: Call length, case conversion, substring, contains, equals.
- Important points for exams: Strings are immutable; methods return new strings.
- Common mistakes beginners make: Expecting original string to change.
- Related concepts: immutability, method chaining.

### Program: String Tokenizer Demo
- Concept Explanation: Breaks a sentence into words (tokens).
- Why this concept is used: Useful for word-by-word processing.
- Step-by-step logic explanation: Create tokenizer, loop while it has tokens, print each.
- Important points for exams: Default delimiter is whitespace.
- Common mistakes beginners make: Forgetting to check `hasMoreTokens()`.
- Related concepts: string splitting, loops.

### Program: StringBuffer Methods
- Concept Explanation: `StringBuffer` is mutable and thread-safe.
- Why this concept is used: Efficient string modifications in multi-threaded context.
- Step-by-step logic explanation: Use append, insert, replace, delete, reverse, and others.
- Important points for exams: `StringBuffer` is synchronized, so it is slower than `StringBuilder`.
- Common mistakes beginners make: Confusing indices in replace and delete.
- Related concepts: mutability, method overloading in APIs.

### Program: StringBuilder Methods
- Concept Explanation: `StringBuilder` is mutable and faster than `StringBuffer`.
- Why this concept is used: Efficient string modifications in single-threaded code.
- Step-by-step logic explanation: Apply append, insert, replace, delete, reverse, and accessors.
- Important points for exams: `StringBuilder` is not synchronized.
- Common mistakes beginners make: Using wrong start and end indices.
- Related concepts: mutable strings, performance.

### Program: String Concatenation Performance
- Concept Explanation: Compares speed of `StringBuffer` and `StringBuilder`.
- Why this concept is used: Teaches performance impact of string concatenation.
- Step-by-step logic explanation: Append in loops and compare time using `System.currentTimeMillis()`.
- Important points for exams: Always reset start time between tests.
- Common mistakes beginners make: Comparing results without equal loop sizes.
- Related concepts: benchmarking basics, loops.

### Program: Reverse String
- Concept Explanation: Reverses a character array using two pointers.
- Why this concept is used: Classic example of in-place reversal.
- Step-by-step logic explanation: Swap left and right, move inward until pointers meet.
- Important points for exams: Stop when left is no longer less than right.
- Common mistakes beginners make: Forgetting to move both pointers.
- Related concepts: array manipulation, swapping.

### Program: Length of Last Word
- Concept Explanation: Finds the length of the last word in a sentence.
- Why this concept is used: Practices string traversal and trimming.
- Step-by-step logic explanation: Trim spaces, walk backward, count until space.
- Important points for exams: Use `trim()` to remove trailing spaces.
- Common mistakes beginners make: Not handling multiple spaces.
- Related concepts: string traversal, loops.

### Program: First Unique Character
- Concept Explanation: Finds first character with frequency 1.
- Why this concept is used: Practices frequency counting with arrays.
- Step-by-step logic explanation: Count frequencies, scan string to find first unique.
- Important points for exams: Use array size 26 for lowercase letters.
- Common mistakes beginners make: Forgetting to map `char` to index.
- Related concepts: frequency arrays, character indexing.

## OOPS

### Program: Hello World (Student)
- Concept Explanation: Basic class structure and program entry point.
- Why this concept is used: It introduces the `main` method and console output.
- Step-by-step logic explanation: Define class, write main, print a message.
- Important points for exams: `main` signature must be `public static void main(String[] args)`.
- Common mistakes beginners make: Typing wrong method signature.
- Related concepts: class definition, JVM entry point.

### Program: Method Overriding Demo
- Concept Explanation: Child class provides its own version of a parent method.
- Why this concept is used: Demonstrates runtime polymorphism.
- Step-by-step logic explanation: Create parent and child objects, call overridden method.
- Important points for exams: Overridden method must have same name and parameters.
- Common mistakes beginners make: Changing method signature and losing override.
- Related concepts: inheritance, polymorphism.

## Constructor

### Program: Constructor Example
- Concept Explanation: Constructor initializes object state.
- Why this concept is used: Ensures objects start with valid data.
- Step-by-step logic explanation: Define fields, create constructor, assign values, display.
- Important points for exams: Constructor name matches class name and has no return type.
- Common mistakes beginners make: Forgetting to use `this` for field assignment.
- Related concepts: object creation, instance variables.

## Methods

### Program: Basic Method Demo
- Concept Explanation: Separates logic into a method.
- Why this concept is used: Encourages code reuse and readability.
- Step-by-step logic explanation: Read input, call `add`, print sum.
- Important points for exams: Parameters are copied; changes inside do not affect caller.
- Common mistakes beginners make: Confusing return values and printing inside methods.
- Related concepts: method calls, parameters.

### Program: Method Overloading Demo
- Concept Explanation: Same method name with different parameter lists.
- Why this concept is used: Provides multiple ways to perform related operations.
- Step-by-step logic explanation: Define `add` methods for different inputs, call each.
- Important points for exams: Method signature is name plus parameter types.
- Common mistakes beginners make: Using only different return type to overload.
- Related concepts: compile-time polymorphism.

### Program: Static vs Non-Static Members
- Concept Explanation: Static members belong to the class; instance members belong to objects.
- Why this concept is used: Clarifies how memory and access rules differ.
- Step-by-step logic explanation: Access static data directly, create object for instance data.
- Important points for exams: Static methods cannot directly use instance variables.
- Common mistakes beginners make: Accessing instance members without an object.
- Related concepts: class loading, object creation.

## Basics

### Program: Basic Variable Types
- Concept Explanation: Variables store data with specific types.
- Why this concept is used: It is the foundation of data handling in Java.
- Step-by-step logic explanation: Declare variables, assign values, print them.
- Important points for exams: `char` uses single quotes.
- Common mistakes beginners make: Using wrong type or quoting.
- Related concepts: literals, data types.

### Program: Variable Scopes Demo
- Concept Explanation: Shows instance, static, and local scopes.
- Why this concept is used: Scope controls visibility and lifetime of variables.
- Step-by-step logic explanation: Declare class fields, local variable, and print them.
- Important points for exams: Local variables must be initialized before use.
- Common mistakes beginners make: Confusing instance and static access.
- Related concepts: memory areas, scope rules.

### Program: Two Number Addition
- Concept Explanation: Reads two integers and computes their sum.
- Why this concept is used: Practice input, arithmetic, and method calls.
- Step-by-step logic explanation: Read inputs, call add method, print result.
- Important points for exams: Close Scanner after use.
- Common mistakes beginners make: Missing prompts or incorrect input type.
- Related concepts: Scanner, methods, arithmetic.

### Program: Random Number Generator
- Concept Explanation: Generates a random number using `Math.random()`.
- Why this concept is used: Shows use of the Math library.
- Step-by-step logic explanation: Call `Math.random()` and print result.
- Important points for exams: `Math.random()` returns a double between 0.0 and 1.0.
- Common mistakes beginners make: Expecting an integer without scaling.
- Related concepts: casting, ranges.

## Input

### Program: Scanner Input Demo
- Concept Explanation: Reads user input from the console.
- Why this concept is used: Input is needed for interactive programs.
- Step-by-step logic explanation: Create Scanner, read value, print it.
- Important points for exams: Use correct Scanner method for type.
- Common mistakes beginners make: Forgetting to close Scanner.
- Related concepts: input stream, data types.

## ControlFlow

### Program: If Else Example
- Concept Explanation: Makes decisions based on conditions.
- Why this concept is used: Control flow is required to branch logic.
- Step-by-step logic explanation: Compare age, print eligible or not.
- Important points for exams: Condition must be boolean.
- Common mistakes beginners make: Using assignment instead of comparison.
- Related concepts: comparison operators, boolean logic.

### Program: Switch Example
- Concept Explanation: Selects one of many paths based on a value.
- Why this concept is used: Cleaner alternative to multiple if-else statements.
- Step-by-step logic explanation: Read choice, match case, print message, break.
- Important points for exams: `break` prevents fall-through.
- Common mistakes beginners make: Missing break statements.
- Related concepts: switch-case, default case.

### Program: Star Patterns
- Concept Explanation: Uses nested loops to print shapes.
- Why this concept is used: Helps practice loop control and pattern logic.
- Step-by-step logic explanation: Use outer loop for rows and inner loop for columns.
- Important points for exams: Spaces and stars control shape.
- Common mistakes beginners make: Wrong loop bounds producing uneven patterns.
- Related concepts: nested loops, console formatting.

## Loops

### Program: While Loop Examples
- Concept Explanation: Repeats code while a condition is true.
- Why this concept is used: Useful when repetitions are not known in advance.
- Step-by-step logic explanation: Initialize, check condition, update inside loop.
- Important points for exams: Update the loop variable to avoid infinite loops.
- Common mistakes beginners make: Forgetting to update loop counter.
- Related concepts: do-while loop, iteration.

### Program: For Loop Demo
- Concept Explanation: Repeats code with a known number of iterations.
- Why this concept is used: Clear structure for counted loops.
- Step-by-step logic explanation: Initialize `i`, check condition, increment each time.
- Important points for exams: Loop condition decides number of prints.
- Common mistakes beginners make: Off-by-one errors.
- Related concepts: loop counters, iteration.

### Program: Enhanced For Loop Demo
- Concept Explanation: Simplifies traversal of arrays.
- Why this concept is used: Cleaner syntax for reading elements.
- Step-by-step logic explanation: Loop through elements and skip a value using `continue`.
- Important points for exams: Enhanced for is read-only for array positions.
- Common mistakes beginners make: Trying to update array elements directly.
- Related concepts: for-each loop, continue.

### Program: Odd Numbers With Continue
- Concept Explanation: Uses `continue` to skip even numbers.
- Why this concept is used: Shows loop control flow.
- Step-by-step logic explanation: Loop from 1 to n, skip evens, print odds.
- Important points for exams: `% 2` checks parity.
- Common mistakes beginners make: Using wrong condition for even/odd.
- Related concepts: modulus operator, loop control.

### Program: Loop Example Demo
- Concept Explanation: Demonstrates multiple loop types in one program.
- Why this concept is used: Helps compare loop behaviors side by side.
- Step-by-step logic explanation: Run while, do-while, for, and for-each examples.
- Important points for exams: Do-while executes at least once.
- Common mistakes beginners make: Mixing loop variables between sections.
- Related concepts: nested loops, patterns.
