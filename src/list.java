import java.util.*;

class AB implements Comparator<String> {
    @Override
    public int compare(String i, String j) {
        int len1 = i.length();
        int len2 = j.length();
        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        } else {
            return 0;
        }
    }
}
class A implements Comparator<Integer>{
    @Override
    public int compare(Integer i, Integer j){
        if(i%10> j%10){
            return 1;
        }
        return -1;
    }
}

class B implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        // Compare based on last character
        char c1 = s1.charAt(s1.length() - 1);
        char c2 = s2.charAt(s2.length() - 1);
        if(c1 > c2) {
            return 1;
        }
        return -1;
    }
}


class C implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        // Compare based on last character
        int c1 = s1.length();
        int c2 = s2.length();
        if(c1 > c2) {
            return 1;
        }else if(c1<c2){
            return -1;
        }
        return 0;
    }
}

public class list {
    public static void main(String args[]){
        List<Integer> l = new ArrayList<Integer>();
        l.add(25);
        l.add(24);
        l.add(21);
        l.add(22);
        l.add(23);
        Collections.sort(l);
        System.out.println(l);
        l.add(62);
        l.add(87);
        l.add(45);
        Collections.sort(l,new A());
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.remove(4);
        System.out.println(l);


        List<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("mango");
        l1.add("gavendra");
        l1.add("pachahra");

        Collections.sort(l1);
        System.out.println(l1);

        l1.add("kiwi");
        l1.add("orange");
        l1.add("cherry");

        Collections.sort(l1, new B());
        System.out.println(l1);

        l1.remove(2);
        System.out.println(l1);
        l1.remove(4);
        System.out.println(l1);
        Collections.sort(l1, new C());
        System.out.println(l1);
        List<String> names = new ArrayList<>();
        names.add("Dhruv");
        names.add("Radhika");
        names.add("Raj");
        names.add("Sanskriti");

        // Default sorting (alphabetical)
        Collections.sort(names);
        System.out.println("Alphabetical: " + names);

        // Custom sorting (by length)
        Collections.sort(names, new AB());
        System.out.println("By length: " + names);
    }
}
