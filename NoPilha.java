package apparvorebinariadebusca;

public class NoPilha {
    
    public NoArvore dado;
    public NoPilha prox;
    
    public NoPilha(NoArvore dado) {
        this.dado = dado;
        prox = null;
    }
    
    @Override
    public String toString() {
        return dado.toString();
    }
    
    
    
}
