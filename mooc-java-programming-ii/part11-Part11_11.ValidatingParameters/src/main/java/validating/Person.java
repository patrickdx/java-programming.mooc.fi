package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException{

    if (name != null && name.length() <= 40 && name.isEmpty() == false && age >= 0 && age <=120){
        
    }
    else{
        throw new IllegalArgumentException("sensor is off");
    }
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) 
    { 
        Person sup = new Person("shane", 21); 
    } 
}
