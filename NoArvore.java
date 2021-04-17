package apparvorebinariadebusca;

public class NoArvore {
    
    int dado;
    NoArvore esq;
    NoArvore dir;
    
    public NoArvore(int dado) {
        this.dado = dado;
        esq = dir = null;
    }
    
    @Override
    public String toString() {
        return String.valueOf(dado);
    }
    
}
