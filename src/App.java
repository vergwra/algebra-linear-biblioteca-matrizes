public class App {
    public static void main(String[] args) throws Exception {
        Matriz matrizTeste = new Matriz(2, 2);
        matrizTeste.FillRandom(10);

        System.out.println(matrizTeste.ToString());
    }
}
