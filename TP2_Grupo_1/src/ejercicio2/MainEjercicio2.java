package ejercicio2;

public class MainEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciacion de objetos
		
		//MES / DIA / AÑO
		ProductosFrescos productoFrescos = new ProductosFrescos("11/30/2021", 1234, "30/08/2021", "Argentina");
		ProductosRefrigerados productoRefrigerado = new ProductosRefrigerados("12/21/2021", 1235, 515);
		ProductosCongelados productoCongelado = new ProductosCongelados ("12/31/2021", 1236, 8);
		
		System.out.println(productoFrescos.toString());
		System.out.println(productoRefrigerado.toString());
		System.out.println(productoCongelado.toString());
	}

}
