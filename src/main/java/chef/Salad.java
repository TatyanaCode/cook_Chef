package chef;

public interface Salad {
    void  addVegetable(Vigetable newVegetable);
    int getCalories();
    void sortCaloriesByCalories();
    void findVegetableByCalories( int calories);
}
