package chef;

public  abstract class Vigetable {
    public Vigetable(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    String name;
    int calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }



}
