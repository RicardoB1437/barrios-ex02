import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution02
{
    //prompt user for string
    //read in string using standard input
    //print out string name and number of characters

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("What is the input string? ");
        String name = input.nextLine();

        System.out.printf("%s has %d characters.", name, name.length());
    }

}
