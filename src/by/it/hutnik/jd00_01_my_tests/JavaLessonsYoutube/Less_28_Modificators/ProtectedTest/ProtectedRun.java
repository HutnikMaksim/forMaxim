package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.ProtectedTest;

import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.DefaultTest.DefaultTest;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PrivateTest.PrivateTest;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PublicTest.PublicTest;

public class ProtectedRun {
    public static void main(String[] args) {
        ProtectedTest protectedTest3 = new ProtectedTest();
        System.out.println(protectedTest3.name);
        System.out.println(protectedTest3.age);
        DefaultTest defaultTest3 = new DefaultTest();
//        System.out.println(defaultTest3.name);
//        System.out.println(defaultTest3.age);
        PrivateTest privateTest3 = new PrivateTest();
//        System.out.println(privateTest3.name);
//        System.out.println(privateTest3.age);
        PublicTest publicTest3 = new PublicTest();
        System.out.println(publicTest3.name);
        System.out.println(publicTest3.age);
    }
}
