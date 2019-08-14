/**
 * Class to test the `LinkedList` class.
 */

public class LinkedListDriver {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insert(1);
    ll.insert(8);
    ll.insert(1);
    ll.insert(2);
    ll.insert(2);
    ll.insert(9);
    ll.print();

    ll.reverse();

    ll.print();
  }

}