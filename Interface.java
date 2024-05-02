public abstract class Face{

    public abstract void nose();
    
}

class CatNose extends Face{
    @Override
    public void nose (){
        System.out.println("Cat has cute nose!");
    }
}