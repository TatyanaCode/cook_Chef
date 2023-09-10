package chef;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaladImpl implements Salad {

    public List<VegetableImpl> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<VegetableImpl> vegetables) {
        this.vegetables = vegetables;
    }

    private List<VegetableImpl> vegetables = new ArrayList<>();
    int calories = 0;


    @Override
    public void addVegetable(VegetableImpl newVegetable) {
        vegetables.add(newVegetable);
    }

    @Override
    public int getCalories() {

        for (VegetableImpl vegetable :
                vegetables) {
            calories += getCalories();
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
            calories = getCalories();
            if (calories >= minCalories && calories <= maxCalories){
                vegetables.add(vegetable);
            }
        }

    }
}
