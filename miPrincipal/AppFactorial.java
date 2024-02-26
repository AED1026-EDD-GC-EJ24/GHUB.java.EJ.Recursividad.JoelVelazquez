package miPrincipal;
public class Factorial{
    public static void main(String args[]){
        //calcular el factorial de un numero
        int f = 5;
        long fact = 1;
        for(int i=f;i>0;i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial de "+f+"! es = "+fact);

    }
    public static long factorialIte(int f){
        long fact=1;
        for(int i=f;i>0;i--){
            fact = fact * i;
        } 
        return fact;
    }
    public static long factorialRec(int f){
        if (f==0)
            return 1L;
        else
            return factorialRec(f-1)*f;
    }
}