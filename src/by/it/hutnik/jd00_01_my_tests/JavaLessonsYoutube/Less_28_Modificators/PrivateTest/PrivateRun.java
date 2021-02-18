package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PrivateTest;

import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.DefaultTest.DefaultTest;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.ProtectedTest.ProtectedTest;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PublicTest.PublicTest;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class PrivateRun {
    public static void main(String[] args) {
        PrivateTest privateTest2 = new PrivateTest();
//        System.out.println(privateTest2.name);
//        System.out.println(privateTest2.age);
        DefaultTest defaultTest2 = new DefaultTest();
//        System.out.println(defaultTest2.name);
//        System.out.println(defaultTest2.age);
        ProtectedTest protectedTest2 = new ProtectedTest();
//        System.out.println(protectedTest2.name);
//        System.out.println(protectedTest2.age);
        PublicTest publicTest2 = new PublicTest();
        System.out.println(publicTest2.name);
        System.out.println(publicTest2.age);
    }
}
