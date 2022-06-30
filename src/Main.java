public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(15,26,9);
        System.out.println(resultado);

        Coche micoche = new Coche();
        micoche.aumentarPuertas();
        System.out.println(micoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class Coche{
    public int puertas = 4;

    public void aumentarPuertas(){
        this.puertas++;
    }

}
