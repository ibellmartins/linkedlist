package listaLigada;

public class LinkedList {
	Node header; // primeiro Node da lista linkada
	Node trailer; //ultimo Node da lista linkada
	int size;
	
	LinkedList(){
		//objetivo aqui é criar uma lista vazia 
		header = null;
		trailer = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		if (size==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int verTamanho() {
		//retorna a qntd de elementos na lista
		return size;
	}
	
	public Node first() {
		//retorna o primeiro nó da lista
		return header;
	}
	
	public Node last() {
		//retorna ultimo nó da lista
		return trailer;
	}
	
	public void addFirst(Node novo) {
		//adiciona um novo nó no inicio da lista
		if (isEmpty()) {
			header = novo;
			trailer = novo;
		} else {
			novo.next = header;
			header = novo;
		}
		size++;
	}
	
	public void addLast(Node novo) {
		//add novo nó no fim da lista - IMPORTATE: o fim da lista é identificado qnd um node está apontando p NULL;
		if (isEmpty()) {
			header = novo;
			trailer = novo;
		} else {
			trailer.next = novo; //o ultimo node esta apontando pro novo node que vai virar o ultimo
			trailer = novo;
		}
		size++;
	}
	
	public void mostraLista() {
		Node aux = header;
		aux.mostraAnimal();
		while(aux.next != null) {
			aux = aux.next;
			aux.mostraAnimal();
		}
		System.out.println("FIM DA LISTA!");
	}
}
