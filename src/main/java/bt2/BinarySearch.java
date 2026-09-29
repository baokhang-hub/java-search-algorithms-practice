package bt2;

import java.util.ArrayList;

public class BinarySearch {
    public static int binarySearch(ArrayList<Integer> arrayList, int k) {
        int left = 0;
        int right = arrayList.size() - 1;
        int count = 0;
        while (left <= right) {
            count++;
            int mid = (right + left) / 2;
            int valueMid = arrayList.get(mid);
            if (valueMid < k) {
                left = mid + 1;
            } else if (valueMid > k) {
                right = mid - 1;
            } else {
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
        int index = binarySearch(arrayList, 8);
        if (index == -1) {
            System.out.println("Khong co so nao nhu the");
        } else {
            System.out.println("Tim thay so sau " + index + " lan lap");
        }
    }
}

// khi tim so lon nhat thi binarySearch se tim thay so sau 5 lan lap
// con voi linearSearch thi khi tim so lon nhat se tim thay so do sau 20 lan lap