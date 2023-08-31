public class LinearAlgebra {
    public static Matriz Tranposta(Matriz matriz) {
        Matriz transposta = new Matriz(matriz);

        int linhas = transposta.GetLinhas();
        int colunas = transposta.GetColunas();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta.SetValue(j, i, matriz.GetValue(i, j));
            }
        }

        return transposta;
    }
}
