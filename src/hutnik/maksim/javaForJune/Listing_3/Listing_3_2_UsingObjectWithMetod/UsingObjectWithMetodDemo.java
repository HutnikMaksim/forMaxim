package hutnik.maksim.javaForJune.Listing_3.Listing_3_2_UsingObjectWithMetod;

import javax.swing.*;

class UsingObjectWithMetodDemo {
    public static void main(String[] args) {
        MyClass objMyClass1 = new MyClass();
        objMyClass1.set(100, 'A'); // Передаёт аргументы в путсой метод set класса MyClass
        JOptionPane.showMessageDialog(null,objMyClass1.getInfo(), "Первый объект", 1);
        MyClass objMyClass2 = new MyClass();
        objMyClass2.set(200, 'B');
        JOptionPane.showMessageDialog(null, objMyClass2.getInfo(), "Второй объект", 1);
    }
}
