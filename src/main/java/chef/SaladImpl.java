package chef;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaladImpl implements Salad {
    private List<VegetableImpl> vegetables = new ArrayList<>();
    int calories = 0;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    public List<VegetableImpl> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<VegetableImpl> vegetables) {
        this.vegetables = vegetables;
    }


    @Override
    public void addVegetable(VegetableImpl newVegetable) {
        vegetables.add(newVegetable);
    }

    @Override
    public int sumCalories() {

        for (VegetableImpl vegetable :
                vegetables) {
            calories += sumCalories();
        }
        return calories;
    }

    // Сортировка List  обьектов по  свойству
    @Override
    public void sortVegetableByCalories() {
        vegetables.sort(Comparator.comparing(VegetableImpl::getCalories));
    }

    // поиск  овощей по каллорийности
    @Override
    public void findVegetableByCalories(int minCalories, int maxCalories) {
        for (VegetableImpl vegetable :
                vegetables) {
            calories = sumCalories();
            if (calories >= minCalories && calories <= maxCalories){
                vegetables.add(vegetable);
            }
        }

    }
}
