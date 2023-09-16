package chef;

import java.util.List;

public interface Salad {
    void addVegetable(VegetableImpl newVegetable);

    int sumCalories();

    void sortVegetableByCalories();

    String toString();

    // поиск  овощей по каллорийности
    List<VegetableImpl> findVegetableByCalories(int calories);
}
