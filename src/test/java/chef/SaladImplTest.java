package chef;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


class SaladImplTest {
    private final SaladImpl salad = new SaladImpl();
    private final List<VegetableImpl> vegetablesS = new ArrayList<>();

    @Test
    @After
    @Before
    void addVegetableTest() {
        VegetableImpl cucumber = new Cucumber("Огурец" + " ", 10);
        VegetableImpl vegetable = new Tomato("Tomato" + " ", 20);
        salad.addVegetable(vegetable);
        salad.addVegetable(cucumber);
        vegetablesS.add(vegetable);
        vegetablesS.add(cucumber);
        //ожидаемый результат
        var expected = salad.getVegetables();
        // фактический результат
        List<VegetableImpl> actual = vegetablesS;
        assertEquals(expected, actual);
    }

    @Test
    @After
    @Before
    void sumCaloriesTest() {
        VegetableImpl cucumber = new Cucumber("Огурец" + " ", 10);
        VegetableImpl vegetable = new Tomato("Tomato" + " ", 20);
        salad.addVegetable(vegetable);
        salad.addVegetable(cucumber);
        var exp = salad.sumCalories();
        Assertions.assertEquals(exp, 30);
    }

    @Test
    @After
    @Before
    void findVegetableByCaloriesTest() {
        VegetableImpl cucumber = new Cucumber("Огурец" + " ", 10);
        VegetableImpl vegetable = new Tomato("Tomato" + " ", 20);
        VegetableImpl vegetable1 = new Tomato("Tomato" + " ", 25);
        VegetableImpl vegetable2 = new Tomato("Tomato" + " ", 30);
        salad.addVegetable(vegetable);
        salad.addVegetable(cucumber);
        salad.addVegetable(vegetable1);
        salad.addVegetable(vegetable2);
        salad.sortVegetableByCalories();
        List<VegetableImpl> veg = salad.getVegetables();
        assertEquals(cucumber, veg.get(0));
        assertEquals(vegetable, veg.get(1));
        assertEquals(vegetable1, veg.get(2));
        assertEquals(vegetable2, veg.get(3));
    }

    @Test
    @After
    @Before
    void findVegetableByCalories() {
        VegetableImpl cucumber = new Cucumber("Огурец" + " ", 10);
        VegetableImpl vegetable = new Tomato("Tomato" + " ", 20);
        salad.addVegetable(vegetable);
        salad.addVegetable(cucumber);
        vegetablesS.add(cucumber);
        List<VegetableImpl> actual = salad.findVegetableByCalories(10);
        assertEquals(vegetablesS, actual);
    }
}