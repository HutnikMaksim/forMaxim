package hutnik.maksim.javaForJune.Listing_7.Listing_7_2_UsingInterface;

class MyClass implements MyInterface{ /* если класс реализует интерфейс, то он должен описывать ВСЕ методы
                                        входящие в этот интерфейс */

    @Override // описание метода getNumber из интерфейса MyInterface
    public int getNumber(double x) {
        return (int) x;
    }

    @Override // описание метода getSymbol из интерфейса MyInterface
    public char getSymbol(int n) {
        return (char) ('A' + n);
    }
}
