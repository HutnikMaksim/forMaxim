package hutnik.maksim.meloch.objects_klass_metods;

public class MetodKlass {
    ObjektKlass obj_kl = new ObjektKlass();
    void setDouble (int a, char b){
        obj_kl.numer = a;
        obj_kl.ch = b;
    }
    String getInfo (){
        String text = "Number " + obj_kl.numer + "\n";
        text += "Symbol " + obj_kl.ch + "\n";
        text += obj_kl.str;
        return text;
    }

}
