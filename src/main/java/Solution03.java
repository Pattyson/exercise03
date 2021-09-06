import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Patrick Brookshire
 */

public class Solution03{

    public static void main(String[] agrs) {

        String quote;
        String author;

        System.out.println("What is the quote?");

        Scanner input = new Scanner(System.in);
        quote = input.nextLine();

        System.out.println("Who said it?");
        author = input.nextLine();

        System.out.println(author + " says," + "\"" + quote + "\"");


    }
}