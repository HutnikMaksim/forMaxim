package by.it.hutnik.javazadachi_com;
/*
4. Вычислить и вывести на экран косинусы углов в 60, 45 и 40 градусов без использования функции Math.toDegrees(n).
 */
public class Task_3_4 {
    public static void main(String[] args) {
        int a = 40, b = 45, c = 60;
        double aRad = a * (Math.PI / 180);
        double bRad = b * (Math.PI / 180);
        double cRad = c * (Math.PI / 180);
        double aCos = (Math.cos(aRad));
        double bCos = (Math.cos(bRad));
        double cCos = (Math.cos(cRad));
        System.out.printf("Косинус угла %2d градусов = %.2f \n", a, aCos);
        System.out.printf("Косинус угла %2d градусов = %.2f \n", b, bCos);
        System.out.printf("Косинус угла %2d градусов = %.2f \n", c, cCos);

        double aaRad = (Math.toRadians(40));
        double bbRad = (Math.toRadians(45));
        double ccRad = (Math.toRadians(60));

        double aaCos = (Math.cos(aaRad));
        double bbCos = (Math.cos(bbRad));
        double ccCos = (Math.cos(ccRad));
        System.out.printf("COS %2d = %.2f \n", a, aaCos);
        System.out.printf("COS %2d = %.2f \n", b, bbCos);
        System.out.printf("COS %2d = %.2f \n", c, ccCos);
    }
}
