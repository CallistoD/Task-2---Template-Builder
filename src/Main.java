public class Main {
    public static void main(String[] args) {
        IBurgerBuilder classicBurgerBuilder = new ClassicBurgerBuilder();
        Burger burger = classicBurgerBuilder
                .addBut()
                .addSauce()
                .addCutlet()
                .addCheese()
                .addSalad()
                .addOnion()
                .addCucumber()
                .addBut()
                .getBurger();

        System.out.println(burger);
    }
}