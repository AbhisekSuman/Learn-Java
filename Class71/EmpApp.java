package Class71;

import java.util.*;

public class EmpApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.nextInt());
        }

        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        System.out.println("Sorted marks (Descending):" + arrayList);
    }
}
