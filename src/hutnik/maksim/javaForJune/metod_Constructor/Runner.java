package hutnik.maksim.javaForJune.metod_Constructor;

class Runner {
    public static void main(String[] args) {
        ObjContructor objC1 = new ObjContructor();
        ObjContructor objC2 = new ObjContructor(200 , 'B');
        System.out.println("Obj_C1: ");
        objC1.show();
        System.out.println("Obj_C2: ");
        objC2.show();
    }
}
