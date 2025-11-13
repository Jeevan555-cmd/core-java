package com.xworkz.external;

import com.xworkz.implement.Education;
import com.xworkz.internal.Student;
import com.xworkz.internal.Teacher;

public class EducationRunner {
    public static void main(String[] args) {

        Teacher teacher = new Education();
        teacher.teach();

        Student student = new Education();
        student.study();
    }
}
