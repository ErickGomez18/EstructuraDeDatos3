public class UsoMetodos {

	public static void main(String[] args){
		ListaDoble listaD = new ListaDoble();

		listaD.insertaPrimerNodo("A");
		listaD.insertaAlFinal("B");
		listaD.insertaAlFinal("C");
		listaD.insertaAlFinal("D");
		listaD.insertaAlFinal("E");
		listaD.insertaAlFinal("F");
		listaD.insertarDespuesDeNodo("G", "E");
		listaD.cambioDeNodo("N", "C");
		listaD.imprimir();
	}
}