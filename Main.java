import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;

class Main{
    public static void main(String[]args){

        LinkedList<Boolean> boolLinkedList = new LinkedList<>();
        boolLinkedList.add(true); //0
        boolLinkedList.add(false);//1
        boolLinkedList.add(true);//2
        boolLinkedList.add(false);//3
        boolLinkedList.peek() //get the first thing in LinkedList

        System.out.println("Hello Brightcode");

        Vector<String> strVector = new Vector<>(3,5);
        strVector.add("One"); //1,3
        strVector.add("Two"); //2,3
        strVector.add("Three"); //3,3
        strVector.add("Four"); //4,8

        //Array
        int[] numArr = {1,2,3,4,5,6};
        String[] strArr = {"one", "two", "three"}
        //Array LIst
        ArrayList<Integer> numArrayList =  new ArrayList<>();
        ArrayList<Integer> numArrListWithValue = new ArrayList<>(
            Array.asList(1,2,3,4,5,6,7,8,9,10);
        )
        numArrayList.add(1);
        numArrayList.add(2);
        numArrayList.add(3);
        System.out.println(numArrList);
    }
}


import java.util.*;




class Main{
    
    // public List<String> getStringList(){

    //     ArrayList<String> strList = new ArrayList<>(
    //         Arrays.asList("One", "Two", "Three")
    //     );

    //     Vector<String> strVector = new Vector<>(
    //         Arrays.asList("One", "Two", "Three")
    //     );

    //     LinkedList<String> strLinked = new LinkedList<>(
    //         Arrays.asList("One", "Two", "Three")
    //     );

    //     return strLinked;
    // }

    public static void main(String[] args){

        // ArrayList>List>Collection>Iterable>Object        

        // ArrayList<String> list = new ArrayList<>();
        // list.add("One");
        // list.add("Two");
        // list.add("Three");
        // System.out.println(list);

        // Main main = new Main();

        // List<String> result = main.getStringList();
        // System.out.println(result);


        LinkedList<Boolean> boolLinkedList = new LinkedList<>();
        boolLinkedList.add(true);   // node1 // > node2
        boolLinkedList.add(false);  // node2 // > node3
        boolLinkedList.add(true);   // node3 // > node4
        boolLinkedList.add(false);  // node4 // > null

        boolLinkedList.pop();
        System.out.println(boolLinkedList.peek());


        // break and continue
        // for(int i=0;i<10;i++){
        //     System.out.println(i);
        //     if(i==5){
        //         break;
        //     }
        // }
        // whatever:
        // for(int i=0;i<10;i++){

        //     for(int j=0;j<10;j++){
        //         if(i==5){
        //             break whatever;
        //         }
        //         System.out.println("I = " + i + "; J =" + j);
        //     }
        // }
        // System.out.println("After");

        // // Array
        // int[] numArr = {1,2,3,4,5,6,7,8,9,10};
        // String[] strArr = {"one", "two", "three"};

        // // Vector
        // Vector<String> strVector = new Vector<>(3, 5);
        //                         // Num Values, Capacity
        // strVector.add("One");   // 1, 3
        // strVector.add("Two");   // 2, 3
        // strVector.add("Three"); // 3, 3
        // strVector.add("Four");  // 4, 8

        // Integer cap = strVector.capacity();

        // System.out.println(cap);
        // // System.out.println(strVector);

        // ArrayList
        // ArrayList<Integer> numArrList = new ArrayList<>();
        // numArrList.add(1);
        // numArrList.add(2);
        // numArrList.add(3);
        // System.out.println(numArrList);

        // ArrayList with values
        // ArrayList<Integer> numArrListWithValue = new ArrayList<>(
        //     Arrays.asList(1,2,3,4,5,6,7,8,9,10)
        // );
        // System.out.println(numArrListWithValue);

        // HashSet<Integer> integerHashSet = new HashSet<>();

        // integerHashSet.add(1);
        // integerHashSet.add(1);
        // integerHashSet.add(2);
        // integerHashSet.add(2);
        // integerHashSet.add(3);
        // integerHashSet.add(3);
        // integerHashSet.add(3);
        // integerHashSet.add(4);

        // System.out.println(integerHashSet);

        // HashMap<Integer, String> strHashMap = new HashMap<>();
        // strHashMap.put(10, "Ten");
        // strHashMap.put(20, "Twenty");
        // strHashMap.put(30, "Thirty");
        // // String myValue = strHashMap.remove(10);
        // System.out.println(strHashMap.keySet());
        // System.out.println(strHashMap.values());
        // System.out.println(strHashMap.entrySet());

        // System.out.println(strHashMap);
        // System.out.println(myValue);

    }


}


// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8
// Explanation: 342 + 465 = 807.
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
}