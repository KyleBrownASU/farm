public class FarmerFactory {
    public Farmer getFarmer(String type){
        if(type.equalsIgnoreCase("Crop Farmer")){
            return new CropFarmer();
        } else if (type.equalsIgnoreCase("Animal Farmer")){
            return new AnimalFarmer();
        } else if (type.equalsIgnoreCase("Hybrid Farmer")){
            return new HybridFarmer();
        }


        return null;

    }
}
