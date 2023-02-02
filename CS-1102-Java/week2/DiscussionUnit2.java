class DiscussionUnit2 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("USING LOOPS TO PRINT 1 TO 5");
        System.out.println("> while loop");

        int max = 5;
        int current = 1;

        while (max >= current) {
            System.out.print(" " + current + " ");
            current++;
        }

        System.out.println("\n> Equivalent do while loop");
        // Reset the number of iterated times
        current = 1;

        do {
            System.out.print(" " + current + " ");
            current++;
        } while (max >= current);

        System.out.println("\n> Equivalent for loop");
        for (current = 1; max >= current; current++) {
            System.out.print(" " + current + " ");
        }


        System.out.println("USING LOOPS TO CREATE ANIMATION OF LOADING BAR");

        System.out.println("> do while loop");
        int fullPercentage = 100;
        int currentPercentage = 10;
        do {
            System.out.print(" # ");
            // Intentionally use sleep function to demonstrate the loading animation
            Thread.sleep(100);
            currentPercentage += 10;
        } while (fullPercentage >= currentPercentage);


        System.out.println("\n> Equivalent while loop");
        // Reset current percentage
        currentPercentage = 10;
        while (fullPercentage >= currentPercentage) {
            System.out.print(" # ");
            // Intentionally use sleep function to demonstrate the loading animation
            Thread.sleep(100);
            currentPercentage += 10;
        }

        System.out.println("\n> Equivalent for loop");
        for (currentPercentage = 10; fullPercentage >= currentPercentage; currentPercentage += 10) {
            System.out.print(" # ");
            // Intentionally use sleep function to demonstrate the loading animation
            Thread.sleep(100);
        }

        System.out.println("\nUSING LOOPS TO SUM 0 < NUMBERS < 100");

        System.out.println("> for loop");
        int minNumber = 1;
        int maxNumber = 99;
        int total = 0;

        for (int currentNumber = minNumber; currentNumber <= maxNumber; currentNumber++) {
            total += currentNumber;
        }
        System.out.println(" The sum of the numbers from 1 to 99 is " + total);

        System.out.println("> Equivalent while loop");
        // Reset total
        total = 0;
        int currentNumber = minNumber;
        while (currentNumber <= maxNumber) {
            total += currentNumber;
            currentNumber++;
        }
        System.out.println(" The sum of the numbers from 1 to 99 is " + total);

        System.out.println("> Equivalent do while loop");
        // Reset total & current number
        total = 0;
        currentNumber = minNumber;
        do {
            total += currentNumber;
            currentNumber++;
        } while (currentNumber <= maxNumber);
         System.out.println(" The sum of the numbers from 1 to 99 is " + total);
    }

}


/*
A "While" Loop is used to repeat a specific block of code an unknown number of times,
until a condition is met. For example, if we want to ask a user for a number between 1 and 10,
we don't know how many times the user may enter a larger number,
so we keep asking "while the number is not between 1 and 10".

A “do while” loop is a control flow statement that executes a block of code at least once,
and then repeatedly executes the block, or not,
depending on a given Boolean condition at the end of the block.

So the only difference between While loop and Do while loop is that the while loop can end without executing any statement and
Do while loop will end only after executing one statement.

In computer science, a for-loop (or simply for loop) is a control flow statement for specifying iteration,
which allows code to be executed repeatedly. If we (or the computer) knows exactly how many times to execute a section of code
 (such as shuffling a deck of cards) we use a for loop.

 Reference
 David J.Eck. (2022, May). Javanotes 9, Section 2.1—The Basic

Java Application. Introduction to Programming Using Java. https://math.hws.edu/javanotes/c2/s1.html

*/
