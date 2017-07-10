package cs115;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Integer> arrayList = new ArrayList();
    private static ArrayList<Integer> smallHalf = new ArrayList<>();
    private static ArrayList<Integer> largeHalf = new ArrayList<>();

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            arrayList.add((int)(Math.random()*100));
        }

        System.out.println("   " + arrayList.get(findIndexOfPivot()));
    }

    public void quickSort() {
        int i = -1;
        int j = 0;
        int p = findIndexOfPivot();

        while(true) {

        }
    }

    public static int findIndexOfPivot() {
        int ind1 = 0;
        int ind2= arrayList.size()/2;
        int ind3 = arrayList.size() - 1;

        int first = arrayList.get(ind1);
        int middle = arrayList.get(ind2);
        int last = arrayList.get(ind3);

        if(first >= middle && first <= last || first <= middle && first >= last) {
            return ind1;
        }
        else if(middle >= first && middle <= last || middle <= first && middle >= last) {
            return ind2;
        }
        else
            return ind3;
    }
}
