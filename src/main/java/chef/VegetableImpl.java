package chef;

public  abstract class VegetableImpl implements Vegetable {
    public VegetableImpl(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

   private String name;
   private int calories;

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

    @Override
    public void sliceVegetable() {
        System.out.println("Овощи нарезаны");

    }


}
