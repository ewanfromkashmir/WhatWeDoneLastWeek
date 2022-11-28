import java.util.Scanner;

public class WhatWeDoneLastWeek
{
    public static void main(String[] args)
    {
        // Initialising integer age to negative value
        int age = -1;

        // Declaring scanner reader to read user input
        Scanner reader = new Scanner(System.in);

        // Obtaining age via user input, repeatedly prompting while age < 0
        do {
            try
                {
                    // Prompting user for input
                    System.out.print("Enter age: ");

                    // Assigning user input as integer to age variable
                    age = Integer.parseInt(reader.nextLine());
                }
            catch (NumberFormatException e)
                {
                    // Printing an error message and returning in case of an exception
                    System.out.println("Error: please enter an integer only.");
                }
            }
        while (age < 0);

        // Outputting the age of the user based on their input
        System.out.println("You are " + age + " years old.");
    }
}
