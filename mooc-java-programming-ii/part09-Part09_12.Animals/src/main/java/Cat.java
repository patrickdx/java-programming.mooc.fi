public class Cat extends Animal implements NoiseCapable{

    private String name;
    
    public Cat(){
        super("Cat");  
        this.name = "Cat";
    }
    
    public Cat(String name){
        super(name);
        this.name = name;

    }
    
    public void purr(){
        System.out.println(this.name + " purrs");
    }

    @Override
    public void makeNoise() {
        this.purr();
    }
    
    
    
}