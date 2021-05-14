package hutnik.maksim.javaForJune.Listing_7.Listing_7_1_UsingAbstractClass;

abstract class ColoredFigure {
    String color;
    int size;
    ColoredFigure(String clr, int s){
        color = clr;
        size = s;
    }
    void show(){
        System.out.println("Фигура: " + color + " " + getName());
        System.out.println("Характерный размер (" + getSizeName() + "): " + size);
        System.out.printf("Площадь: %.3f \n", getArea());
        String line = "";
        for (int i = 0; i < 23; i++) {
            line += "-";
        }
        System.out.println(line);
    }

    String getSizeName() {
        return "сторона";
    }

    abstract String getName();
    abstract double getArea();
}
