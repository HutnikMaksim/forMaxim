package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube.Less_28_Modificators;

public class MinMaxValueInArray {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        int maxValue = 0;

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99) + 1;
        }
        PrintArray(array);

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxValue){
                int temp = array[i];
                maxValue = temp;
            }
        }
        int minValue = maxValue;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minValue){
                int temp = array[i];
                minValue = temp;
            }
        }



        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        PrintArray(array);
        boolean resMin = false;
        boolean resMax = false;

        if(array[0] == minValue){
            resMin = true;
            System.out.println("Min value is: " + minValue + " " + resMin);
        }
        if(array[array.length - 1] == maxValue){
            resMax = true;
            System.out.println("Max value is: " + maxValue + " " + resMax);
        }


        long after = System.currentTimeMillis() - before;
        System.out.println("Time is: " + after);
    }

    private static void PrintArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i > 0){
                System.out.print(", " + arr[i]);
            } else {
                System.out.print(arr[i]);
            }
        }
            System.out.println("]");
    }
}