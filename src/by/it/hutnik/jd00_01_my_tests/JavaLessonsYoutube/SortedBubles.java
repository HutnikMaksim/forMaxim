package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

class SortedBubles {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
        long before = System.currentTimeMillis();
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted == true){
                break;
            }
            System.out.println();
            for (int arr : array) {
                System.out.print(arr + " ");
            }
        }
        System.out.println();
        long after = System.currentTimeMillis() - before;
        System.out.println("Time = " + after);
    }
}


