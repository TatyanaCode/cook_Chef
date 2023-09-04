package chef;

public interface Salad {
    void  addVegetable(VegetableImpl newVegetable);
    int getCalories();
    void sortCaloriesByCalories();
    void findVegetableByCalories( int calories);
}
