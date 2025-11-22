#  QuickSort

Este programa implementa el algoritmo **Quick Sort** para ordenar un arreglo de enteros. 

Los datos se leen desde `entrada_quick.txt` y los resultados se escriben en `salida_quick.txt` y `log_quick.txt`.

---

## Características Principales

- Ordena números enteros usando **Quick Sort recursivo**  
- Cuenta **comparaciones únicas** para medir eficiencia  
- Valida que todos los números sean positivos  
- Mide tiempo de ejecución con `System.nanoTime()`  
- Genera log con **timestamp**  
- Maneja errores de archivos y validación mediante `try-catch`  

---

##  Cómo funciona el algoritmo

1. **Clase `QuickSort`**  
   - `quickSort(int[] arr, int low, int high)`: ordena recursivamente el arreglo y acumula comparaciones  
   - `partition(int[] arr, int low, int high)`: elige el último elemento como pivote, particiona el arreglo y cuenta comparaciones

2. **Validación de entrada**:  
   - Si hay algún número negativo en el arreglo, el programa lanza un error y termina la ejecución.

3. **Medición de tiempo**:  
   - Se mide usando `System.nanoTime()` antes y después de ordenar el arreglo.  

4. **Registro de log**:  
   - Fecha y hora junto con el total de comparaciones realizadas.  

---

##  Archivos utilizados

### ✔ Archivo de entrada: `entrada_quick.txt`
- Una línea con números enteros separados por espacios.  
- Ejemplo:
3 6 8 10 1 2 1



###  Archivo de salida: `salida_quick.txt`
- Contiene el **arreglo ordenado**.  
- Ejemplo:
1 1 2 3 6 8 10


### Archivo de log: `log_quick.txt`
- Contiene **timestamp** y número de comparaciones realizadas.  
- Ejemplo:
2025-11-21T19:25 - Total comparaciones: 16



---

##  Ejemplo de ejecución

Entrada (`entrada_quick.txt`):
3 6 8 10 1 2 1



### Paso a paso:

1. **Arreglo inicial**: `[3,6,8,10,1,2,1]`  
2. **Partición con pivote `1`**:  
   - Menores: `[1]`  
   - Mayores: `[3,6,8,10,2]`  
   - Comparaciones: 6  

3. **Recursión en mayores, pivote `2`**:  
   - Menores: `[3]`  
   - Mayores: `[6,8,10]`  
   - Comparaciones: 4  

**Resultado final**: `[1,1,2,3,6,8,10]`  
**Total comparaciones**: 10

---

## ▶️ Cómo ejecutar

1. Crear `entrada_quick.txt` con números separados por espacios.  
2. Compilar: QuickSort.java
