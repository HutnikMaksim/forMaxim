package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_05;

class CompsreText {
    public static void main(String[] args) {
        String names = "   Максим Валерий Андрей Наталья Татьяна Светлана Максимка Анастасия Ксения Григорий София   ";
        names = names.trim();
        String[] s = names.split(" ");
        for(int j = 0; j < s.length - 1; j++) {
            for(int i = j + 1; i < s.length; i++) {
                if(s[i].compareToIgnoreCase(s[j]) < 0){
                    System.out.println(s[j] + " " + s[i]);
                    String temp = s[j];
                    s[j] = s[i];
                    s[i] = temp;
                    System.out.println(s[j] + " " + s[i]);
                }
            }
        }
        for (String txt : s){
            if(!txt.isEmpty()){ // Если длина строки txt не равна 0...
                System.out.print(txt + " ");
            }
        }
        System.out.println();
        for (String xtx : s){
            if(!xtx.isBlank()){
                System.out.println(xtx + "*");
            }
        }
        System.out.println();
        String max1 = "Максим первый";
        String max3 = "Максим третий";
        if(max1.compareToIgnoreCase(max3) < 0){ /* Идёт сравнение строк и если max по алфавиту раньше, то условие true */
            System.out.println(max1);
        } else {
            System.out.println(max3);
        }
    }
}
