public class CowAnimalDecorator extends AnimalDecorator {

    public CowAnimalDecorator(Animal decoratedAnimal){
        super(decoratedAnimal);

    }

    @Override
    public void doSomething(){
        decoratedAnimal.doSomething();

    }


   private void setDecoratedCow(){
       System.out.println("Cow");
   }
}
