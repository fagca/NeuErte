package Gun_31_2;

import java.util.ArrayList;
import java.util.HashSet;

public class Student {
    int id;
    String name;
    String surName;

    static int sayac = 0;

    public Student(String name, String surName) {
        
        this.name = name;
        this.surName = surName;
        this.id = ++sayac;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
    


}
