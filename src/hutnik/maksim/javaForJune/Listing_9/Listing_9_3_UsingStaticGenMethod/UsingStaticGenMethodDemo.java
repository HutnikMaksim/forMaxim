package hutnik.maksim.javaForJune.Listing_9.Listing_9_3_UsingStaticGenMethod;

class UsingStaticGenMethodDemo {
    static <X> void show(X arg){
        System.out.println(arg);
    }
    static <X> void show(X[] array) {
        System.out.print("| ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        //System.out.println(""); Ненужная строка кода!
    }
    static <X> X getElement(X[] array, int index){
        return array[index];
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 7, 2};
        Character[] symbs = {'A', 'W', 'L', 'O', 'B'};
        System.out.println("Вызов метоа show()");
        System.out.print("С текстовым аргументом: ");
        show("обобщённый метод");
        System.out.print("С int-аргументом: ");
        show(123);
        System.out.print("С double-фргументом: ");
        show(123.45);
        System.out.print("С char-аргументом: ");
        show('A');
        System.out.print("Целочисленный массив: ");
        show(nums);
        System.out.print("\nСимвольный массив: ");
        show(symbs);
        System.out.println("\nВызов метода getElements()");
        System.out.print("Целочисленный массив: * ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(getElement(nums, i) + " * ");
        }
        System.out.print("\nСимвольный массив: * ");
        for (int i = 0; i < symbs.length; i++) {
            System.out.print(getElement(symbs, i) + " * ");
        }
        System.out.println();
    }
}
