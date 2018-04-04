package annotations.example.logic;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//Retention(RUNTIME) ya que se necesita que retenga el archivo de clase en tiempo de ejecucion,
//con el fin de poder leerlas mediante reflexion
@Retention(RUNTIME)
// Target(METHOD) debido a que el alcance en la declaracion de las pruebas
// unitarias es unicamente para metodos.
@Target(METHOD)
// Declaramos la anotacion Test con dos miebros de tipos primitivos, autor y
// version.
// Con el fin de saber si se ha hecho una actualizacion al metodo y quien es el
// autor
public @interface Test {
	String autor() default "";

	double version();
}
