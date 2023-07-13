// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список

package ru. JAVA.Homework4;

import java.util.Collections;
import java.util.LinkedList;

public class Homework4_1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList); // [c, b, a]
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
}