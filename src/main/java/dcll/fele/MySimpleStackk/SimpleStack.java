package dcll.fele.MySimpleStackk;

import java.util.EmptyStackException;

/**
 * Created by Fakri on 07/03/2015.
 */
public interface SimpleStack {

    /**
     * Test if this stack is empty
     */
    public boolean isEmpty();

    /**
     * Return the number of items in this stack
     */
    public int getSize();

    /**
     *  Pushes an item onto this stack.
     *  null item is allowed
     */
    public void push(Item item);

    /**
     * Looks at the object at the top of this stack without removing it from stack.
     */
      public Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object as the value of this funcion.
     * @throws java.util.EmptyStackException if this stack is empty
     */

    public Item pop() throws EmptyStackException;
}
