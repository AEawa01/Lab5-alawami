package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {
    public static void main(final String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        final Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            final String line = input.nextLine();
            stack.push(line);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
