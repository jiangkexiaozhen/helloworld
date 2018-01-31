import java.awt.*;
import java.util.Iterator;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        class student{
            String name;
            int age;
            float score;
            ArrayList<String> serialNumber = new ArrayList<String>();

            void say() {
                System.out.println("学生名字=["+ name + "],年龄是=[" + age + "]，成绩是=[" + score + "],电话号码=[" + serialNumber + "]\r");
            }
        };

        student jouirSchool = new student();
        jouirSchool.name = "Paul Lee";
        jouirSchool.age  = 10;
        jouirSchool.score= (float)(99.5);
        jouirSchool.serialNumber.add("93900300939") ;
        jouirSchool.serialNumber.add("93393993939") ;

        jouirSchool.say();

        System.out.println("file end!");
    }
}
