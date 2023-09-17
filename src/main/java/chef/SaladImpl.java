package chef;

import vegetables.Vegetable;
import vegetables.VegetableImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaladImpl implements Salad {
    private List<Vegetable> vegetables = new ArrayList<>();
    private int sum = 0;


    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }


    @Override
    public void addVegetable(Vegetable newVegetable) {
        vegetables.add(newVegetable);
    }

    @Override
    public int sumCalories() {
        for (Vegetable vegetable : vegetables) {
            sum += vegetable.getCalories();
        }
        return sum;
    }

    // Сортировка List  обьектов по  свойству
    @Override
    public void sortVegetableByCalories() {
        vegetables.sort(Comparator.comparing(Vegetable::getCalories));
    }

    // поиск  овощей по каллорийности
    @Override
    public List<Vegetable> findVegetableByCalories(int calories) {
        List<Vegetable> veg = new ArrayList<>();
        for (Vegetable vegetable1 : vegetables) {
            if (vegetable1.getCalories() == calories) {
                veg.add(vegetable1);
            }
        }
        return veg;
    }
}
