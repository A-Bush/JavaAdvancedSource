package ua.com.webcamp.JavaAdv.Lesson07.Ex_11Atomic;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Artem Vereschaka on 8/24/15.
 * artem.andzen@gmail.com
 */
public class Stack{
    private final AtomicReference<Element> head = new AtomicReference<Element>(null);

    public void push(String value){
        Element newElement = new Element(value);

        while(true){
            Element oldHead = head.get();
            newElement.next = oldHead;

            //Trying to set the new element as the head
            if(head.compareAndSet(oldHead, newElement)){
                return;
            }
        }
    }

    public String pop(){
        while(true){
            Element oldHead = head.get();

            //The stack is empty
            if(oldHead == null){
                return null;
            }

            Element newHead = oldHead.next;

            //Trying to set the new element as the head
            if(head.compareAndSet(oldHead, newHead)){
                return oldHead.value;
            }
        }
    }

    private static final class Element {
        private final String value;
        private Element next;

        private Element(String value) {
            this.value = value;
        }
    }
}