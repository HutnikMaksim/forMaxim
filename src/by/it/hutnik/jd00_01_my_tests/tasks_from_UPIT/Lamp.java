package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

public class Lamp {
    private boolean isOn;
    public void on(){
        this.isOn = true;
    }
    public void of(){
        this.isOn = false;
    }
    public boolean getState(){
        return isOn;
    }

    public static void main(String[] args) {
        Lamp first;
        first = new Lamp();
        first.of();
        System.out.println(first.getState());
    }

}
