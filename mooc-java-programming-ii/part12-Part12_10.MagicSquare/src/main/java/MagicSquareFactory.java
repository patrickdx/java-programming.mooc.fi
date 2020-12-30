


public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size); 
        
        //https://en.wikipedia.org/wiki/Siamese_method

        // implement the creation of a magic square with the Siamese method algorithm here
        
        
       
        int x=1;
        int y=1;
       
        int mid = square.getWidth()/2;
        
        int coordx = mid-1;
        int coordy =1;
        
    
        for (int i=0; i<size*size; i++){
            int prevX = coordx;
            int prevY = coordy;
            coordx++;
            coordy--; 
            
                if (square.readValue(coordx, coordy) ==-1){     // if out of bounds  //* dont need this check, 
                   System.out.println("out of bounds " + coordx + " " + coordy );
                if (coordy < 0){
                    coordy = square.getHeight() -1;
                }
                if (coordx >= square.getWidth()){
                    coordx = 0;
                }
                
            System.out.println("new " + coordx + " " + coordy );

               
            }
          
           if (square.readValue(coordx, coordy) >0){        // if inceremnt leads to space already taken; 
              System.out.println("taken");
               
              
               coordx = prevX;
               coordy = prevY;
               
               coordy++;
               while (square.readValue(coordx, coordy) >0){     // never happens, useless method
                 System.out.println("taken again");
                   coordy++;
               }
           }
           
           // y can go out of bounds. 
           
           // if (coordy>=size){
           //       y=0;
           // }
           
           
            System.out.println(coordx + " , " + coordy);
            
            square.placeValue(coordx, coordy, i+1);
            
             if (square.allNumbersDifferent() == true && i == size*size){
                 break;
             } 
            
        }
        
        return square;
    }
    

}
