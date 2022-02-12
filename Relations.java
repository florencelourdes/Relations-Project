/** 
* @author [Florence Lourdes]
* @version 1.0
*/


//Declare the Relations class.
public class Relations {
   
   //Declare private instance variables
   /*Four boolean variables that store a true or false value
     in respect to their word definition.
   */
   private boolean transitive;
   private boolean reflexive;
   private boolean antisymmetric;
   private boolean totalOrder;
   /*The array variable stores an array with int elements that will be tested 
      with the methods in this class.
   */
   private int [][] array;
   
   /*
   The constructor takes an array and assigns it to the variable in this class.
   It also sets a default value to the other variables.
   */
   public Relations (int [][] array){
      this.array = array;
      transitive = false;
      reflexive = false;
      antisymmetric = false;
      totalOrder = false;
   }
   
   //This method determines if the array is transitive and returns a boolean value.
   public boolean isTransitive(){
      int i;
      int j;
      int k;
      
      for (i = 0; i < array.length; ++i){
         for (j = 0; j < array.length; ++j){
            for (k = 0; k < array.length; ++k){
               
               if (array[i][j] == 1){
                  if (array[j][k] == 1){
                     if (array[i][k] == 1){
                        transitive = true;
                     }
                     else {
                        transitive = false;
                        break;
                     }
                  }
               }
            }if (transitive == false){
               break;
             }
         }if (transitive == false){
            break;
          }
      }
      return transitive;   
   }
   
   //This method determines if the array is reflective and returns a boolean value.
   public boolean isReflexive(){
      int i;

      
      for (i = 0; i < array.length; ++i){
            if (array[i][i] == 1){
               reflexive = true;
            }
            else {
               reflexive = false;
               break;            
            } 
      }
      return reflexive;  
   }
   
   //This method determines if the array is antisymmetric and returns a boolean value.
   public boolean isAntisymmetric(){
      int i;
      int j;
      
      for (i = 0; i < array.length; ++i){
         for (j = 0; j < array.length; ++j){
         
            if (i != j && array[i][j] == 1){
               if (array[j][i] == 0){
                  antisymmetric = true;
               }
               else {
                  antisymmetric = false;
                  break;
               }
            }
         }
         if (antisymmetric == false){
            break;
         }      
      }
      return antisymmetric;    
   }
   
   /*This method determines if the array is a total order and returns a boolean value.
     Total order is when a matrix is transitive, reflexive, and antisymmetric.
   */
   public boolean isTotalOrder(){
      if (transitive == true && reflexive == true && antisymmetric == true){
         totalOrder = true;
      }
      return totalOrder;   
   }
   
}//end of class