
//Declare the main class.
public class RelationsMain {

   public static void main(String[] args){

      //The first array.
      int [][] arrayOne = {{1,0,1,0,0,1},
                           {0,1,0,0,0,0},
                           {0,0,1,0,0,1},
                           {0,0,0,1,0,0},
                           {0,1,1,0,1,1},
                           {0,0,0,0,0,1}};
                      
      /*Creates a new object of Relations class and calls the constructor
        with the first array as the argument.
      */
      Relations exampleOne = new Relations(arrayOne);
   
      //Testing the first array and printing results.
      if (exampleOne.isTransitive() == true){
         System.out.println("first matrix is transitive");
      }
      else {
         System.out.println("first matrix is not transitive");
      }
   
   
      if (exampleOne.isReflexive() == true){
         System.out.println("first matrix is reflexive");
      }
      else {
         System.out.println("first matrix is not reflexive");
      }
   
   
      if (exampleOne.isAntisymmetric() == true){
         System.out.println("first matrix is antisymmetric");
      }
      else {
         System.out.println("first matrix is not antisymmetric");
      }

   
      if (exampleOne.isTotalOrder() == true){
         System.out.println("first matrix is a total order");
      }
      else {
         System.out.println("first matrix is not a total order");
      }
      
      //Prints a new line before the next test.
      System.out.println();
      
      
      //The second array.
      int [][] arrayTwo = {{0,0,0,1},
                           {1,0,1,0},
                           {0,0,0,0},
                           {0,0,0,0}};
                           
      /*Creates a new object of Relations class and calls the constructor
        with the second array as the argument.
      */                     
      Relations exampleTwo = new Relations(arrayTwo);  
      
      //Testing the second array and printing results.
      if (exampleTwo.isTransitive() == true){
         System.out.println("second matrix is transitive");
      }
      else {
         System.out.println("second matrix is not transitive");
      }
   
   
      if (exampleTwo.isReflexive() == true){
         System.out.println("second matrix is reflexive");
      }
      else {
         System.out.println("second matrix is not reflexive");
      }
   
   
      if (exampleTwo.isAntisymmetric() == true){
         System.out.println("second matrix is antisymmetric");
      }
      else {
         System.out.println("second matrix is not antisymmetric");
      }

   
      if (exampleTwo.isTotalOrder() == true){
         System.out.println("second matrix is a total order");
      }
      else {
         System.out.println("second matrix is not a total order");
      }
      
      //Prints a new line before the next test.
      System.out.println();
      
      
      //The third array.
      int [][] arrayThree = {{0,0,0,1},
                             {1,0,1,1},
                             {0,1,0,0},
                             {0,0,1,0}};
      
      /*Creates a new object of Relations class and calls the constructor
        with the third array as the argument.
      */                    
      Relations exampleThree = new Relations(arrayThree);  
      
      //Testing the third array and printing results.
      if (exampleThree.isTransitive() == true){
         System.out.println("third matrix is transitive");
      }
      else {
         System.out.println("third matrix is not transitive");
      }
   
   
      if (exampleThree.isReflexive() == true){
         System.out.println("third matrix is reflexive");
      }
      else {
         System.out.println("third matrix is not reflexive");
      }
   
   
      if (exampleThree.isAntisymmetric() == true){
         System.out.println("third matrix is antisymmetric");
      }
      else {
         System.out.println("third matrix is not antisymmetric");
      }

   
      if (exampleThree.isTotalOrder() == true){
         System.out.println("third matrix is a total order");
      }
      else {
         System.out.println("third matrix is not a total order");
      }
        
   
   }

}