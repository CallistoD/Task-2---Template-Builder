public class Burger {

    private final String but;
    private final String cutlet;
    private final String salad;
    private final String cheese;
    private final String cucumber;
    private final String sauce;
    private final String onion;

    public Burger(String but, String cutlet, String salad, String cheese, String cucumber, String sauce, String onion){
        this.but = but;
        this.cutlet = cutlet;
        this.salad = salad;
        this.cheese = cheese;
        this.cucumber = cucumber;
        this.sauce = sauce;
        this.onion = onion;
    }

    public boolean doQualityCheck() {
        return (but != null && !but.trim().isEmpty()) && (cutlet != null && !cutlet.trim().isEmpty())
                && (salad != null && !salad.trim().isEmpty()) && (cheese != null && !cheese.trim().isEmpty()
                && (cucumber != null && !cucumber.trim().isEmpty()) && (sauce != null && !sauce.trim().isEmpty()
                && (onion != null && !onion.trim().isEmpty())));
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("\n>>> Cooking Burger <<<\n\nStart cooking --->")
                .append("\n" + but)
                .append("\n" + sauce)
                .append("\n" + cutlet)
                .append("\n" + cheese)
                .append("\n" + salad)
                .append("\n" + onion)
                .append("\n" + cucumber)
                .append("\n" + but);

        return builder.toString();
    }
}
