package chef;

public class Cucumber   extends VegetableImpl {
    public Cucumber(String name, int calories) {
        super(name, calories);
    }

    @Override
    public String toString() {
        return  getName()+ getCalories();
    }

    private String color = " не красный";


}
