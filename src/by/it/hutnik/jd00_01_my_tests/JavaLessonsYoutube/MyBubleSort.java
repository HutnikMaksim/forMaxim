package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

class MyBubleSort {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        int[] massiv = new int[99];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) (Math.random() * 99) + 1;
        }

        PrintMassiv(massiv);
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < massiv.length - 1; i++) {
                if(massiv[i] > massiv[i + 1]){
                    int temp = massiv[i];
                    massiv[i] = massiv[i + 1];
                    massiv[i + 1] = temp;
                    sorted = false;
                }

            }
                if (sorted == true) {
                    break;
                }

            }
        PrintMassiv(massiv);

        int minValue = massiv[0];
        int maxValue = massiv[massiv.length - 1];
        System.out.println("min = " + minValue + ", max = " + maxValue);

        long after = System.currentTimeMillis() - before;
        System.out.println("Time is: " + after);

        }
        private static void PrintMassiv(int[] arr){
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                if(i > 0){
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
            }
            System.out.println("]");
        }
    }
