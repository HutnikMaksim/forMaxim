package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_05;

class SortMassString {
    public static void main(String[] args) {
        String names = " Максим Валерий Андрей Наталья Татьяна Светлана Анастасия Ксения Григорий София ";
        names = names.trim();
        String[] massNames = names.split(" ");
        for(int i = 0; i < massNames.length - 1; i++) {
            for(int j = i + 1; j < massNames.length; j++) {
                if(massNames[j].compareToIgnoreCase(massNames[i]) < 0){
                    String temp = massNames[j];
                    massNames[j] = massNames[i];
                    massNames[i] = temp;
                }
            }
        }
        for (String str : massNames){
            if(!str.isEmpty()){
                System.out.println(str + " ");
            }
        }
    }
}
