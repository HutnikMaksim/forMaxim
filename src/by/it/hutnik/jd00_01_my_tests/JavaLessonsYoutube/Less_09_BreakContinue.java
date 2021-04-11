package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

class Less_09_BreakContinue {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            i++;
            System.out.println(i);
            if(i == 9882){
                break;
            }
        }
        for (int j = 0; j <=15; j++) {
            if(j % 2 == 0){
                continue;
            }
            System.out.println("Your number is " + j);
        }
    }
}
