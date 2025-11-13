package com.xworkz.external;

import com.xworkz.imp.MIT;
import com.xworkz.internal.University;

public class UniversityRunner {
    public static void main(String[] args) {
        University u = new MIT();
        u.admission();
        u.courses();
    }
}
