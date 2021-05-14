package hutnik.maksim.javaForJune.Listing_7.Listing_7_1_UsingAbstractClass;

class Circle extends ColoredFigure{
    Circle(String clr, int s){
        super(clr, s);
    }
    String getName(){
        return "круг";
    }
    double getArea(){
        double k = Math.PI;
        return Math.pow(2, size) * k;
    }
    String getSizeName(){
        return "радиус";
    }

}
