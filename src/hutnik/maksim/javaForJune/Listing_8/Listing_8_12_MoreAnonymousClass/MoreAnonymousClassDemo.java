package hutnik.maksim.javaForJune.Listing_8.Listing_8_12_MoreAnonymousClass;

class MoreAnonymousClassDemo {
    public static void main(String[] args) {
        Base obj = new Base() {
            @Override
            public void hello() {
                System.out.println("Объект анонимного класса");
            }
        };
        obj.show();
        obj.hello();
        new Base(){
            public void hello(){
                System.out.println("Анонимный объект");
            }
            void showAll(){
                hello();
                show();
            }
        }.showAll();
    }
}
