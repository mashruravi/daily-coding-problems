/**
 * This class contains an implementation of a singly linked list, with a method
 * to reverse the linked list in-place.
 * 
 * The linked list stores an integer as its data.
 * 
 * TODO:
 * [ ] Write unit tests (and do TDD)
 * [X] Insert item at the end of the list
 * [ ] Insert item at the beginning of list
 * [ ] Insert item at a given position (index)
 * [ ] Iterate through the list
 * [ ] Delete item at given index
 * [ ] Delete item with given key
 * [ ] Use generics for data in node
 */

public class LinkedList {

  public static class Node {
    int data;
    Node next;
  }

  Node head = null;

  public LinkedList() {
  }

  /**
   * Insert an item at the end of the linked list
   */
  public void insert(int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    if (this.head == null) {
      this.head = newNode;
    } else {
      Node temp = this.head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  /**
   * Print the contents of the list to System.out
   */
  public void print() {
    if (this.head == null) {
      System.out.println("The list is empty.");
    } else {
      System.out.println("List contents:");
      Node temp = this.head;
      while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
      }
    }
  }

  /**
   * Reverse the contents of the list in-place
   */
  public void reverse() {

    Node prevNode = null;
    Node currNode = this.head;

    while (currNode != null) {
      Node nextNode = currNode.next;
      currNode.next = prevNode;
  
      prevNode = currNode;
      currNode = nextNode;
    }

    this.head = prevNode;
  }

}