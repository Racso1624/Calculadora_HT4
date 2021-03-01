import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebas {

	@Test
	void testsumas() {
		int r = Singleton.operar(1, 2, 1);
		if (r != 3){
			fail("Not yet implemented");
		}
	}
	
	@Test
	void testrestas() {
		int r = Singleton.operar(2, 1, 2);
		if (r != 1){
			fail("Not yet implemented");
		}
	}
	
	@Test
	void testmultis() {
		int r = Singleton.operar(1, 2, 3);
		if (r != 2){
			fail("Not yet implemented");
		}
	}
	
	@Test
	void testdivs() {
		int r = Singleton.operar(6, 2, 4);
		if (r != 3){
			fail("Not yet implemented");
		}
	}
	
	@Test
	void testarray() {
		Calculadora calculadora = new Calculadora();
		String prelineatest = "(2+3)*9";
		String lineatest = Intopostfix.infixToPostfix(prelineatest);
		String respuesta = calculadora.Calculo(lineatest, 1);
		if (respuesta.equals("45")){
		}else {fail("Not yet implemented");}
	}
	
	@Test
	void testvector() {
		Calculadora calculadora = new Calculadora();
		String prelineatest = "(2+3)*9";
		String lineatest = Intopostfix.infixToPostfix(prelineatest);
		String respuesta = calculadora.Calculo(lineatest, 2);
		if (respuesta.equals("45")){
		}else {fail("Not yet implemented");}
	}
	
	@Test
	void testlistasi() {
		Calculadora calculadora = new Calculadora();
		String prelineatest = "(2+3)*9";
		String lineatest = Intopostfix.infixToPostfix(prelineatest);
		String respuesta = calculadora.Calculo(lineatest, 3);
		if (respuesta.equals("45")){
		}else {fail("Not yet implemented");}
	}
	
	@Test
	void testlistadob() {
		Calculadora calculadora = new Calculadora();
		String prelineatest = "(2+3)*9";
		String lineatest = Intopostfix.infixToPostfix(prelineatest);
		String respuesta = calculadora.Calculo(lineatest, 4);
		if (respuesta.equals("45")){
		}else {fail("Not yet implemented");}
	}
	
	@Test
	void testfactoryarray() {
		Factory factory = new Factory();
		Stack<Integer> stack = factory.factoryStack(1);
		Stack<Integer> base = new ArrayListStack<Integer>();
		if (stack==base){
			fail("Not yet implemented");
		}else {}
	}
	
	@Test
	void testfactoryvector() {
		Factory factory = new Factory();
		Stack<Integer> stack = factory.factoryStack(2);
		Stack<Integer> base = new VectorStack<Integer>();
		if (stack==base){
			fail("Not yet implemented");
		}else {}
	}
	
	@Test
	void testfactorylistalinked() {
		Factory factory = new Factory();
		Stack<Integer> stack = factory.factoryStack(3);
		Stack<Integer> base = new SinglyLinkedStack<Integer>();
		if (stack==base){
			fail("Not yet implemented");
		}else {}
	}
	
	@Test
	void testfactorylistadoublelinked() {
		Factory factory = new Factory();
		Stack<Integer> stack = factory.factoryStack(4);
		Stack<Integer> base = new DoublyLinkedStack<Integer>();
		if (stack==base){
			fail("Not yet implemented");
		}else {}
	}
}
