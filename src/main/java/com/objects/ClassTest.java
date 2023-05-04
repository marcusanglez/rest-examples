package com.objects;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassTest {

    public static void main(String[] args)
    {
        Student s1 = new Student();

        // Getting hold of Class
        // object created by JVM.
        Class c1 = s1.getClass();

        // Printing type of object using c1.
        System.out.println(c1.getName());

        // getting all methods in an array
        System.out.println("Methods:");
        for (Method method : c1.getDeclaredMethods())
            //if (!method.canAccess())
            System.out.println(" - " + method.getName() + " " + method.isSynthetic());

        // getting all fields in an array
        System.out.println("declared fields:");
        for (Field field : c1.getDeclaredFields())
            System.out.println(field.getName());

        System.out.println("accessible:");
        Arrays.stream(c1.getFields())
                .forEach(field -> System.out.println(field));
    }

}
class Student {
    private String name;
    private int roll_No;

    public String fieldZ;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRoll_no() { return roll_No; }
    public void setRoll_no(int roll_no)
    {
        this.roll_No = roll_no;
    }
}
