package hutnik.maksim.javaForJune.Listing_8.Listing_8_9_My;

class Run {
    static MyClass createList(int n, char ch){
        MyClass obj = new MyClass(); /* Создание первого объекта (obj) цепочки объектов */
        obj.number = 1; /* Первому объекту (obj) присваиваем значение поля number = 1 */
        obj.symbol = ch; /* И значение поля char 'C' в случае создания объектной переменной А класса MyClass
        и 'E' в случае создания объектной переменной B класса MyClass */
        MyClass t = obj; /* Создаём объектную переменную (t) класса MyClass в которую будет записываться ссылка
        на последующий элемент в цепочке объектов. В данной строке объектная переменная имеет ссылку на объект
        MyClass c полями из 6 и 7 строки (int 1, char 'C' или char 'E'). А на завершающем этапе t будет
        ссылаться на последний объект в цепочке */
        for (int i = 1; i <=n ; i++) {
            t.next = new MyClass(); /* Создаётся новый объект в цепочке и ссылка на него записывается в поле
            (next) объекта, на который в данный момент ссылается переменная t. В первом проходе цикла она
            ссылается на объект obj из строки 9, а на этом этапе он у нас и первый и одновременно последний
            в цепочке */
            t.next.number = t.number + i; /* В поле next текущего объекта заносится значение поля number,
            которое равно сумме поля number из текущего объекта (1) и значению переменной i из цикла fori */
            t.next.symbol = (char) (t.symbol + i); /* а также значение поля symbol, которое приводится к типу
            char инструкцией (char) перед математической операцией сложения типов char и int (t.symbol + i) */
            t = t.next; /* Объектной переменной t, ссылающейся на первый объект из цепочки (строка 9), присваивается
            значение t.next, что по сути превращает её в ссылку на следующий объект из этой цепочки объектов.
            Полсе первого прохода цикла fori значение t будет ссылаться на первый объект из цикла, который
            по сути будет вторым объектом при печати в консоли, т.к. первый создан до цикла в строке 5.
            В строках 6 и 7 этому объекту присваиваются значения полей number=1 и symbol='C' (при этом значение
            symbol передаётся объекту в качестве аргумента при создании объектной переменной А класса MyClass
            из главного метода программы). Таким образом последний созданный объект next останется с незаполненным
            полем next... */
        }
        t.next = null; // ... с этой целью ему надо присвоить нулевое (пустое) значение, т.к. ссылаться ему не на что
        return obj; // Метод возващает ссылку на первый объект из цепочки объектов
    }
    static void showList(MyClass obj) { // аргументом методу передаётся первый объект (obj) в цепочке объектов
        String txt = "|";
        MyClass t =  obj;// Придаём объектной переменной t начальное значение - ссылку на первый объект цепочки
        do{
            txt += t.number + "-" + t.symbol + "|"; // Формируется строка в консоли
            t = t.next;// Объектной переменной t придаётся значение - ссылка на следующий объект цепочки
        } while (t != null); /* Когда на последнем объекте ссылка будет равна нулю (пустой ссылке), цикл while
        будет завершён*/
        System.out.println(txt); // Вывод на консоль строки txt, сформированной из значений полей объектов
    }

    public static void main(String[] args) {
        MyClass A = createList(3, 'C');
        MyClass B = createList(5, 'E');
        showList(A);
        showList(B);
    }
}
