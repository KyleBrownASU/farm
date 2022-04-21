public class CowAnimalDecorator extends AnimalDecorator {

    public CowAnimalDecorator(Animal decoratedAnimal){
        super(decoratedAnimal);

    }

    @Override
    public void doSomething(){
        decoratedAnimal.doSomething();
        setDecoratedCow(decoratedAnimal);
    }


   private void setDecoratedCow(Animal decoratedAnimal){
       System.out.println("Cow");
   }
}
