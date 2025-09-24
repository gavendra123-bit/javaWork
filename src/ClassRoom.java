import java.util.*;

class stu implements Comparable<stu> {
    String name;
    int rollno;
    stu(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public String toString(){
        return name+ " " +rollno;
    }
    public int compareTo(stu that){
        return this.rollno - that.rollno;
    }
}

public class ClassRoom {
    public static void main(String str[]){
        List<stu> list = new ArrayList<>();
        list.add(new stu("Gavendra", 111));
        list.add(new stu("Brajesh", 90));
        list.add(new stu("Raghav", 10));
        list.add(new stu("Pushpendra", 1));
        Collections.sort(list);
        System.out.println(list);
    }
}
