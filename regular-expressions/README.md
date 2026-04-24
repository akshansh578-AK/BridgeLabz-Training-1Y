# Regex Java Project

This project contains beginner-friendly Java programs that solve common regex problems using `Scanner`, `Pattern`, `Matcher`, and `String.matches()`.

## Package

All classes are inside:

`com.gla.regex`

Source folder:

`src/com/gla/regex`

## Programs Included

1. `UsernameValidator`  
   Validates username rules: starts with letter, length 5-15, letters/numbers/underscore only.

2. `LicensePlateValidator`  
   Validates plate format: 2 uppercase letters followed by 4 digits.

3. `HexColorValidator`  
   Validates hex code format like `#1A2B3C`.

4. `EmailExtractor`  
   Extracts all emails from input text.

5. `CapitalWordExtractor`  
   Extracts words that start with a capital letter.

6. `DateExtractor`  
   Extracts dates in `dd/mm/yyyy` format.

7. `LinkExtractor`  
   Extracts `http` / `https` links.

8. `SpaceReplacer`  
   Replaces multiple spaces with a single space.

9. `BadWordCensor`  
   Censors words like `damn` and `stupid` with `****`.

10. `IPValidator`  
    Validates IPv4 addresses in the range 0-255.

11. `CreditCardValidator`  
    Validates basic Visa and MasterCard format (16 digits).

12. `LanguageExtractor`  
    Extracts language names: Java, Python, JavaScript, Go.

13. `CurrencyExtractor`  
    Extracts values like `$45.99` or `10.50`.

14. `RepeatingWordFinder`  
    Finds repeated consecutive words like `is is`.

15. `SSNValidator`  
    Validates SSN format: `XXX-XX-XXXX`.

16. `MainMenu` (Bonus)  
    Central menu to run any program.

## Compile and Run in VS Code Terminal

From the `regex` folder:

```bash
javac -d out src/com/gla/regex/*.java
```

Run menu:

```bash
java -cp out com.gla.regex.MainMenu
```

Run any single class (example):

```bash
java -cp out com.gla.regex.UsernameValidator
```
