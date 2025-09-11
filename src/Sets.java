import java.util.*;

public class Sets {
    public static void main(String args[]){
        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(8);
        st.add(6);
        st.add(4);
        st.add(2);
        System.out.println("----------Hashset----------");
        System.out.println(st);
        System.out.println();
        Set<Integer> st1 = new LinkedHashSet<>();
        st1.add(12);
        st1.add(123);
        st1.add(21);
        st1.add(32);
        st1.add(22);
        System.out.println("----------LinkedHashSet----------");
        System.out.println(st1);
        System.out.println();
        Set<Integer> st2 = new TreeSet<>();
        st2.add(987);
        st2.add(657);
        st2.add(1111);
        st2.add(67);
        st2.add(111);
        System.out.println("----------TreeSet----------");
        System.out.println(st2);


    }
}
