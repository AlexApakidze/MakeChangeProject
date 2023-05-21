# MakeChangeProject

## Overview

The MakeChange project I have created takes in the price of an item and how much money was tendered. The program then displays the correct change to return to the customer in the most efficient way. If the customer did not give enough money or just enough for the item, the system will inform the cashier.

## Tech used

-java
-eclipse
-coffee maker

## Lessons learned

1. System.err in a while loop is useful for keeping track of changes made to variables each time the while loop cycles

2. Having a sandbox is useful for troubleshooting certain sections of your code to make sure its working 100% before applying the changes to the main code.

3. "%.2f" is useful for finding the exact change to print out when java wants to change a 0.05 to a 0.499999999996

4. Nested if() statements are useful for returning different answers based on their own condition that also need to reference the condition of the parent if statement.

5. Always triple check that your if() and while() statements have a way to exit.

## What's going on?

Line 2+8: Setting up keyboard to take in input from the customer

Lines 10-18: Declaring variables to use or modify later

Lines 20-23: Takes in info about the price of an item and how much was paid and assigning those values to variables to reference later

Line 25: Creates a variable to determine how much change should be given back based on the input from lines 20-23

Lines 27-33: Tells the user if there is not enough money, how much change to give back in plain text, and if there is no reason to give change back.

Line 35: Starts a while loop that will keep looping until we inform the user the most efficient way to return the customers change.

Line 37: Starts calculating our change with the largest denominator we were asked to include ($20)

Line 38: Assigns a number to our 'answer' variable based on the floor value of 'change' divided by 20. We do this, so we can output how many $20s we need to return.

Lines 39-45: Create an if statement to figure out if we are printing out "return a $20" or "return several $20s". We start with an if() statement to determine if the amount of change that we need to return is more than $20.999 (we use $20.999 to reduce incorrect calculating bugs based on how doubles behave, we could use any number less than 40 since this statement should only loop if we need to return multiple 20s). On lines 41 and 44 we remove the amount of $20s returned to the customer from our original value of 'change' in order to properly calculate the rest of the change.

Lines 47-53: If the money we need to return is greater than $10 or $5 we inform the user to return a ten or a five. We don't need to complicate this if() statement like we did for 20s since 2x $10 will just be a $20 and 2x $5 will just be a 10

Lines 55-63: We do a if() statement similar to the $20s to determine how many $1s we return and subtract it from our 'change' amount

Lines 65-97: We do similar if() loops like we did for $20 to return a certain amount of change and subtract that amount from our final 'change' tally. This excludes nickels for the same reason we excluded $5 and $10

Line 99: We close our keyboard to prevent data leaks 

Lines 102-108: We create a method findFloor to find the floor of lines 38 and 56 to display the correct amount of $1s or $20s to return. This method helps to keep our code DRY to not repeat several lines of code in our already packed if() statements.