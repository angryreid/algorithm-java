package emma;

public class Main {
  public static void main(String[] args) {
//    List<Integer> list1 = new ArrayList<Integer>();
//    List<String> list2 = new LinkedList<String>();
    List<Integer> list = new LinkedList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list.toString());// 1 - 2 - 3
    list.add(1, 4);
    System.out.println(list.toString());// 1 - 4 - 2 - 3
  }
}
