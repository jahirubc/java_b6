# Assignment 1

 # What is LTS version and what versions of java are available?

  - There are two java version type
        - LTS
        - Non-LTS

    LTS stands for long term support

    Oracle Java SE Support Roadmap*†
    Release 	GA Date 	Premier Support Until 	Extended Support Until 	Sustaining Support
    8﻿ (LTS)** 	March 2014 	March 2022 	December 2030***** 	Indefinite
    9 - 10﻿ (non-LTS) 	September 2017 - March 2018 	March 2018 - September 2018 	Not Available 	Indefinite
    11 (LTS) 	September 2018 	September 2023 	January 2032***** 	Indefinite
    12 - 16 (non-LTS) 	March 2019 - March 2021 	September 2019 - September 2021 	Not Available 	Indefinite
    17 (LTS) 	September 2021 	September 2026**** 	September 2029**** 	Indefinite
    18 (non-LTS) 	March 2022 	September 2022 	Not Available 	Indefinite
    19 (non-LTS) 	September 2022 	March 2023 	Not Available 	Indefinite
    20 (non-LTS) 	March 2023 	September 2023 	Not Available 	Indefinite
    21 (LTS) 	September 2023 	September 2028**** 	September 2031**** 	Indefinite
    22 (non-LTS)*** 	March 2024 	September 2024 	Not Available 	Indefinite
    23 (non-LTS)*** 	September 2024 	March 2025 	Not Available 	Indefinite
    24 (non-LTS)*** 	March 2025 	September 2025 	Not Available 	Indefinite
    25 (LTS)*** 	September 2025 	September 2030 	September 2033 	Indefinite

    If there is bug/vulnaribility found in the java version that we using to create software  oracle will fix the issue if we use LTS version. Security updates are provided for LTS versions. 
       
        Requirement -> Software -> Release
 # Why we write F or L in float and long types?

  - If java find a number of decimal, by default take it as double. To specify compiler and jvm, f need to put at end of value.
            float f = 1.9000000000; //error
            float f = 1.9000000000f; //correct

  - For long data type, the suffix l indicates that the number is a long literal. If we omit it, java will treat the number as an integer which will lead to errors if the number is out of the range of the int data type. Compilation error will happen.

        long num = 1900000000 //error
        long num = 1900000000L //correct

 # How to write switch cases in Java.
  - Switch = statement that allows a variable to be tested for equality against a list of values.
  
  -Example
    String day = "wow";

        switch (day) {
            case "Sunday" -> System.out.println("It is Sunday!");
            case "Monday" -> System.out.println("It is Monday!");
            case "Tuesday" -> System.out.println("It is Tuesday!");
            case "Wednesday" -> System.out.println("It is Wednesday!");
            case "Thursday" -> System.out.println("It is Thursday!");
            case "Friday" -> System.out.println("It is Friday!");
            case "Saturday" -> System.out.println("It is Saturday!");
            default -> System.out.println("That is not a day!");
        }

  # How to write do while loop in Java.

    The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true. If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use a do-while loop.

    Java do-while loop is called an exit control loop. Therefore, unlike while loop and for loop, the do-while check the condition at the end of loop body. The Java do-while loop is executed at least once because condition is checked after loop body.
    
    -Example
            int i = 1;

        do {
            System.out.println("Hello World");

            i++;
        }
        while (i < 6);