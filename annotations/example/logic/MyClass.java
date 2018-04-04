package annotations.example.logic;

public class MyClass {
	// Marcamos los metodos que queremos testear
	@Test(autor = "Santiago", version = 1.0)
	public static void method1() {
		System.out.println("Runing method 1");
	}

	@Test(version = 1.1)
	public static void method2() {
		System.out.println("Runing method 2");
	}

	@Test(version = 1.2)
	public static void method3() {
		System.out.println("Runing method 3");
		// Lanzamos una excepcion
		throw new RuntimeException("Oops!");
	}

	public static void method4() {
		System.out.println("Runing method 4");
	}

}
