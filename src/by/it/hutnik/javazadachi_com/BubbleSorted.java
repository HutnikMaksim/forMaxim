package by.it.hutnik.javazadachi_com;

class BubbleSorted {//инициализация класса BubbleSorted
    public static void main(String[] args) {//инициализация основного метода main
        int[] mass = new int[]{13, 4, 20, 36, 33, 6, 7, 11, 0 ,19}; // создание массива
        boolean flag; // инициализация булевой переменной ФЛАГ
        printMass(mass); // вывод на консоль несортированного массива через метод printMass
        int last = mass.length - 1;//определение предпоследнего элемента, чтобы  mass[i+1] не выходил за пределы массива
        do{ // продолжать действия в фигурных скобках пока while(flag)==true
            flag = false;// опускаем ФЛАГ
            for (int i = 0; i < last; i++) { //включаем цикл перебора
                if(mass[i] > mass[i + 1]){ //условие перебора если элемент > следующего элемента
                    int temp = mass[i]; // если 1-й элемент > 2-го, то переменной temp присваиваем его значение
                    mass[i] = mass[i + 1]; //а 1-му элементу присваиваем значеине 2-го элемента
                    mass[i + 1] = temp;//2-му элементу присваиваем значение 1-го из временной переменной temp
                    flag = true;// поднимаем ФЛАГ
                }
            }
            last--;//уменьшаем на единицу предпоследний элемент в цикле перебора,
            // т.к. последний у нас стал на своё место и его перебирать не нужно
        }
        while (flag);//пока ФЛАГ поднят (flag == true)
        printMass(mass);// распечатываем отсортированный массив через метод printMass
    }
   private static void printMass (int[] m){//инициализация метода printMass
        for (int mass : m){//улучшеный цикл перербора всего массива
            System.out.print(mass + " ");// вывод на консоль массива
        }
        System.out.println();// перевод строки между несортированным и сортированным массивами
   }
}
