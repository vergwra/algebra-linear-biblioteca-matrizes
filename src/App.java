import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Matriz matrizTeste = new Matriz(2, 2);
        matrizTeste.FillInput(sc);

        System.out.println(matrizTeste.ToString());
        
        
        Matriz transpostaTeste = LinearAlgebra.Tranposta(matrizTeste);
        System.out.println(transpostaTeste.ToString());
    }
}
