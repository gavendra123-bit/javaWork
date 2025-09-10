import java.util.ArrayList;

public class Wrapper {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();
        names.add("Ananya");
        names.add("Yashvi");
        names.add("Swasti");
        names.add("Khushi");
        names.add("Sambhavi");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("**********************************************");
        System.out.println("################################################");
        System.out.println("=================================================");
        System.out.println(names);
        names.add("Anjali");
        names.add("Shivani");
        names.add("Juli");
        names.add("Babita");
        names.add("Sadhna");
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println("Size of list: "+names.size());
        for(String str: names) {
            System.out.println(str);
        }
        ArrayList list2=new ArrayList();
        list2.add(1);
        list2.add("Gavendra");
        System.out.println(list2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("**********************************************");
        System.out.println("################################################");
        System.out.println("=================================================");
    }
}
