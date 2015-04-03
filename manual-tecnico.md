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


### Analizadores Léxicos
##### Estructura

La estructura empleada para la construcción de los analizadores léxicos es la siguiente:

- Sección de Cabecera:
```java
package net.project.lexer.package;
import java_cup.runtime.Symbol;
import net.project.parser.packane.sym;
```

- Sección de Macros:
```jflex
%public
%class PackageLexer
%unicode
%line
%column
%cupsym sym
%cup
```

- Código incluido en la clase generada por jflex:
```java
private Symbol symbol( int type ) {
	return new Symbol( type, yyline, yycolumn);
}
private Symbol symbol( int type, Object value ) {
    return  new Symbol( type, yyline, yycolumn, value );
}
```

- Carácteres sin significado:
En esta sección se agregan todos los caracteres que pertenecen al lenguaje pero que carecen de significado dentro del mismo.

- Carácteres con significado:
En esta sección se agregan todos los carácteres que pertencen al lenguaje y que tienen significado.

- Nombre del tag:
Contiene todos los nombre de los tags

- Palabras:
Todas las palabras que pertenecen al lenguaje y que solas poseen un significado dentro del mismo.

- Tags principales:
Son todos los tags presentes en el lenguaje.

- Reglas:
Todas las reglas dentro del lenguaje.

### Analizadores Sintácticos

La estructura empleada para la construcción de los analizadores sintácticos es la siguiente:

- Cabecera:
```java
    package net.project.parser.package;
    import java_cup.runtime.Symbol;
```

- Código de usuario:
En ambos analizadores se generan las mismas instrucciones para indentificar errores presentes en el análisis.
```java
    public boolean hasUnRecoveredSyntaxError = false;

    public void syntax_error( Symbol currentToken ) {
        // just to avoid native syntax_error method.
    }

    public void unrecovered_syntax_error( Symbol s ) throws java.lang.Exception {
        // has an un-recovered syntax error(structure error)
        this.hasUnRecoveredSyntaxError = true;
    }
```

- Terminales:
Todas las producciones terminales presentes en la estructura.
```
	// main tags

	// signle chars

    // single words

    // Regular Expressions
```

- No terminales:
Todas las producciones no terminales presentes en la estructura.

- Producciones
