public class Matriz {
    private double[][] dados;
    private int linhas;
    private int colunas;

    public Matriz(int _linhas, int _colunas) {
        linhas = _linhas;
        colunas = _colunas;
        dados = new double[linhas][colunas];
    }

    public double GetValue(int linha, int coluna) {
        return dados[linha][coluna];
    }

    public void FillRandom(float escala) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] = (Math.random() - 0.5) * escala;
            }
        }
    }

    public String ToString() {
        String matriz_string = "";

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz_string += dados[i][j];
                matriz_string += " | ";
            }
            matriz_string += "\n";
        }

        return matriz_string;
    }

}
