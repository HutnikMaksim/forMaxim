package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators;

import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.DefaultTest.DefaultTest;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PrivateTest.PrivateRun;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PrivateTest.PrivateTest;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.ProtectedTest.ProtectedTest;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PublicTest.PublicTest;

public class Run1 {
    public static void main(String[] args) {
        DefaultTest defaultTest5 = new DefaultTest();
//        System.out.println(defaultTest5.name);
//        System.out.println(defaultTest5.age);
        PrivateTest privateTest5 = new PrivateTest();
//        System.out.println(privateTest5.name);
//        System.out.println(privateTest5.age);
        ProtectedTest protectedTest5 = new ProtectedTest();
//        System.out.println(protectedTest5.name);
//        System.out.println(protectedTest5.age);
        PublicTest publicTest5 = new PublicTest();
        System.out.println(publicTest5.name);
        System.out.println(publicTest5.age);
    }
}
