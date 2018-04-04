package annotations.example.logic;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class RunTests {
	public void execute(Object myClass) throws Exception {
		int passed = 0, failed = 0;
		// Por medio de reflexion obtenemos los metodos de la clase MyClass
		for (Method m : Class.forName(myClass.getClass().getName()).getMethods()) {
			// Para cada metodo verificamos si existe una anotacion de tipo Test
			if (m.isAnnotationPresent((Class<? extends Annotation>) Test.class)) {
				// Por medio de reflexion obtenemos la declaracion de la anotacion
				Test annotation = m.getAnnotation(Test.class);
				// Mostramos la informacion de los miembros de la anotacion
				System.out.println("Testing " + m.getName());
				if (!annotation.autor().equals("")) {
					System.out.print("\tAutor: " + annotation.autor());
				}
				System.out.println("\tVersion: " + annotation.version());
				try {
					// Por medio de reflexion invocamos el metodo sin pasarle parametros
					m.invoke(null);
					passed++;
				} catch (Throwable ex) {
					// Mostramos el nombre del metodo y el texto de la excepcion
					System.out.println("\tfailed: " + ex.getCause());
					failed++;
				}
			}
		}
		System.out.printf("%s:%n", MyClass.class.getCanonicalName());
		System.out.printf("Passed: %d, Failed: %d%n", passed, failed);
	}
}
