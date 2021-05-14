package hutnik.maksim.javaForJune.Listing_5;

class Listing_5_6_Show2DArrayDemo {
    static void show(int[][] num){
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] alfa = {{1, 2, 3}, {4, 5, 6}};
        int[][] bravo  = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println("Вывод массивa ALFA:");
        show(alfa);
        System.out.println("Вывод массива BRAVO:");
        show(bravo);
    }
}
