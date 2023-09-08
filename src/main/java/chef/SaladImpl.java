package chef;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaladImpl implements Salad {

    private List<VegetableImpl> vegetables = new ArrayList<>();

    @Override
    public void addVegetable(VegetableImpl newVegetable) {
        vegetables.add(newVegetable);
    }

    @Override
    public int getCalories() {
        int calories = 0;
        for (VegetableImpl vegetable :
                vegetables) {
            calories +=getCalories();
        }
        return calories;
    }
    // Сортировка List  обьектов по  свойству
    @Override
    public void sortVegetableByCalories() {
        vegetables.sort(Comparator.comparing(VegetableImpl::getCalories));
    }

    @Override
    public void findVegetableByCalories(int calories) {

    }
}
