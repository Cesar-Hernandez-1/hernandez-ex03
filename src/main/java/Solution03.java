/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*  Pseudocode:
 *  Set up scanner object "input" to receive input from user
 *  Ask user to input quote string
 *  Store input in "quote" string variable
 *  Ask user to input the name of who said the quote
 *  Store input in "speaker" string variable
 *  Output the name of the speaker followed by "says, " and the inputted quote
 *      within escape character (\) double quotes (").
 */
import java.util.Scanner;
public class Solution03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String speaker = input.nextLine();

        System.out.println(speaker + " says, \"" + quote + "\"");
    }
}