package by.it.hutnik.javazadachi_com;

import java.util.*;

class DinamicArrayAndSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        List<Integer> mass = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            int a = (int) (Math.random() * 100 - 50);
            //System.out.printf("%2d ", a);
            mass.add(a);
        }
        //System.out.println();
        System.out.println(mass);

//        boolean swap;
//        int last = mass.size() - 1;
//        do{
//            swap = false;
//            for (int i = 0; i < last; i++) {
//                if(mass.get(i) > mass.get(i + 1)){
//                    int temp = mass.get(i);
//                    mass.set(i, mass.get(i + 1));
//                    mass.set(i + 1, temp);
//                    swap = true;
//                }
//            }
//            last--;
//        }
//        while (swap);
//        System.out.println(mass);

        Collections.sort(mass);// встроеный метод сортировки
        System.out.println(mass);
        Collections.reverse(mass);
        System.out.println(mass);
        System.out.print("sefd");



//        System.out.println(mass.get(4) + " " + mass.get(6));
//        System.out.println(mass.set(5, mass.get(1)));
//        System.out.println(mass);
    }
}
