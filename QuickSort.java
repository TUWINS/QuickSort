import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;

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
            BufferedReader br = new BufferedReader(new FileReader("entrada.txt"));
            String line = br.readLine();
            String []  parts = line.split("");
            int[] arr = new int[parts.length]; /*Crea un arreglo de enteros de un tamaño adecuado para el  */
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]); /*Convierte cada parte en un entero y lo almacena en el arreglo */
                if(arr[i]<0){
                    throw new IllegalArgumentException("El arreglo solo debe contener números enteros positivos."); /*  Validación única: lanza error si hay números negativos */
            }
        }
            br.close();
                
                int comparations = quickSort(arr, 0, arr.length - 1); /*Llama al método quickSort y obtiene el número de comparaciones */
                long endTime = System.nanoTime(); /*Se reistra el tiempo de fin */

                /*Escribe el arreglo  ordenado en el archivo de salida */
             BufferedWriter bw = new BufferedWriter(new FileWriter("output_quick.txt"));
                for (int num : arr) {
                    bw.write(num + " ");/*  Escribe cada  número seguido de un espacio */
                
                }
                bw.close();
                /*  // Escribe un log único con timestamp, comparaciones y tiempo de ejecución  */
                BufferedWriter log = new BufferedWriter(new java.io.FileWriter("log_quick.txt", true));
                log.write("Timestamp: " + LocalDateTime.now() + ", Comparaciones: " + comparations + ", Tiempo de ejecución (ns): " + (endTime - startTime) + "\n");
                log.close();/*Se cierra el log */
                System.out.println("Ordenamiento completado. Revisa 'salida.txt' para el arreglo ordenado y 'log_quick.txt' para el log.");
        } catch (IOException e) {

            System.err.println("Error: " + e.getMessage());
        }
      
 
    }   
}


