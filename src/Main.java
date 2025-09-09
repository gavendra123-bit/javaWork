import java.util.*;
public class Main {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i=0;i<5;i++){
            arr[i]=i;
        }
        //arr[5]=12;
        for (int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(5);
        System.out.println(list);
    }
}