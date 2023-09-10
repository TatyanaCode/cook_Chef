package chef;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


class SaladImplTest {
    private final SaladImpl salad = new SaladImpl();
    private final List<Vegetable> vegetablesS = new ArrayList<>();

    @Test
    void addVegetableTest() {
        VegetableImpl cucumber = new Cucumber("Огурец" + " ", 10);
        VegetableImpl vegetable = new Tomato("Tomato"+ " ", 20);
        salad.addVegetable(vegetable) ;
        salad.addVegetable(cucumber);
        vegetablesS.add(vegetable);
        vegetablesS.add(cucumber);
        System.out.println(vegetablesS.toString());
        //ожидаемый результат
        var expected  = salad.getVegetables();
        // фактический результат
        List<Vegetable> actual = vegetablesS;
        assertEquals(expected, actual);



    }

    @Test
    void getCaloriesTest() {
    }

    @Test
    void sortVegetableByCaloriesTest() {
    }

    @Test
    void findVegetableByCaloriesTest() {
    }
}