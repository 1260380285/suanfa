package com;

import java.util.Stack;

/**
 * @author: yuanbing
 * @created time: 2019/6/16 16:21
 * @description:
 */

public class TwoStack {
    private Stack<String> pushStack;
    private Stack<String> popStack;

    public TwoStack() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    public void add(String push) {
        this.pushStack.push(push);
    }

    public String poll() {
        push2PopStack();
        return popStack.pop();
    }

    private void push2PopStack() {
        if (popStack.empty() && pushStack.empty()) {
            throw new RuntimeException("Queue is empty");
        } else if (popStack.empty()) {
            while (!pushStack.empty()) {
                popStack.push(pushStack.pop());
            }
        }
    }

    public String peek() {
        push2PopStack();
        return popStack.peek();
    }

}
