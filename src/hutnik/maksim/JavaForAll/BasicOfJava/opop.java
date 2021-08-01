package hutnik.maksim.JavaForAll.BasicOfJava;

class opop {
    public static void main(String[] args) {
        byte x = 100, y = 92, z;
        float f;
        z = (byte) (x + y);
        f = 3.3f;
        System.out.println(z +" " + f);
        char a = 'A';
        a = (char) (a + 1);
        System.out.println(a);
        a += 11;
        System.out.println(a);
        a++;
        System.out.println(a);
        System.out.println();
        System.out.println(a++);
        System.out.println(a);

    }
}
