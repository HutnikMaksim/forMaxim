package by.it.hutnik.javazadachi_com;
/*
5. Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное
число и его наибольшую цифру.

 */
class Task_2_5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 420; i++) {
            int a = (int) (Math.random() * 900 + 100);
            System.out.print(a + "-");

            int x1 = Math.round(a / 100);
            int x2 = Math.round(a / 10) % 10;
            int x3 = a % 10;
            int temp = 0;
            if(x1 >= x2){
                temp = x1;
            } else temp = x2;
            if(temp <= x3){
                temp = x3;
            }

            System.out.print(" /" + temp + "/ ");

            if(i % 14 == 0){
                System.out.println();
            }
        }
    }
}
