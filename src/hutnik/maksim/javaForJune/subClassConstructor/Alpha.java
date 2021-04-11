package hutnik.maksim.javaForJune.subClassConstructor;

import java.io.StringReader;

class Alpha {
    String name;
    int code;
    Alpha(String name, int code){ /* имена аргументов конструктора совпадают с именами полей класса Alpha,
                                    а в теле метода или конструктора локальные переменные (в данном случае
                                    аргументы конструктора), имеют приоритет над полями класса*/
        this.name = name; /* чтобы в этом конструкторе получить доступ к полям класса Alpha: name и code, необходимо
                             выполнить полную ссылку на поле, указанием объекта из которого будет вызываться метод */
        this.code = code; // а здесь: this.code = code;
        System.out.println("Класс Alpha:");
        System.out.println("Поле name - " + this.name);
        System.out.println("Поле code - " + this.code);
    }
    Alpha(String name){
        this(name, 0);
    }
    Alpha(int code){
        this("Белый", code);
    }
    Alpha(){
        this("Жёлтый", 1);
    }
}
