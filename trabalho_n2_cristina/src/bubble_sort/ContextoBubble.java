package bubble_sort;

public class ContextoBubble {

	    private EstrategiaOrdenacao estrategia;

	    public ContextoBubble(EstrategiaOrdenacao estrategia) {
	        this.estrategia = estrategia;
	    }

	    public void setEstrategia(EstrategiaOrdenacao estrategia) {
	        this.estrategia = estrategia;
	    }

	    public void executarOrdenacao(int[] array) {
	        estrategia.ordenar(array);
	    }
	}
	
	
	
	
	
	
	
	
	

