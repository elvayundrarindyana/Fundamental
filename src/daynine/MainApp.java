package daynine;

public class MainApp {
    public static void main(String[] args) {
        Button button = new Button();
        button.setClickAction(new Clickable() {
            @Override
            public void onClick() {
                System.out.println("Tombol sudah di klik");
                System.out.println("Berhasil");
            }
        });
        button.doClick(); //action onclick
        Button buttonTwo = new Button();

        button.setClickAction(()->{ //function anonymous
        System.out.println("Tombol sudah di klik");
        System.out.println("Berhasil");
        });
    }
}