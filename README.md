# UNIVERSIDAD POLITÉCNICA SALESIANA

## Comparación de Algoritmos de Ordenamiento

### Autor

Stephan Cedillo


# 1. Introducción

En este trabajo realicé una comparación experimental entre los algoritmos de ordenamiento Insertion Sort y Quick Sort. El objetivo fue analizar su rendimiento bajo diferentes condiciones de entrada para identificar en qué situaciones cada algoritmo ofrece mejores resultados.

# 2. Objetivos

## Objetivo General

Comparar el rendimiento de los algoritmos Insertion Sort y Quick Sort mediante pruebas experimentales utilizando diferentes tamaños y tipos de escenarios.

## Objetivos Específicos

* Medir los tiempos de ejecución de ambos algoritmos.
* Analizar el comportamiento de los algoritmos con datos desordenados.
* Analizar el comportamiento de los algoritmos con datos casi ordenados.
* Relacionar los resultados obtenidos mediante un análisis.

# 3. Metodología

Para realizar la comparación implementé los algoritmos Insertion Sort y Quick Sort en Java. Posteriormente ejecute las pruebas utilizando diferentes tamaños de arreglos( Que estan dentro de la Guia ):

* 10 000 elementos
* 50 000 elementos
* 100 000 elementos

Las pruebas se realizaron en dos escenarios:

1. Arreglos completamente desordenados.
2. Arreglos casi ordenados con una pequeño elemento agregado al final.

Durante cada ejecución del algoritmo registré el tiempo necesario para completar el ordenamiento y posteriormente comparé los resultados obtenidos.

# 4. Resultados Obtenidos

## Escenario 1: Datos Desordenados

| Tamaño de muestra | Tiempo Insertion Sort (ms) | Tiempo Quick Sort (ms) | Algoritmo más rápido |
| ----------------: | -------------------------: | ---------------------: | -------------------- |
|            10 000 |                     46.638 |                  4.839 | Quick Sort           |
|            50 000 |                    700.367 |                 31.008 | Quick Sort           |
|           100 000 |                   2955.859 |                 95.502 | Quick Sort           |

### Observaciones

* Quick Sort fue aproximadamente 10 veces más rápido para 10 000 elementos.
* La diferencia de rendimiento aumentó considerablemente conforme creció la cantidad de datos.
* Insertion Sort presentó un crecimiento exponencial a relacion con la cantidad de elementos.
* Quick Sort mantuvo un crecimiento mucho más controlado gracias a su complejidad O(n log n).

---

## Escenario 2: Datos Casi Ordenados

| Tamaño de muestra | Tiempo Insertion Sort (ms) | Tiempo Quick Sort (ms) | Algoritmo más rápido |
| ----------------: | -------------------------: | ---------------------: | -------------------- |
|            10 001 |                      0.032 |                 28.521 | Insertion Sort       |
|            50 001 |                      0.103 |               1621.281 | Insertion Sort       |
|           100 001 |                      0.341 |               8964.159 | Insertion Sort       |

### Observaciones

* Insertion Sort aprovechó que los datos ya estaban ordenados y no realizo muchas comparaciones ni movimientos.
* Los tiempos obtenidos por Insertion Sort fueron extremadamente bajos.
* Quick Sort tuvo un comportamiento muy malo.


# 5. Análisis de Resultados

## ¿Qué algoritmo fue más rápido en el escenario desordenado?

En el escenario con datos completamente desordenados observé que Quick Sort fue significativamente más rápido que Insertion Sort en todos los tamaños evaluados.

Esto ocurre porque Quick Sort posee una complejidad promedio de O(n log n), mientras que Insertion Sort tiene una complejidad O(n²). A medida que aumenta la cantidad de elementos, esta diferencia se vuelve cada vez más evidente.


## ¿Qué algoritmo fue más rápido en el escenario casi ordenado?

En el escenario casi ordenado el algoritmo que obtuvo mejores resultados fue Insertion Sort.

Este comportamiento se debe a que Insertion Sort únicamente necesita realizar pequeñas correcciones cuando los elementos ya se encuentran cerca de su posición final, reduciendo considerablemente la cantidad de comparaciones y movimientos.


## ¿El crecimiento de los datos afectó por igual a ambos algoritmos?

No.

El aumento de datos afectó a ambos algoritmos, pero el impacto fue mucho mayor en Insertion Sort cuando los datos estaban desordenados. Su tiempo de ejecución creció de forma muy acelerada debido a su complejidad cuadrática.

Por otro lado, Quick Sort mantuvo un crecimiento más eficiente gracias a su complejidad promedio O(n log n).


## ¿Por qué Insertion Sort fue tan rápido en el escenario casi ordenado?

Insertion Sort funciona comparando cada elemento con los anteriores hasta encontrar su posición correcta.

Cuando los datos ya están casi ordenados, la mayoría de los elementos ya se encuentran en la posición adecuada o muy cerca de ella, por lo que el algoritmo realiza muy pocos intercambios y comparaciones. Como resultado, el tiempo de ejecución disminuye considerablemente.


## ¿Por qué Quick Sort suele ser más rápido en datos desordenados?

Quick Sort divide el problema en subproblemas más pequeños mediante la selección de un pivote.

Esta estrategia permite ordenar grandes cantidades de datos de manera eficiente, logrando una complejidad promedio O(n log n). Gracias a ello suele superar ampliamente a algoritmos simples como Insertion Sort cuando se trabaja con arreglos grandes y desordenados.


# 6. Resultados Obtenidos comparados a la teoría

Los resultados obtenidos coinciden con lo esperado según la teoría de complejidad computacional.

Quick Sort demostró ser una excelente alternativa para conjuntos de datos grandes y desordenados, mientras que Insertion Sort mostró un rendimiento significativamente mejor cuando los datos ya se encontraban casi ordenados.

También pude observar que la implementación de Quick Sort utilizada presenta una debilidad cuando el pivote seleccionado corresponde al último elemento del arreglo. Esta situación provoca desproporcionadas en arreglos casi ordenados lo que hace que de error de memoria, por lo cual implemente una forma de escoger el pivote mejor.


# 7. Conclusiones

Después de realizar las pruebas y analizar los resultados, concluyo que no existe un algoritmo de ordenamiento que sea el mejor en todos los escenarios.

Quick Sort fue claramente superior cuando trabajé con datos desordenados, manteniendo tiempos de ejecución bajos incluso con grandes cantidades de elementos. Por otro lado, Insertion Sort obtuvo resultados extraordinarios cuando los arreglos ya estaban casi ordenados, alcanzando tiempos prácticamente instantáneos.

Finalmente, comprobé que la elección de un algoritmo debe realizarse considerando las características de los datos de entrada o del escenario, ya que estas influyen directamente en el rendimiento que espera el usuario.

