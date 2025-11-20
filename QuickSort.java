import java.io.BufferedReader;

public class QuickSort {
    /* */ 
    public static int quickSort(int[] arr, int low, int high) {
        int comparations = 0; /*inicializa el contador de comparaciones en 0;  */
        if (low < high) {
            int[] partitionResult = partition(arr, low, high);
            int pi = partitionResult[0];
            comparations += partitionResult[1];

            comparations += quickSort(arr, low, pi - 1);
            comparations += quickSort(arr, pi + 1, high);
        }
        return comparations; 
    }
}

/*Método auxiliar  que particiona el arreglo  alrededor del pivote y cuenta sus comparaciones únicas */
    private static int[] partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        int comparations = 0; 

        for (int j = low; j < high; j++) {
            comparations++; 
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
/*Intercambia */
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return new int[]{i + 1, comparations}; 
    }

    public static void main(String[] args) {
        try{
            long startTime =System.nanoTime();
            /*Abre el archivo de la entrada para leer los datos */
            BufferedReader br = new BufferedReader(new java.io.FileReader("entrada.txt"));
            String line = br.readLine();
            String parts =line.split("");
            int[] arr = new int[parts.length]; /*Crea un arreglo de enteros de un tamaño adecuado para el  */
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]); /*Convierte cada parte en un entero y lo almacena en el arreglo */
                if(arr[i]<0){
                    throw new IllegalArgumentException("El arreglo solo debe contener números enteros positivos."); /*  Validación única: lanza error si hay números negativos */
                }
            }
        }   
    }