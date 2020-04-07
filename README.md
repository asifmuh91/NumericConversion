# NumericConversion
Numerical Conversion Project has Following Functions

1) Check if an input contains a valid Number or Not
2) If number is valid, number is processed to convert into Words. like 250 will be converted into two hundred and fifty
3) if number is invalid, display it to user and ask for correct input

# How to run this application?

This application can be run from "Main.java" file. It can be found under numeberToWrods -> src/com/company. When you run this, it has 2 options. 1) is to manually enter your input
2) is to enter your inputs via a file. File need to be added under config folder and should be named input.txt. It is a more hard coded approach but can be make configurable if required


Design: I tried to make it more service based so more services can be added in future of this project.For example if users have another requirement of converting numbers into integers, we can easily spin another service. Enums are used as we have constants units of tens.

# Tests:
Please run Test.java file under src/com/company to see expected output results.
