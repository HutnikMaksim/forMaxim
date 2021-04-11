package hutnik.maksim.javaForJune.objects_klass;

class GlawnyClass {
    public static void main(String[] args) {
        Obj_Polya obj = new Obj_Polya();
        obj.name = obj.name+ " " + obj.word + " Gutnik";
        int h = obj.value - 2;
        System.out.println("Me name is: " + obj.name + " my height is: " + h + " cm");
    }
}
