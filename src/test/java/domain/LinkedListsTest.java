package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LinkedListsTest {

    @Test
    void singlyLinkedListTest() throws ListException {
        try {
            SinglyLinkedList list = new SinglyLinkedList();
            list.add(15);
            list.add(10);
            list.add(2);
            list.add(7);
            System.out.println(list);
            list.addFirst(20);
            System.out.println(list);
            list.addFirst(9);
            System.out.println(list);
            System.out.println(STR."GetFirst: \{list.getFirst()}");
            System.out.println(STR."GetLast: \{list.getLast()}");
            System.out.println(STR."GetPrev(9): \{list.getPrev(9)}");
            System.out.println(STR."GetPrev(2): \{list.getPrev(2)}");
            System.out.println(STR."GetPrev(7): \{list.getPrev(7)}");

            System.out.println(STR."IndexOf(20): \{list.indexOf(20)}");
            System.out.println(STR."IndexOf(10): \{list.indexOf(10)}");
            System.out.println(STR."IndexOf(15): \{list.indexOf(15)}");

        }catch (ListException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    void doublyLinkedListTest() {

    }
}