
public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    @Override
    public int compareTo(Human man) {  // when use sort method the criteria would be based off here, sort from largest wage to smallest. 
        
        if (this.wage > man.wage){  // if this.wage is before
            return -1;
        }
        if (this.wage < man.wage){  // if this.wage is after
            return 1;
        }
        return 0;
        
        
    }
}
