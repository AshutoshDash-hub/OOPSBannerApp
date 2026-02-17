# OOPS Banner Application

A progressive Java learning project demonstrating four use cases of increasing complexity, each adding educational value by introducing new programming concepts.

## Project Structure

- **OOPSBannerApp.java** – Main launcher that runs all use cases
- **UC1_OOPSBannerApp.java** – Use Case 1: Simple message output
- **UC2_OOPSBannerApp.java** – Use Case 2: Banner using explicit print statements
- **UC3_OOPSBannerApp.java** – Use Case 3: Banner using String.join() for efficiency
- **UC4_OOPSBannerApp.java** – Use Case 4: Banner using String arrays and loops
- **OOPSBannerApp_legacy.txt** – Original combined source (for reference)

## Use Cases

### UC1: Simple Message
Prints the word "OOPS" to the console.
```bash
java OOPSBannerApp UC1
```

### UC2: Banner with Print Statements  
Displays "OOPS" as an ASCII banner using individual System.out.println() calls.
```bash
java OOPSBannerApp UC2
```

### UC3: Banner with String.join()
Improves UC2 by using String.join() to construct each banner line, reducing memory overhead from string concatenation.
```bash
java OOPSBannerApp UC3
```

### UC4: Banner with Array and Loop  
Further optimizes the solution by storing banner lines in a String array and printing them in a for-each loop, eliminating code duplication.
```bash
java OOPSBannerApp UC4
```

## Running the Application

**Default (runs UC4):**
```bash
javac OOPSBannerApp.java UC1_OOPSBannerApp.java UC2_OOPSBannerApp.java UC3_OOPSBannerApp.java UC4_OOPSBannerApp.java
java OOPSBannerApp
```

**Run a specific use case:**
```bash
java OOPSBannerApp UC1
java OOPSBannerApp UC2
java OOPSBannerApp UC3
java OOPSBannerApp UC4
```

## Learning Objectives

- **UC1**: Basic program structure and System.out.println()
- **UC2**: Multiple output statements and string literals
- **UC3**: String manipulation using String.join() for efficiency
- **UC4**: Arrays, loops, and code modularity

## Author

Ashutosh