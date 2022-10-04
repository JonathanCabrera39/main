public class Main{
    public static void main(String[] args){
        suma(1,2,3);

        Coche miCoche = new Coche();
        miCoche.añadirPuertas();
        miCoche.añadirPuertas();
        miCoche.añadirPuertas();
        miCoche.añadirPuertas();
        System.out.println(miCoche.puertas);
    }
    public static void suma(int a,int b,int c){
        System.out.println("Suma:" + (a+b+c));
    }
}
class Coche{
    int puertas=0;
    public void añadirPuertas(){
        this.puertas++;
    }
}

