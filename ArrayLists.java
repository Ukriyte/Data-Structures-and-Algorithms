import java.util.*;

public class ArrayLists {
     public static void main(String[] args) {
//CREATION

        // Java Collection Framework
        // ClassName ObjectName = new ClassName();
        ArrayList<Integer> al1 = new ArrayList<>();
        // ArrayList<Boolean> al2 = new ArrayList<>();
        // ArrayList<String> al3 = new ArrayList<>();

//ADDING ELEMENTS        

        al1.add(1); // O(1)
        al1.add(2);
        al1.add(3);
        al1.add(4);
        System.out.println(al1);

        al1.add(1,9);//O(n)
        System.out.println(al1);


//GETTING ELEMENTS

        int element = al1.get(2);// O(1)
        System.out.println(element);

//REMOVING ELEMENTS

        al1.remove(2);// o(n)
        System.out.println(al1);

//SETTING ELEMENTS

       al1.set(1,10);//O(n)
       System.out.println(al1);

//Does list contains?
        System.out.println(al1.contains(10));//O(n)
        System.out.println(al1.contains(2));

//Size of array list
        System.out.println(al1.size());

//For sorting a list
       //Collections.sort(list); in ascending order
       //Collections.sort(list, Collections.reverseOrder());        
       
//MultiDimensional Arraylists
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> L1 = new ArrayList<>();
    L1.add(1);
    L1.add(2);
    ArrayList<Integer> L2 = new ArrayList<>();
    L2.add(3);
    L2.add(4);
    mainList.add(L1);
    mainList.add(L2);
//

//Printing ArrayList
    for(int i= 0; i<mainList.size(); i++){
        ArrayList<Integer> NewList = mainList.get(i);
        for(int j=0 ; j<NewList.size(); j++){
        System.out.print(NewList.get(j)+" ");
        }
    System.out.println();
    }

    System.out.println(mainList);
    System.out.println("-----------THE END-----------");
    }
}
