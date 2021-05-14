package hutnik.maksim.javaForJune.Listing_7.Listing_7_1_UsingAbstractClass;

class UsingAbstrctClass {
    public static void main(String[] args) {
        Triangle T = new Triangle("красный", 2);
        Square S = new Square("чёрный", 3);
        Circle C = new Circle("жёлтый", 1);
        System.out.println("Использование объектных переменных подкласса");
        T.show();
        S.show();
        C.show();
        ColoredFigure F;
        System.out.println("Использование объектной переменной абстрактного суперкласса");
        F = T;
        F.show();
        F = S;
        F.show();
        F = C;
        F.show();
    }
}
