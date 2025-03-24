package mesclando.dois.arraylists;

import java.util.ArrayList;

public class MesclandoDoisArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);

        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        ArrayList<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        System.out.println("lista mesclada: " + mergedList);
    }

}
