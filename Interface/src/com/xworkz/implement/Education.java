package com.xworkz.implement;

import com.xworkz.internal.Student;
import com.xworkz.internal.Teacher;

public class Education implements Teacher, Student {
    public void teach() {
        System.out.println("Teacher is teaching...");
    }
    public void study() {
        System.out.println("Student studying...");
    }
}
