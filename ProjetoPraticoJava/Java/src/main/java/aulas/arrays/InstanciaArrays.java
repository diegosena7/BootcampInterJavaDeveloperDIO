package aulas.arrays;
public class InstanciaArrays {
    public static void main(String[] args) {

        int tamanho = 7;
        int [] array = new int[tamanho];//Array vazio
        int [] array1 = {1, 2, 5, 7, 13, 20};//Array com valores
        System.out.println("Qtidade de posições do array vazio = " + array.length);
        System.out.println("Posição 3 do array1 é = " + array1[3]);

        for (int i = 0; i < array1.length; i ++){
            System.out.println("Valore do array1 na posição " + i + " = " + array1[i]);
        }

        System.out.println("------ Mudei a posição do array [2] ------");
        //Alterando o valor da posição 2 do array (era 5 mudei pra 10)
        array1[2] = 10;

        //Imprime valores do array
        for (int i = 0; i < array1.length; i ++){
            System.out.println("Valore do array1 na posição " + i + " = " + array1[i]);
        }
    }
}
