package hutnik.maksim.javaForJune.Listing_7.Listing_7_1_UsingAbstractClass;

class Square extends ColoredFigure {
    Square(String clr, int s){
        super(clr, s);
    }
    String getName(){
        return "квадрат";
    }
    double getArea(){
        double k = 1;
        return Math.pow(2, size) * k;
    }
}
