package chef;

public interface Salad {
    void  addVegetable(VegetableImpl newVegetable);
    int getCalories();
    void sortVegetableByCalories();
    void findVegetableByCalories( int  minCalories, int maxCalories);
}
