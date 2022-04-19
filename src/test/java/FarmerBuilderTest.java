import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FarmerBuilderTest {
    FarmerFactory farmerFactory = new FarmerFactory();

    @Test
    public void testFarmerBuilder(){
        Farmer farmer1 = farmerFactory.getFarmer("Crop Farmer");
        assertEquals("Crop Farmer", farmer1.getType());

        Farmer farmer2 = farmerFactory.getFarmer("Animal Farmer");
        assertEquals("Animal Farmer", farmer2.getType());

        Farmer farmer3 = farmerFactory.getFarmer("Hybrid Farmer");
        assertEquals("Hybrid Farmer", farmer3.getType());

    }

    @Test
    public void testFarmerSleep(){
        Farmer farmer = farmerFactory.getFarmer("Crop Farmer");
        farmer.sleep();
    }

    @Test
    public void testFarmerFarm(){
        Farmer farmer = farmerFactory.getFarmer("Crop Farmer");
        farmer.farm();
    }

}
