package T07;
int [] arr = new arr [] {10,20,30,40,50};
/* a) Está mal escrito el tipo de array al inicializarlo. Hay que sustituir 
 * "arr" por "int"
 */
int [5] arr = new int [] {10,20,30,40,50};
/* b) El número de posiciones del array se coloca entre los segundos corchetes
 * no entre los primeros.
 */
int [] arr = new int [5] {10,20,30,40,50};
/* c) Se podría omitir el número de posiciones que tiene el Array; ya que le
 * estamos dando valores en la misma linea.
 */
int [] arr = new int [] {10,20,30,40,50};
/* d) Podríamos omitir el "new int []" porque al escribir los valores del 
 * propio array, se da por sentado de que estamos declarando un nuevo Array.
 */
int [] arr = new int [5];
/* e) La sintaxis es correcta. */