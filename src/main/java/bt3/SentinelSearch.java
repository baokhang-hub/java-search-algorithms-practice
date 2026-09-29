package bt3;

import java.util.ArrayList;

public class SentinelSearch {
    public static int sentinelSearch(ArrayList<Integer> arrayList, int k) {
        arrayList.add(k);
        int count = 1;
        int lastIndex = arrayList.size() - 1;
        int i = 0;
        while (arrayList.get(i) != k) {
            i++;
            count++;
            if (i == lastIndex) {
                return -1;
            }
        }
        return count;
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

        int index = sentinelSearch(arrayList, 8);
        if (index == -1) {
            System.out.println("So khong ton tai ");
        } else {
            System.out.println("Tim thay voi so lan so sanh: " + index);

        }
    }
}
