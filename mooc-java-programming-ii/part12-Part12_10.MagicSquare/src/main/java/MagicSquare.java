
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        
        ArrayList<Integer> sums = new ArrayList<>();
      
        for (int row = 0; row<square.length; row++){
              int sum=0;                        // when on new row, sum set back =0;
            for (int col=0; col<square[row].length; col++){
                sum+= square[row][col];
            }
            sums.add(sum);
            
        }
        
        return sums;
    }

    public ArrayList<Integer> sumsOfColumns() {
          ArrayList<Integer> sums = new ArrayList<>();
          
          for (int row = 0; row<square.length; row++){
              int sum=0;                        // when on new row, sum set back =0;
            for (int col=0; col<square[row].length; col++){
                sum+= square[col][row];
            }
            sums.add(sum);
            
        }
        
        return sums;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        
         ArrayList<Integer> sums = new ArrayList<>();                       //1 2 3 4                                     
         int dia1=0;                                                        //1 2 3 4 
                                                                            //1 2 3 4 
         int dia2=0;                                                        //1 2 3 4 
         
      
     for (int i=0; i<square.length; i++){       // amount of numbers in the diagonal is equal to the amount of numbers in the rows.
         dia1 += square[i][i];
         dia2 += square[i][square.length-1-i];
         
     }
     sums.add(dia1);
     sums.add(dia2);
     
     return sums;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
