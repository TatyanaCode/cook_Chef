package chef;

public interface Salad {
    void  addVegetable(VegetableImpl newVegetable);
    int sumCalories();
    void sortVegetableByCalories();
    void findVegetableByCalories( int  minCalories, int maxCalories);
    String toString();
}
