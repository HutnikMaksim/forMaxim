package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_03;

/* A. Реализуйте статические методы ввода и простого/форматного вывода для одномерных
массивов типа double. Разместите эти методы в классе  InOut
 Сигнатура для ввода: static double[] getArray(String line)
 Сигнатуры для вывода: static void printArray(double[] arr) (используйте System.out.print)
 ( а тут printf ) static void printArray(double[] arr, String name, int columnCount) */

class InOut {

//    static String consoleReadLine() throws IOException{
//        InputStreamReader iSR = new InputStreamReader(System.in);
//        BufferedReader line = new BufferedReader(iSR);
//        String out = line.readLine();
//        return out;
//    }

    public static double[] getArray(String line){
        line = line.trim();
        String[] elemString = line.split(" ");
        double[] arr = new double[elemString.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(elemString[i]);
        }
        return arr;
    }

    static void printArray(double[] arr){
        for (double x: arr){
            System.out.printf("[%4.2f] ", x);
        }
        System.out.println();
    }

    static void printArray(double[][] mas){
        for (double[] x : mas){
            for (double y : x){
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

    static void printArray(double[] arr, String name, int columnCount){
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s [% -3d] = %-4.2f *** ", name, i, arr[i]);
            c++;
            if(c % columnCount == 0){
                System.out.println();
            }
        }
        System.out.println();
    }

}
