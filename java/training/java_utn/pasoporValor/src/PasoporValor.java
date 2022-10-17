
public class PasoporValor {

    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("valorX" + valorX);
        // Solo le enviamos una copia
        cambioValor(valorX);
    }
    public static void cambioValor(int arg1){
        // parametros por valor
        System.out.println("arg1 =" + arg1);
        arg1 = 15;
    }    
}
