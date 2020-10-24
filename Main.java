import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(1);
    al.add(2);
    al.add(3);
    ArrayList<Integer> al2 = new ArrayList<Integer>();
    al2.add(4);
    al2.addAll(0, al);
    System.out.println(al2);
  }
}
