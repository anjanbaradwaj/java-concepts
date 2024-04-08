package org.mylearnings.collections;

import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        //push - will push the items on top of another - LIFO - Last In First Out
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        System.out.println(integerStack);

        //Gives the item that is at the top of the stack
        System.out.println(integerStack.peek());

        //Pop will remove the topmost element
        System.out.println(integerStack.pop());
        System.out.println(integerStack);

    }

}
