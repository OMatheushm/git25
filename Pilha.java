package Package;

public class Pilha {
	private Object[] elementos;
	private int topo = 0;

	public Pilha (int maximo) {
			elementos = new Object[maximo];
	}
	public void empilhar(Object elemento) {
		elementos[topo] = elemento;
		topo++;
	}
	public Object desempilhar() {;
		topo--;
		return elementos[topo];
	}
	public Object topo() {
		return elementos[topo-1];
	}
	public int tamanho() {
		return topo;
	}
	public Object[] getElementos() { // Por meio deste método outras classes podem acessar o array
		return elementos; // retorna o array: elemento, que armazena todos os elementos da pilha
	}
	public void setElementos(Object[] elementos) { // por meio deste método posso modificar diretamente os elementos da pilha 
		this.elementos = elementos;					// ou substituir TODA a pilha por uma nova
	}
	public int getTopo() {
		return topo;
	}
	public void setTopo(int topo) { // Por meio deste método, outras classes podem modificar diretamente o valor do atributo Topo
		this.topo = topo;// Pode ser usado para alterar o número de elementos na pilha ou para definir o topo da pilha para um valor específico
	}
}
