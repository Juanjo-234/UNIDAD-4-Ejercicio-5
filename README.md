Resolucion del ejercicio N°5 de la unidad 4 de programación 2.
Clase Abstracta (UnidadCombate):

Funciona como la base común para todas las unidades del juego. Define atributos de estado compartidos como posicionX, posicionY y energia.

Declara los métodos abstractos moverse(int nuevaX, int nuevaY) y atacar(), obligando a cada tipo de unidad a definir su propia lógica y restricciones.

Clases Hijas (Subclases Concretas):

Infanteria: Implementa el movimiento y ataque considerando restricciones terrestres estándar (por ejemplo, velocidad moderada y alcance de corto alcance).

Caballeria: Modela un movimiento más rápido pero con restricciones en determinados terrenos difíciles.

UnidadAerea: Sobrescribe los métodos omitiendo restricciones de terreno terrestre, permitiendo desplazamientos directos.

Método/Clase Coordinadora:

Recibe una colección heterogénea de unidades (List<UnidadCombate>) y recorre la lista invocando de forma masiva y dinámica las acciones de movimiento y ataque, demostrando el polimorfismo.

Clase Principal (Main):

Instancia diversas unidades (Infanteria, Caballeria, UnidadAerea), las agrupa en una única lista, dispara sus desplazamientos y muestra por consola las coordenadas y estados actualizados.

<img width="622" height="497" alt="Captura de pantalla 2026-10-28 101545" src="https://github.com/user-attachments/assets/3176ef3a-8a07-4003-856a-889981e1ddeb" />

