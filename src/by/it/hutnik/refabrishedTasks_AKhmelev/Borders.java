package by.it.hutnik.refabrishedTasks_AKhmelev;

class Borders {
    char lT = 9556; // ╔
    char hTC = 9574; // ╦
    char rT = 9559; // ╗

    char h2 = 9552; // ═
    char v2 = 9553; // ║

    char lB = 9562; // ╚
    char rB = 9565; // ╝
    char hBC = 9577; // ╩
    char vL = 9568; // ╠
    char vR = 9571; // ╣
    char vC = 9580; // ╬

    String vetrLiniaString = "";
    String space = "═══════════";

//    int spaceSymbols = 11;
//        for(int i = 0; i < 11; i++) {
//        space += h2;
//    }

    void borderTop(){
        // рисуем верхнюю границу таблицы массива А ╔═╦═╦═╦═╦═╗
        System.out.println(lT + space + hTC + space + hTC + space + hTC + space + hTC + space + rT);
        System.out.print(v2);
    }

    void borderCenter(){
        System.out.println();
        System.out.println(vL + space + vC + space + vC + space + vC + space + vC + space + vR);
        System.out.print(v2);
    }

    void borderBottom(){
        System.out.println();
        System.out.printf("");
        System.out.println(lB + space + hBC + space + hBC + space + hBC + space + hBC + space + rB);
    }

}
