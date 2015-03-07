package dcll.fele.impl;

import dcll.fele.MySimpleStackk.Item;
import dcll.fele.MySimpleStackk.SimpleStack;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by Fakri on 25/02/2015.
 */
public class MySimpleStack implements SimpleStack{
    Stack<Object> wrappedStack = new Stack<Object>();
    @Override
    public boolean isEmpty() {
        return wrappedStack.empty();
    }

    @Override
    public int getSize() {
        return wrappedStack.size();
    }

    @Override
    public void push(Item item) {
            wrappedStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}
