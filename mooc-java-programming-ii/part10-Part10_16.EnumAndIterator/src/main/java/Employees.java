
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Employees {
    
    private List<Person> xd;
    
    public Employees(){
        this.xd = new ArrayList<>();
    }
      
    public void add (Person toAdd){
        this.xd.add(toAdd);
    }
    
    public void add(List<Person> peopleToAdd){  // using interator
        
        Iterator<Person> xd1 = peopleToAdd.iterator();
        
        while (xd1.hasNext()){      // if any objects still need to be iterated over
           xd.add(xd1.next());
 
        }
        
    }
    public void print(){
     
    Iterator<Person> xd1 = xd.iterator();
    while (xd1.hasNext()){
        System.out.println(xd1.next());
    }

        
    }
    public void print(Education education){
        
    Iterator<Person> xd1 = xd.iterator();

    while (xd1.hasNext()){
        Person lol = xd1.next();
            if (lol.getEducation() == education){
                System.out.println(lol);
            }
        }
    }
     
    
    public void fire (Education education){
          Iterator<Person> xd1 = xd.iterator();

    while (xd1.hasNext()){      // removing a list while iteratoring thru it, only possible with Iterator. 
        if (xd1.next().getEducation() == education){        // fire people with specific education
            xd1.remove();
        }
    }
    }
    
    
}
