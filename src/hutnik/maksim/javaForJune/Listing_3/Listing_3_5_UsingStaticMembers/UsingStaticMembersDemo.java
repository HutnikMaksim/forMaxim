package hutnik.maksim.javaForJune.Listing_3.Listing_3_5_UsingStaticMembers;

class UsingStaticMembersDemo {
    public static void main(String[] args) {
        MyClass.show();
        MyClass objMyClassA = new MyClass();
        MyClass objMyClassB = new MyClass();
        MyClass objMyClassC = new MyClass();
        MyClass.show();
        objMyClassB.show(); /* Здесь программа ругается, т.к. предпочтительнее обращаться к статическому
                               члену класса (методу static void show()) непосредственно через класс,
                               как в строке выше MyClass.show(), а не через его объект objMyClassB.show()*/
        objMyClassC.show(); /* Компилятор даже не предлагает подстановки метода show() после точки... */
    }
}
