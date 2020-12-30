
import java.util.HashMap;


public class IOU {

    private HashMap <String,Double> map;
    
    public IOU(){
        map = new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        map.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return this.map.getOrDefault(toWhom, 0.0);              // searches for key toWhom, if not found, default to return 0.
    }
    
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
mattsIOU.setSum("Arthur", 51.5);
mattsIOU.setSum("Michael", 30);

System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
