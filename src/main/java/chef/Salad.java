package chef;

import vegetables.Vegetable;
import vegetables.VegetableImpl;

import java.util.List;

public interface Salad {
    void addVegetable(Vegetable newVegetable);

    int sumCalories();

    void sortVegetableByCalories();

    String toString();

    // поиск  овощей по каллорийности
    List<Vegetable> findVegetableByCalories(int calories);
}
