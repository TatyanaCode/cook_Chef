package chef;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;



class SaladImplTest {
    private final SaladImpl salad = new SaladImpl();
    private final List<VegetableImpl> vegetablesS = new ArrayList<VegetableImpl>();

    @Test
    void addVegetableTest() {
        VegetableImpl cucumber = new Cucumber("Огурец" + " ", 10);
        VegetableImpl vegetable = new Tomato("Tomato" + " ", 20);
        salad.addVegetable(vegetable);
        salad.addVegetable(cucumber);
        vegetablesS.add(vegetable);
        vegetablesS.add(cucumber);
        System.out.println(vegetablesS.toString());
        //ожидаемый результат
        var expected = salad.getVegetables();
        // фактический результат
        List<VegetableImpl> actual = vegetablesS;

        assertEquals(expected, actual);

    }

    @Test
    void sumCaloriesTest() {
        VegetableImpl cucumber = new Cucumber("Огурец" + " ", 10);
        VegetableImpl vegetable = new Tomato("Tomato" + " ", 20);
        salad.addVegetable(vegetable);
        salad.addVegetable(cucumber);
        salad.setVegetables(vegetablesS);
        // не рабочий тест1
        assertEquals(30, salad.sumCalories());

    }

    @Test
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
    void findVegetableByCalories() {
        VegetableImpl cucumber = new Cucumber("Огурец" + " ", 10);
        VegetableImpl vegetable = new Tomato("Tomato" + " ", 20);
        salad.addVegetable(vegetable);
        salad.addVegetable(cucumber);
        vegetablesS.add(vegetable);
        vegetablesS.add(cucumber);
        salad.setVegetables(vegetablesS);
        List<VegetableImpl> veg = salad.getVegetables();
// не рабочий тест2
        assertEquals(veg, salad.getVegetables();
    }
}
// //  int actualTest = cucumber.getCalories() + vegetable.getCalories();
//      //  int expected = salad.sumCalories();
//   //     int expected = salad.sumCalories();