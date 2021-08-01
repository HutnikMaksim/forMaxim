package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_05;
import static java.lang.Math.*;
class TaskC {
    public static void main(String[] args) {
        double z; // объявление переменной z
        int n = (int) (random() * 21) + 20; // инициализация метода Random в диапазоне от 20 до 40
        double step = 3.67 / n; // инициализация шага изменения аргумента х (5.33 <= x <= 9)
        double x = 5.33; // начальное значение аргумента х
        int c = 0; // счётчик итераций метода for() для переноса строк массива
        int count = 0; // счётчик количества элементов массива massA[] > 3.5
        int r = 0; // счётчик для синхронизации элементов в массиве massB[] (так как в массиве massA
                   // элементов будет больше или равно количеству элементов в массиве massB, то
                   // тупо передать в методе for() значение massA[i] значению massB[i] нельзя, т.к.
                   // при выпадении одного элемента (значение которого < 3.5) приведёт к тому, что в
                   // массиве massB[i] будет записан null
        double a = 1.0; // переменная для вычисления производной всех значений z
        double[] massA = new double[n]; // инициализация массива massA[] с количеством элементов n
        System.out.println("Массив A[]");
        for(int i = 0; i < n; i++) { // перебор всех значений х с шагом step
            z = cbrt(pow(x, 2) + 4.5);
            x += step; // увеличение шага х
            massA[i] = z; // заполнение массива massA[]
            c++; // увеличение счётчика итераций для переноса строк массива massA (для лучшей читаемости)
            System.out.printf("A [% 2d] = %.5f\t", i, z); // форматный вывод на экран значений массива massA
            if(c % 5 == 0){ // если строка достигла длины в 5 элементов, то выполнить...
                System.out.println(); // ...перенос строки
            }
            if(z > 3.5){ // если значение z > 3.5, то...
                count++; // ...начать подсчёт количества таких элементов в массиве massA[]
                a *= z; // произведение всех значений массива massA, соответствующих условию z > 3.5
                        // для вычисления среднего геометрического значения (вычисляется как
                        // корень в степени n от произведения n значений
            }
        }
        double[] massB = new double[count]; // инициализация массива massB[] с количеством элементов
                                            // равным счётчику count (кол-во эл-тов массива massA[],
                                            // соответствующих условию
        c = 0; // обнуление счётчика переноса строк
        System.out.println();
        System.out.println("Массив B[] из элементов массива A > 3.5");

        for(int i = 0; i < massA.length; i++) { // перебор всех элементов массива massA[], для выявления
                                                // соответствия условию z > 3.5
            if(massA[i] > 3.5){ // если условие соотс=ветствует, тогда...
                massB[i - r] = massA[i]; // присвоить элементу massB[i - r] значение элемента massA[i]
                System.out.printf("B [% 2d] = %.5f\t", i - r, massB[i - r]); // форматный вывод на экран
                                                                             // значений массива massВ
                c++;// увеличение счётчика итераций для переноса строк массива massВ (для лучшей читаемости)
                if(c % 5 == 0 ){ // если строка достигла длины в 5 элементов, то выполнить...
                    System.out.println(); // ...перенос строки
                }
            } else { // иначе...
                r++; // ... увеличить счётчик для синхронизации элементов в массиве massB[]
            }
        }
        System.out.println();
        double w = (Math.pow(a, 1.0 / c)); // вычисление среднего геометрического значения всех
                                           // элементов массива massB[]
        System.out.println("Среднее геометрическое = " + w); // вывод на экран среднего геометрического значения
    }
}
