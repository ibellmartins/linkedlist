package listaLigada;

public class Node {
	String nomeAnimal;
	Node next; //next: nome do elemento
	
	public Node(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
		this.next = null;
	}
	
	public void mostraAnimal() {
		System.out.println("animal --> " + nomeAnimal);
	}
}
