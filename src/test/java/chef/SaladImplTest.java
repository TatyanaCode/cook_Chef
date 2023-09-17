package chef;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vegetables.Cucumber;
import vegetables.Tomato;
import vegetables.Vegetable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


class SaladImplTest {
    private final SaladImpl salad = new SaladImpl();

    List<Vegetable> vegetablesS = new ArrayList<>();


    Vegetable cucumber;
    Vegetable vegetable;

    @BeforeEach
    public void init() {
        cucumber = new Cucumber("Огурец" + " ", 10);
        vegetable = new Tomato("Tomato" + " ", 20);
        salad.addVegetable(vegetable);
        salad.addVegetable(cucumber);
        vegetablesS.add(vegetable);
        vegetablesS.add(cucumber);
    }

    @Test
    void addVegetableTest() {

        //ожидаемый результат
        var expected = salad.getVegetables();
        // фактический результат
        List<Vegetable> actual = vegetablesS;
        assertEquals(expected, actual);
    }

    @Test
    void sumCaloriesTest() {
        var exp = salad.sumCalories();
        Assertions.assertEquals(exp, 30);
    }

    @Test
    void findVegetableByCaloriesTest() {
        Vegetable vegetable1 = new Tomato("Tomato" + " ", 25);
        Vegetable vegetable2 = new Tomato("Tomato" + " ", 30);

        salad.addVegetable(vegetable1);
        salad.addVegetable(vegetable2);
        salad.sortVegetableByCalories();
        List<Vegetable> veg = salad.getVegetables();
        assertEquals(cucumber, veg.get(0));
        assertEquals(vegetable, veg.get(1));
        assertEquals(vegetable1, veg.get(2));
        assertEquals(vegetable2, veg.get(3));
    }

    @Test
    void findVegetableByCalories() {
        List<Vegetable> actual = salad.findVegetableByCalories(10);
        assertEquals(vegetablesS
                        .stream()
                        .filter(vegetable -> vegetable.getCalories() == 10)
                        .toList(),
                actual);
    }
}