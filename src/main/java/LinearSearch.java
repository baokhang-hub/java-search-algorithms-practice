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
        arrayList.add(2);
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(-1);

        int index = linearSearch(arrayList, -1);
        if (index == -1) {
            System.out.println("So khong ton tai ");
        } else {
            System.out.println("Tim thay voi so lan so sanh: " + index);

        }
    }
}
