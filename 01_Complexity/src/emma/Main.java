package emma;

import emma.Times.Task;

public class Main {

  public static int fib1(int n) {
    if (n <= 1) {
      return n;
    }
    return fib1(n - 1) + fib1(n - 2);
  }

  public static int fib2(int n) {
    if (n <= 1) {
      return n;
    }
    int first = 0;
    int second = 1;
    int sum = 0;
    for (int i = 0; i < n - 1; i++) {
      sum = first + second;
      first = second;
      second = sum;
    }

    return second;
  }

  public static int fib3(int n) {
    double c = Math.sqrt(5);
    return (int) ((Math.pow((1 + c) / 2, n) - Math.pow((1 - c) / 2, n)) / c);
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    System.out.println(fib1(5));
//    System.out.println(fib2(65));
    System.out.println(fib3(5));
    Times.test("fib1", new Task() {

      @Override
      public void execute() {
        // TODO Auto-generated method stub
        System.out.println(fib1(30));
        ;
      }
    });

    Times.test("fib2", new Task() {

      @Override
      public void execute() {
        // TODO Auto-generated method stub
        System.out.println(fib2(30));
        ;
      }
    });
  }

}
