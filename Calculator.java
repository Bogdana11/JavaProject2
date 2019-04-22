public class Calculator {
   
     public Calculator() {
       
     }  
      public int add(int a, int b){
         int sum = a + b;
          return sum;
     }
       public int   substract (int a,int b){
         int takeaway = a - b;
         return takeaway;
       }
       public int   multiply (int a,int b){
         int multiply = a * b;
         return multiply;
       }
       public int   divide (int a,int b){
         int divide = a/b;
         return divide;
       } 
    public static void main(String[] args){
       Calculator myCalculator = new Calculator();
       int addition = myCalculator.add(5,7);
       System.out.println(addition);
       int multiply = myCalculator.multiply(11,45);
       System.out.println(multiply);
    }
 }
