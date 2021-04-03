package aulas.arrays;

public class ArraysMultidimensionais {
    public static void main(String[] args) {

        int [][] arrayMulti = {{1, 2, 3, 4}, {51, 62, 73, 84}};

        for (int i = 0; i < arrayMulti.length; i ++){//Percorre o primeiro array
            for (int j = 0; j < arrayMulti[i].length; j ++){//Percorre o segundo array
                System.out.println(arrayMulti[i][j]);
            }
        }
    }
}
