# Estructura de Datos No Lineales
Practica Proyecto Marvel

## Descripción del problema 🔨
El estudio de los sistemas en red es en la actualidad un tema de tremendo interés y
vitalidad. Este interés está asociado al nacimiento de un nuevo campo de conocimiento
conocido como Complex Networks/Network Science o Redes Complejas/Ciencia de Redes
donde las redes consideradas pueden ser sociales, económicas, metabólicas, genéticas, de
comunicaciones, epidemiológicas, o ecológicas, entre otras. En este trabajo, se utilizará una
red de relaciones para aplicar los conceptos vistos en clase sobre el Tipo Abstracto de Datos
Grafo, así como para ilustrar el tipo de estudios que es posible realizar sobre los sistemas
en red.


En el sitio web https://github.com/melaniewalsh/sample-social-networkdatasets/tree/master/sample-datasets/marvel se encuentra un fichero en formato CSV
(marvel-unimodal-edges.csv) que representa una red de relaciones entre personajes de la
editorial Marvel1


En cada línea del fichero, además de los nombres de dos personajes
relacionados, se indica mediante un número entero positivo el número de interacciones
que estos han tenido. El objetivo de este trabajo es diseñar e implementar un programa en
Java que procese el fichero indicado y realice las siguientes tareas:


a) Construir el grafo correspondiente y mostrar el número de personajes, el número
total de relaciones entre personajes, el personaje más sociable (el que tiene más
relaciones con otros) y el personaje que menos trabaja en equipo (el que tiene
menos interacciones con el resto). En los dos últimos casos, si hay más de un
personaje que cumpla la condición se mostrarán todos ellos.


b) Determinar la secuencia más corta de personajes que conecte a dos personajes
dados (leídos por teclado).


c) Diseñar un equipo de personajes formado a partir de dos personajes dados (leídos
por teclado). Para que sea original, se utilizarán personajes que hayan tenido pocas
interacciones entre ellos. De esta forma, para configurar el equipo se calculará una
secuencia cualquiera de personajes que conecte a esos dos teniendo en cuenta que
el número de interacciones entre personajes no sea superior a 9. Si no existe
ninguna secuencia de personajes con esas características deberá indicarse.


## Autores ✒️

_Proyecto creado por_ 
* **Roberto Esteban Olivares** 📢[Perfil GitHub](https://robertoestebanolivares.github.io/RobertoEsteban.github.io/)
* **Natalia Blanco Diaz**
* **Paula Vivanco Sánchez**

## Construido con 🛠️

_Las tecnologías utilizadas para el desarrollo del proyecto son:_

⚙️ Java <br>
⚙️ CSV <br>

