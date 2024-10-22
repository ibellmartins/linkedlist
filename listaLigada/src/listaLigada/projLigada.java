package listaLigada;

public class projLigada {
	public static void main(String[]args) {
		LinkedList zoo = new LinkedList();
		
		Node n1 = new Node("GATO");
		zoo.addFirst(n1);
		
		zoo.addFirst(new Node("CACHORRO"));
		
		zoo.addFirst(new Node("PATO"));
		
		zoo.addLast(new Node("LEAO"));
		
		zoo.addLast(new Node("JACARÉ"));
		
		zoo.addLast(new Node("MACACO"));
		
		zoo.mostraLista();
	}
}
