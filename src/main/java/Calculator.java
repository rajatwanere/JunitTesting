public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;

    }
    public double divide(int a,int b){
         if(b==0){throw new ArithmeticException("Division by zero is not all");
         }

       return (double) a/b;
         }
    }
