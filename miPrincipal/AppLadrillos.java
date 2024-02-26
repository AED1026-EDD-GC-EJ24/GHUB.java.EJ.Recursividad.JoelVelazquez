package miPrincipal;
public class AppLadrillos {
    public static void menu(){
        //Solucion iterativa
        /*for(int i=0;i<10;i++){
            dibujarHilera();
        }
        */
        //Solucion recursiva
        dibujarPared();
    }
    public static void dibujarPared(int n){
        if(n>0)
            dibujarPared();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX"+n);
    }
    public static void dibujarHilera(){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
}