package vegetables;

import vegetables.VegetableImpl;

public class Tomato extends VegetableImpl {
    public Tomato(String name, int calories) {
        super(name, calories);

    }

    @Override
    public String toString() {
        return getName()+ getCalories();
    }

    private String type = "berries";
}
