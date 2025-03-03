public class Arrays {
    public static void main(String[] args) {
        int[] nota = {9,8,10};

        for (int valor: nota)
            System.out.println(valor);

        // Arrays Bidimensionais

//                        Linha   / Coluna
        int[][] matriz = {{0,1,2},{4,5,6}};
        int i,j;

        for (i=0;i<2;i++){
            for (j=0;j<3;j++)
                System.out.println(matriz[i][j]);
        }


    }
}
