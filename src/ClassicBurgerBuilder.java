public class ClassicBurgerBuilder implements IBurgerBuilder {
    private String but;
    private String cutlet;
    private String salad;
    private String cheese;
    private String cucumber;
    private String sauce;
    private String onion;

    public ClassicBurgerBuilder(){
        super();
    }

    @Override
    public IBurgerBuilder addBut() {
        this.but = "Add but . . .";

        return this;
    }

    @Override
    public IBurgerBuilder addCutlet() {
        this.cutlet = "Add cutlet . . .";

        return this;
    }

    @Override
    public IBurgerBuilder addSalad() {
        this.salad = "Add salad . . .";

        return this;
    }

    @Override
    public IBurgerBuilder addCheese() {
        this.cheese = "Add cheese . . .";

        return this;
    }

    @Override
    public IBurgerBuilder addCucumber() {
        this.cucumber = "Add cucumber . . .";

        return this;
    }

    @Override
    public IBurgerBuilder addSauce() {
        this.sauce = "Add sauce . . .";

        return this;
    }

    @Override
    public IBurgerBuilder addOnion() {
        this.onion = "Add onion . . .";

        return this;
    }

    @Override
    public Burger getBurger() {
        Burger burger = new Burger(but, cutlet, salad, cheese, cucumber, sauce, onion);

        if(burger.doQualityCheck()){
            return burger;
        }
        else {
            System.out.println("\n[X] Error: No ingredients");
        }

        return null;
    }
}
