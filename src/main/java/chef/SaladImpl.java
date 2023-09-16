package chef;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaladImpl implements Salad {
    private List<VegetableImpl> vegetables = new ArrayList<>();
    private int sum = 0;


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
        for (VegetableImpl vegetable : vegetables) {
            sum += vegetable.getCalories();
        }
        return sum;
    }

    // Сортировка List  обьектов по  свойству
    @Override
    public void sortVegetableByCalories() {
        vegetables.sort(Comparator.comparing(VegetableImpl::getCalories));
    }

    // поиск  овощей по каллорийности
    @Override
    public List<VegetableImpl> findVegetableByCalories(int calories) {
        List<VegetableImpl> veg = new ArrayList<>();
        for (VegetableImpl vegetable : vegetables) {
            if (vegetable.getCalories() == calories) {
                veg.add(vegetable);
            }
        }
        return veg;
    }
}
