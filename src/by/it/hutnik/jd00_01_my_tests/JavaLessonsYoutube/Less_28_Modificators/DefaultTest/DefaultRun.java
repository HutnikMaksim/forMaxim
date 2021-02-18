package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.DefaultTest;

import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PrivateTest.PrivateRun;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PrivateTest.PrivateTest;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.ProtectedTest.ProtectedTest;
import by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators.PublicTest.PublicTest;

public class DefaultRun{
    public static void main(String[] args) {
        DefaultTest defaultTest1 = new DefaultTest();
        System.out.println(defaultTest1.name);
        System.out.println(defaultTest1.age);
        PrivateTest privateTest1 = new PrivateTest();
//        System.out.println(privateTest1.name);
//        System.out.println(privateTest1.age);
        ProtectedTest protectedTest1 = new ProtectedTest();
//        System.out.println(protectedTest1.name);
//        System.out.println(protectedTest1.age);
        PublicTest publicTest1 = new PublicTest();
        System.out.println(publicTest1.name);
        System.out.println(publicTest1.age);
    }
}
