package hutnik.maksim.javaForJune.Listing_7.Listing_7_1_UsingAbstractClass;

class Triangle extends ColoredFigure{
    Triangle(String clr, int s){
        super(clr, s);
    }
    String getName(){
        return "треугольник";
    }
    double getArea(){
        double k = Math.sqrt(3) / 4;
        return Math.pow(2, size) * k;
    }
}
