import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    @Test
    public void testSheep(){
        Sheep sheep = new Sheep();
        sheep.doSomething();
        assertEquals(sheep.getType(), "Sheep");

    }

    @Test
    public void testCow(){
        Cow cow = new Cow();
        cow.doSomething();
        assertEquals(cow.getType(), "Cow");

    }

    @Test
    public void testDecoratedCow(){
        Cow cow = new Cow();
        CowAnimalDecorator decCow = new CowAnimalDecorator(cow);

        decCow.doSomething();


    }

    @Test
    public void testDecoratedSheep(){
        Sheep sheep = new Sheep();
        CowAnimalDecorator decSheep = new CowAnimalDecorator(sheep);

        decSheep.doSomething();


    }
}
