1. QuickSort.java
Descripción: Ordena un arreglo de enteros usando Quick Sort, cuenta comparaciones únicas, mide tiempo, y valida números positivos. Lee desde entrada.txt y escribe en salida_quick.txt y log_quick.txt.

Pasos para Crear el Algoritmo
Definir la Estructura Básica:

Crea la clase QuickSort con métodos quickSort (recursivo) y partition (auxiliar).
quickSort divide el arreglo recursivamente y acumula comparaciones.
partition elige el último elemento como pivote, particiona el arreglo, y cuenta comparaciones.
Agregar Elementos Únicos:

Contador de comparaciones en partition para medir eficiencia.
Validación en main: lanza error si hay números negativos.
Medición de tiempo con System.nanoTime() y log con timestamp.
Manejo de Archivos:

Usa BufferedReader para leer entrada_quick.txt (línea con números separados por espacios).
Usa BufferedWriter para escribir arreglo ordenado en salida_quick.txt y log en log_quick.txt.
Manejo de Excepciones:

Captura excepciones con try-catch para errores de archivo o validación.
Prueba de Escritorio (Entrada: 3 6 8 10 1 2 1 en entrada_quick.txt):

Arreglo inicial: [3,6,8,10,1,2,1]
Partición con pivote 1: Menores [1], mayores [3,6,8,10,2] → Comparaciones: 6
Recursión en mayores: Pivote 2 → Menores [3], mayores [6,8,10] → Comparaciones: 4
Resultado: [1,1,2,3,6,8,10] → Total comparaciones: 10

...
Cómo Ejecutar
Crea input_quick.txt con una línea de números juntos (ejemplo, 36810121).
Compila: javac QuickSort.java.
Ejecuta: java QuickSort.
Salida: Arreglo ordenado en salida_quick.txt, log en log_quick.txt.
