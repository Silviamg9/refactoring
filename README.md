Ejercicio1: 
Este programa simula un juego en el que un jugador establece una contraseña y el otro intenta adivinarla.
El programa solicita al Jugador 1 que ingrese una contraseña y luego al Jugador 2 que intente adivinarla.
Proporciona pistas sobre la contraseña, como su longitud, la primera letra y la última letra. Luego compare el intento del Jugador 2 con la contraseña ingresada, verificando carácter por carácter si coincide.
Si el intento es correcto, muestra el mensaje "¡Acertaste!"; de lo contrario, muestra "Fallaste".

Ejercicio2:
Este programa genera una tabla de 20 vocales aleatorias y calcula la frecuencia de aparición de cada una de ellas. 
Utiliza un objeto Random para seleccionar aleatoriamente vocales del conjunto {'a', 'e', 'i', 'o', 'u'}, almacenándolas en un arreglo llamado tabla. 
Simultáneamente, actualiza un arreglo de frecuencias frecuencia para contar cuántas veces aparece cada vocal mediante un bloque switch.
Finalmente, muestra en consola tanto la tabla de vocales generadas como la frecuencia de cada vocal, permitiendo observar la distribución de las vocales seleccionadas de forma aleatoria.

Ejercicio3:
Este programa cuenta cuantas veces aparece una palabra específica dentro de una frase ingresada por el usuario. 
Primero, solicite al usuario que introduzca una frase y luego una palabra. 
Utiliza el método indexOfen un bucle para buscar todas las ocurrencias de la palabra dentro de la frase, incrementando un contador cada vez que encuentre una coincidencia. 
El índice de búsqueda se actualiza para continuar después de la palabra encontrada, evitando repetir coincidencias. 
Finalmente, muestra cuántas veces aparece la palabra en la frase, proporcionando un conteo preciso.

Ejercicio4:
Este programa elimina y muestra los valores únicos de un arreglo de enteros, evitando duplicados.
A partir de un arreglo predefinido ( tabla), utilice un arreglo booleano ( visto) para rastrear los elementos que ya han sido identificados como duplicados. 
En un bucle, verifique si un número no ha sido marcado como duplicado; si es único, lo imprime y marca todas sus ocurrencias posteriores en el arreglo como vistas.
De esta manera, el programa muestra los números del arreglo original en el orden en que aparecen pero sin repetición.

Ejercicio5:
Este programa permite al usuario interactuar con un arreglo de números, eliminando elementos según los índices que especifique. 
Comienza con un arreglo predefinido de enteros y muestra su contenido al usuario.
Luego, solicite un índice para eliminar el elemento correspondiente, moviendo los elementos subsiguientes hacia la izquierda para llenar el hueco, y reduzca el tamaño lógico del arreglo. 
Si el usuario ingresa un índice inválido o fuera del rango, se notifica el error. 
El proceso continúa hasta que el usuario ingresa -1para salir o no quedan elementos en el arreglo.

Mejoras realizadas:
Modularización: Extraí la lógica de conteo de palabras en un método independiente contarPalabra para mejorar la reutilización y la claridad.
Legibilidad: El código principal ahora es más conciso, ya que delega la tarea de conteo al método dedicado.
Reusabilidad: El método contarPalabra puede ser reutilizado en otros contextos o programas sin modificaciones adicionales.
