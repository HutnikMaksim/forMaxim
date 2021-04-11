package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

import java.util.Scanner;

class Less_18_IncapsulationGettersSetters {
    public static void main(String[] args) {
        WareHouse wareHouse = new WareHouse();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter type good: ");
        String type = scanner.next();
        wareHouse.setTypeGoods(type);
        wareHouse.getTypeGoods();
        wareHouse.setNameGoods("Victoria 2.0");
        wareHouse.getNameGoods();
        wareHouse.setCountGoods(23);
        wareHouse.getCountGoods();
        wareHouse.setLeftGoods(11);
        wareHouse.getLeftGoods();
        System.out.println("Your choice: " + wareHouse.getTypeGoods() + " " + wareHouse.getNameGoods());
        System.out.println("We sold: " + wareHouse.getTypeGoods() +  " " + wareHouse.getNameGoods() +
                           " " + wareHouse.getCountGoods() + " st.");
        System.out.println("Left on the warehouse: " + wareHouse.getTypeGoods() + " " + wareHouse.getNameGoods() +
                           " " + wareHouse.getLeftGoods() + " st.");
    }
}
class WareHouse {
    private String typeOfGoods;
    private String nameOfGoods;
    private int countGoods;
    private int leftGoods;

    public void setTypeGoods(String type) {
        if (type.isEmpty()) {
            System.out.println("Enter type of Good!");
        } else {
            typeOfGoods = type;
        }
    }

    public String getTypeGoods() {
        return typeOfGoods;
    }

    public void setNameGoods(String name) {
        if (name.isEmpty()) {
            System.out.println("Enter name of Good!");
        } else {
            nameOfGoods = name;
        }
    }

    public String getNameGoods() {
        return nameOfGoods;
    }

    public void setCountGoods(int count) {
        if (count < 0) {
            System.out.println("Enter correct count good!");
        } else {
            countGoods = count;
        }
    }

    public int getCountGoods() {
        return countGoods;
    }

    public void setLeftGoods(int left) {
        if (left < 0) {
            System.out.println("Enter correct value left good!");
        } else {
            leftGoods = left;
        }
    }

    public int getLeftGoods(){
        return leftGoods;
    }
}
