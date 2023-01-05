package Ch10ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0;i < 10;i++){
            list1.add((int) (Math.random()*100));
        }

        for (int i = 0;i < 10;i++){
            list2.add((int) (Math.random()*100));
        }

        System.out.println(intersect(list1,list2));
        System.out.println(list1);
        System.out.println(list2);
    }

    public static ArrayList intersect(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list3= new ArrayList<>();
        for (int i = 0; i < list1.size();i++){
            for (int j = 0;j < list2.size();j++){
                if(list1.get(i) == list2.get(j)){list3.add(list1.get(i));}
            }
        }
        return list3;
    }
}
