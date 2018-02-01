import java.awt.*;
import java.util.Iterator;  // 迭代器
import java.util.ArrayList; //矩阵序列
import java.util.Date;      // 导入 java.util 包下的 Date 类
import java.util.Scanner;   // 导入 java.util 包下的 Scanner 类
import javax.swing.*;       // 导入 javax.swing 包下的所有类，* 表示所有类

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
        jouirSchool.serialNumber.add("93900300939") ;;
        jouirSchool.say();

         class Dog{
            String name;
            int age;
            // 构造方法，没有返回值
            Dog(String name1, int age1){
                name = name1;
                age = age1;
                System.out.println("感谢主人领养了我");
            }
            // 普通方法，必须有返回值
            void bark(){ System.out.println("汪汪，不要过来");}
            void hungry(){System.out.println("主人，我饿了");}
         }
        Dog myDog = new Dog("花花", 3);
        myDog.bark();
        myDog.hungry();

        System.out.println("file end!");
    }


}
