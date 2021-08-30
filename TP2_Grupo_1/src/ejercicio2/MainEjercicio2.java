package ejercicio2;

public class MainEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciacion de objetos
		ProductosFrescos productoFrescos = new ProductosFrescos("30/11/2021", 1234, "30/08/2021", "Argentina");
		ProductosRefrigerados productoRefrigerado = new ProductosRefrigerados("24/12/2021", 1235, 515);
		ProductosCongelados productoCongelado = new ProductosCongelados ("31/12/2021", 1236, 8);
		
		
		System.out.println(productoFrescos.toString());
		System.out.println(productoRefrigerado.toString());
		System.out.println(productoCongelado.toString());
	}

}
