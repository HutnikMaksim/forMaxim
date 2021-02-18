package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PublicTest;

import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.DefaultTest.DefaultTest;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PrivateTest.PrivateTest;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.ProtectedTest.ProtectedTest;

public class PublicRun {
    public static void main(String[] args) {
        PublicTest publicTest4 = new PublicTest();
        System.out.println(publicTest4.name);
        System.out.println(publicTest4.age);
        DefaultTest defaultTest4 = new DefaultTest();
//        System.out.println(defaultTest4.name);
//        System.out.println(defaultTest4.age);
        PrivateTest privateTest4 = new PrivateTest();
//        System.out.println(privateTest4.name);
//        System.out.println(privateTest4.age);
        ProtectedTest protectedTest4 = new ProtectedTest();
//        System.out.println(protectedTest4.name);
//        System.out.println(protectedTest4.age);
    }
}
