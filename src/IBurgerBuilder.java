public interface IBurgerBuilder {
    IBurgerBuilder addBut();
    IBurgerBuilder addCutlet();
    IBurgerBuilder addSalad();
    IBurgerBuilder addCheese();
    IBurgerBuilder addCucumber();
    IBurgerBuilder addSauce();
    IBurgerBuilder addOnion();
    Burger getBurger();
}
