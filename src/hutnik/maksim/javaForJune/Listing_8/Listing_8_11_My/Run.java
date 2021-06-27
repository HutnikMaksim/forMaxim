package hutnik.maksim.javaForJune.Listing_8.Listing_8_11_My;

class Run {
    public static void main(String[] args) {
        Base baseObj = new Base("Первый"){

            @Override
            void hello() {
                System.out.println("Создаём анонимный объект");
            }
        };
        baseObj.show();
        baseObj.hello();

        new Base("Второй"){
            @Override
            void hello() {
                System.out.println("Анонимный объект");
            }

            @Override
            void show() {
                super.show();
            }
        }.show();
    }
}
