public class SheepAnimalDecorator extends AnimalDecorator {

    public SheepAnimalDecorator(Animal decoratedAnimal){
        super(decoratedAnimal);

    }

    @Override
    public void doSomething(){
        decoratedAnimal.doSomething();
        setDecoratedCow(decoratedAnimal);

    }


    private void setDecoratedCow(Animal decoratedAnimal){
        System.out.println("Sheep");
    }
}
