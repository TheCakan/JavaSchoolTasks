import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    static int id = 1;


    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(){
        id++;
    }

    public Student(String name){
        this.name = name;
    }

}
