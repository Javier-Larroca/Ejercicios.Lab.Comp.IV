package principal;

public class Principal{

public static void main(String[] args) {

Thread x = new Thread(new A());

Thread y = new Thread(new A());

}

}



class A implements Runnable

{

@Override

public void run() {

System.out.print("Hola");

}

}