package hutnik.maksim.javaForJune.reloadingMetods;

class Runner {
    public static void main(String[] args) {
        Obj_Metods obj_metods1 = new Obj_Metods();
        Obj_Metods obj_metods2 = new Obj_Metods();
        obj_metods1.set(100);
        obj_metods1.set('A');
        System.out.println("Объект obj_metods1");
        obj_metods1.show();
        obj_metods2.set();
        obj_metods2.show("Объект obj_metods2");
        obj_metods2.set(200, 'B');
        System.out.println("Объект obj_metods2 после измнения:");
        obj_metods2.show("Число", "Символ");
    }
}
