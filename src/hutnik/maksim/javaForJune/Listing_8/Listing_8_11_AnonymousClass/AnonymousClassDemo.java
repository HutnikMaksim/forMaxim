package hutnik.maksim.javaForJune.Listing_8.Listing_8_11_AnonymousClass;

class AnonymousClassDemo {
    public static void main(String[] args) {
        Base obj = new Base("Красный") {
            @Override
            void hello() {
                System.out.println("Объект анаонимного класса");
            }
        };
        obj.show();
        obj.hello();
        new Base("Зелёный"){
            void hello(){
                System.out.println("Анонимный объект");
            }
            void showAll(){
                hello();
                show();
            }
        }.showAll();
    }
}
