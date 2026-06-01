## Universidad Politecnica Salesiana
### Stephan Cedillo

### Resultados Obtenidos
#### Escenario 1: Comparación de Insertion Sort y Quick Sort 
| Tamaño de muestra | Tiempo Insertion Sort (ms) | Tiempo Quick Sort (ms) | Algoritmo más rápido | Observación                                                                                                                          |
| ----------------: | -------------------------: | ---------------------: | -------------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
|            10 000 |                     46.638 |                  4.839 | Quick Sort           | Quick Sort fue aproximadamente 9.6 veces más rápido que Insertion Sort.                                                              |
|            50 000 |                    700.367 |                 31.008 | Quick Sort           | La diferencia de rendimiento aumentó considerablemente al incrementar el tamaño de los datos.                                        |
|           100 000 |                   2955.859 |                 95.502 | Quick Sort           | Quick Sort mantuvo una alta eficiencia, mientras que Insertion Sort presentó un crecimiento significativo en el tiempo de ejecución. |

#### Escenario 2: Comparación de Insertion Sort y Quick Sort 
| Tamaño de muestra | Tiempo Insertion Sort (ms) | Tiempo Quick Sort (ms) | Algoritmo más rápido | Observación                                                                                                                             |
| ----------------: | -------------------------: | ---------------------: | -------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
|            10 001 |                      0.032 |                 28.521 | Insertion Sort       | Insertion Sort aprovechó que el arreglo estaba casi ordenado, obteniendo un tiempo extremadamente bajo.                                 |
|            50 001 |                      0.103 |               1621.281 | Insertion Sort       | La diferencia de rendimiento fue muy grande a favor de Insertion Sort.                                                                  |
|           100 001 |                      0.341 |               8964.159 | Insertion Sort       | Quick Sort presentó un desempeño muy inferior debido a la naturaleza casi ordenada de los datos y la estrategia de partición utilizada. |

### Analisis Requerido 
#### ¿ Que algoritmo fue más rápido en el escenario desordenado?
 En el caso de desordenado el Quick Sort fue significativamente más rápido que el Insertion Sort, especialmente a medida que el tamaño de la muestra aumentaba. Esto se debe a que Quick Sort tiene una complejidad promedio de O(n log n), mientras que Insertion Sort tiene una complejidad de O(n^2) en el peor caso. 
 #### ¿ Que algoritmo fue más rápido en el escenario casi ordenado?
 
 Insertion Sort fue mas rapido que Quick Sort debido a su eficiencia en este tipo de datos, ya que puede ordenar rápidamente elementos cercanos a su posición final. Quick Sort, por otro lado, sufrió un rendimiento muy pobre debido a la elección de pivote y la naturaleza casi ordenada del arreglo, lo que llevó a una complejidad cercana a O(n^2).
#### ¿ El crecimiento de los datos afecto por igual a ambos algoritmos?

 Este si afecto a ambos ordenamientos, cuando se aumenta datos pero el que tenia un impacto mas grande fue el Insertion Sort, ya que su tiempo de ejecución se incrementó de manera exponencial, mientras que Quick Sort mantuvo un crecimiento mucho mejor por ser O(n log n)
 
 #### ¿ Porque Insertion sort fue tan rápido en el escenario casi ordenado? 
Insertion Sort es especialmente eficiente para arreglos que ya están casi ordenados porque siempre va comparando el elemento actual con los anteriores y solo realiza movimientos mínimos para colocar cada elemento en su posición correcta. En un escenario casi ordenado, la mayoría de los elementos ya están cerca de su posición final, lo que permite que Insertion Sort complete el proceso con muy pocas comparaciones y movimientos, resultando en un tiempo de ejecución extremadamente bajo.
#### ¿ Por que Quick Sort suele ser mas rapido en datos desordenados? 
Quick Sort suele ser más rápido en datos desordenados porque tiene una complejidad promedio de O(n log n), lo que lo hace muy eficiente para grandes conjuntos de datos. En contraste, Insertion Sort tiene una complejidad de O(n^2) en el peor caso, lo que lo hace muy lento para grandes arreglos.

### Conclusión 
En conclusión, la elección del algoritmo de ordenamiento depende en gran medida de la naturaleza de los datos a ordenar. Quick Sort es generalmente más eficiente para datos desordenados debido a su complejidad promedio de O(n log n), mientras que Insertion Sort puede ser extremadamente rápido para arreglos que ya están casi ordenados. Es importante considerar el tamaño y la estructura de los datos al seleccionar un algoritmo de ordenamiento para garantizar un rendimiento óptimo.

### Recomendaciones 
Vi un error de memoria en Quick Sort, ya que en el arreglo original elige el pivote de la derecha, pero este suele ser contraproducente en arreglos casi ordenados, por lo que se recomienda implementar una estrategia de selección de pivote más robusta, como elegir el pivote de manera aleatoria o utilizar la mediana de tres elementos para mejorar el rendimiento en casos desfavorables.
