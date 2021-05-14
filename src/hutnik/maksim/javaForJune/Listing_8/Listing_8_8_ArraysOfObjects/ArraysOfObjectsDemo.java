package hutnik.maksim.javaForJune.Listing_8.Listing_8_8_ArraysOfObjects;

class ArraysOfObjectsDemo {
    static MyClass[] createBinoms(int n){ /* Метод createBinoms(int n) служит для создания массива объектов */
        MyClass[] bins = new MyClass[n + 1]; /* Объявляется переменная массива bins. Этот массив - массив
        объектов, т.к. тип результата метода определён инструкцией MyClass[]. */
        bins[0] = new MyClass(1); /* Первому элементу массива bins[0] присваивается значение нового объекта
        MyClass() с аргументом (1) в скобках */
        for (int i = 1; i <= n; i++) {
            bins[i] = new MyClass(bins[i - 1].get() * (n - i + 1) / i);
        }
        return bins; // Метод возвращает массив bins
    }
    static void show(MyClass[] objs){
        String txt = "|";
        for (int i = 0; i < objs.length; i++) {
            txt += objs[i].get() + "|";
        }
        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClass[] A = createBinoms(5); /* Создаётся массив объектов А. Ему присваивается значение
        возвращаемое методом createBinoms() с аргументом 5 */
        MyClass[] B = createBinoms(10);
        show(A);
        show(B);
    }
}
