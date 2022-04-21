public class FarmFactory {

    public Farm buildFarm(String farmType){
        if(farmType == null){
            return null;
        }

        if(farmType.equalsIgnoreCase("Crop")){
            return new CropFarm();
        } else if (farmType.equalsIgnoreCase("Animal")){
            return new AnimalFarm();
        } else if(farmType.equalsIgnoreCase("Hybrid")){
            return new HybridFarm();
        }

        return null;
    }
}
