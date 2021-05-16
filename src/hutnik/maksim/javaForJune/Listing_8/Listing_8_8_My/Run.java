package hutnik.maksim.javaForJune.Listing_8.Listing_8_8_My;

class Run {
    static MyClass[] createObj(int n, char c){
        MyClass[] arrayObjects = new MyClass[n + 1];
        arrayObjects[0] = new MyClass(1, 'A');
        arrayObjects[6] = new MyClass(7, 'Ё');
        for (int i = 1; i <= n; i++) {
            if(i == 6 & c == 1046) // Если массив состоит из кириллицы, то в 7 позицию вставляем букву Ё
                continue;
            arrayObjects[i] = new MyClass(i+1, c++);
        }
        return arrayObjects;
    }
    static void show(MyClass[] obj){
        System.out.print("|");
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i].getI() + "-" + obj[i].getC() + "|");
        }
    }

    public static void main(String[] args) {
        MyClass[] A = createObj(32, 'Б');
        MyClass[] B = createObj(25, 'B');
        show(A);
        System.out.println();
        show(B);
    }
}
