package by.it.hutnik.javazadachi_com;
/*
В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
«Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как,
например, в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю каждого
счастливого билета и теперь раздумывает, как много сувениров потребуется.
С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
 */
public class Task_4_15 {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        int a = 0;
        int b = 0;
        int sumA = 0;
        int sumB = 0;
        int res = 0;
        int temp = 0;
        String strA;
        String strB;

        for (int i = 1000; i < 1000000; i++) {
            a = i / 1000;
            b = i % 1000;
            strA = new String("" + a);
            char[] charA = strA.toCharArray();
            int[] massA = new int[strA.length()];
            for (int j = 0; j < charA.length; j++) {
                massA[j] = Character.getNumericValue(charA[j]);
            }
            for (int j = 0; j < massA.length; j++) {
                sumA += massA[j];
            }

            strB = new String("" + b);
            char[] charB = strB.toCharArray();
            int[] massB = new int[strB.length()];
            for (int j = 0; j < charB.length; j++) {
                massB[j] = Character.getNumericValue(charB[j]);
            }
            for (int j = 0; j < massB.length; j++) {
                sumB += massB[j];
            }
            if(sumA == sumB){
                System.out.printf("%03d'%03d  / ", a, b);
                temp++;
                res++;
                if(temp % 12 == 0){
                    System.out.println();
                }
            }
            sumA = 0;
            sumB = 0;
        }
        System.out.println();
        System.out.println("Количество счастливых билетов в серии от 000'001 до 999'999 = " + res);
        long timeStop = System.currentTimeMillis() - timeStart;

        String strSec;
        if(timeStop % 10 == 1){
            strSec = " миллисекунда";
        } else{
            if(timeStop % 10 == 0 || timeStop % 10 > 4){
                strSec = " миллисекунд";
            } else {
                strSec = " миллисекунды";
            }
        }
        System.out.println("Время затраченное на подсчёт = " + timeStop + strSec);
    }
}
