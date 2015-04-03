Universidad de San Carlos de Guatemala
Facultad de Ingeniería
Escuela de Ciencias y Sistemas
Organización de Lenguajes y Compiladores 1 "A"
Laboratorio

Alumno: Carlos Vidal Hernández García
Carnet: 2011-23025

Manual Técnico - Primer Proyecto
---

El código del proyecto lo pueden encontrar en: [https://github.com/learnercys/proyecto-compi-1](https://github.com/learnercys/proyecto-compi-1)

### Dependencias

##### Jflex
Instalación en Linux(Ubuntu): `sudo apt-get install jflex`

##### Cup
Instalación en Linux(Ubuntu): `sudo apt-get install cup`

##### Gradle
Instalación en Linux(Ubuntu):`sudo apt-get install gradle`

##### Git
Instalación: `sudo apt-get install git`

##### Java 8
Instalación desde PPA:
```shell
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer
```


### Construcción del Proyecto

Para clonar el proyecto se utilizá el siguiente comando:
	`git clone https://github.com/learnercys/proyecto-compi-1.git`

Una vez instalado gradle se ejecutará el comando **gradle build** que descargará las dependencias y procederá a crear el ejecutable.

Más simple con [Intellij Idea](https://www.jetbrains.com/idea/). Se abre el proyecto y se indica que se desea contruir el proyecto con la configuración de un proyecto gradle. Esto instala dependencias y genera el ejecutable.




