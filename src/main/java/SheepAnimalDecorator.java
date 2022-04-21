public class SheepAnimalDecorator extends AnimalDecorator {

    public SheepAnimalDecorator(Animal decoratedAnimal){
        super(decoratedAnimal);

    }

    @Override
    public void doSomething(){
        decoratedAnimal.doSomething();

    }


    private void setDecoratedCow(){
        System.out.println("Sheep");
    }
}
