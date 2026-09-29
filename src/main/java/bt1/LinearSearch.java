package bt1;

import java.util.ArrayList;

public class LinearSearch {
    public static int linearSearch(ArrayList<Integer> arrayList, int k) {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            count++;
            if (arrayList.get(i) == k) {
                return count;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(-3);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(-9);
        arrayList.add(11);
        arrayList.add(15);
        arrayList.add(21);
        arrayList.add(19);
        arrayList.add(18);
        arrayList.add(17);
        arrayList.add(20);
        arrayList.add(-5);
        arrayList.add(2);

        arrayList.sort(null);

        int index = linearSearch(arrayList, 8);
        if (index == -1) {
            System.out.println("So khong ton tai ");
        } else {
            System.out.println("Tim thay voi so lan so sanh: " + index);

        }
    }
}
