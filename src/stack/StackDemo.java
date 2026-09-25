package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("Attack on Titan");
        stack.push("Bleach");
        stack.push("86");
        stack.push("Black clover");

        System.out.println(stack);
        //System.out.println(stack.empty());

        String myFavAnime = stack.pop();
        System.out.println("Favourite anime: " + myFavAnime);

        System.out.println("what now peek on stack: " + stack.peek());
        System.out.println(stack);
    }
}
