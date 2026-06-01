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
####

 Este si afecto a ambos ordenamientos, cuando se aumenta datos pero el que tenia un impacto mas grande fue el Insertion Sort, ya que su tiempo de ejecución se incrementó de manera exponencial, mientras que Quick Sort mantuvo un crecimiento mucho mejor por ser O(n log n)

