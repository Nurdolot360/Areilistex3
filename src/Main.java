import java.util.ArrayList;
public class Main {

    public static class ArrayListExample {
        public static void main(String[] args) {
            ArrayList<Integer> firstList = new ArrayList<Integer>();
            for (int i = 1; i <= 100; i++) {
                firstList.add(i);
            }
            ArrayList<Integer> secondList = new ArrayList<Integer>();
            for (int i = 0; i < firstList.size(); i++) {
                if (i % 2 == 0) {
                    secondList.add(firstList.get(i));
                }
            }
            ArrayList<Integer> thirdList = new ArrayList<Integer>();
            for (int i = 0; i < firstList.size(); i++) {
                if (i % 2 == 1) {
                    thirdList.add(firstList.get(i));
                }
            }
            System.out.println("First List:");
            System.out.println(firstList);
            System.out.println("Second List:");
            System.out.println(secondList);
            System.out.println("Third List:");
            System.out.println(thirdList);
        }
    }
}
