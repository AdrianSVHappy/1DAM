import pedidos.Pizza;

/**
 * <h1>Ejercicio 5</h1>
 * <p>Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
 * quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
 * información sobre el número total de pizzas que se han pedido y que se
 * han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. El
 * siguiente código del programa principal debe dar la salida que se muestra:</p><hr>
 * <pre>Devuelve:
 * pizza margarita mediana, pedida
 * pizza funghi familiar, servida
 * pizza cuatro quesos mediana, pedida
 * esa pizza ya se ha servido
 * pedidas: 3
 * servidas: 1</pre>
 * */
public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
    }
}