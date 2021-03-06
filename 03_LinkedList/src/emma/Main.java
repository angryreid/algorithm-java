package emma;

import circle.CircleLinkedList;;

public class Main {

  public static void testLinkedList(List<Integer> list) {
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list.toString());// 1 - 2 - 3
    list.add(1, 4);
    System.out.println(list.toString());// 1 - 4 - 2 - 3
  }

  public static void testCircleLinkedList(List<Integer> list) {
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list.toString());// 1 - 2 - 3
    list.add(1, 4);
    System.out.println(list.toString());// 1 - 4 - 2 - 3
  }

  public static void josephus(int sum, int n) {
    System.out.println("start---");
    CircleLinkedList<Integer> list = new CircleLinkedList<Integer>();
    for (int i = 1; i < sum + 1; i++) {
      list.add(i);
    }
    // 指向头结点（指向1）
    list.reset();

    while (!list.isEmpty()) {
      int count = n;
      while (count >= 1) {
        list.next();
        count--;
      }
      System.out.println(list.remove());
    }
    System.out.println("end---");
  }

  public static void main(String[] args) {
//    List<Integer> list1 = new ArrayList<Integer>();
//    List<String> list2 = new LinkedList<String>();

//    List<Integer> list = new LinkedList<Integer>();
//    testLinkedList(list);

//    List<Integer> list = new CircleLinkedList<>();
//    testCircleLinkedList(list);

    josephus(8, 2);

  }
}
