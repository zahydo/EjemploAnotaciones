package annotations.example.presentation;

import annotations.example.logic.MyClass;
import annotations.example.logic.RunTests;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunTests rt = new RunTests();
		MyClass cl = new MyClass();
		try {
			rt.execute(cl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
