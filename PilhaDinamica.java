package apparvorebinariadebusca;

public class PilhaDinamica {
    
    private NoPilha topo;
    private int qtd = 0;
    
    public PilhaDinamica() {
        topo = null;
    }
    
    public void push(NoArvore novoElemento) {
        NoPilha novoNo = new NoPilha(novoElemento);
        novoNo.prox = topo;
        topo = novoNo;
        qtd++;
    }
    
    public NoArvore pop() throws Exception{
        if(!isEmpty()) {
            NoPilha temp = topo;
            topo = topo.prox;
            qtd--;
            return temp.dado;
        }
        else {
            throw new Exception ("Pilha vazia");
        }
    }
    
    public NoArvore top() throws Exception{
        if(!isEmpty()) {
            return topo.dado;
        }
        else {
            throw new Exception("Pilha vazia");
        }
    }
    
    public boolean isEmpty() {
        return topo == null;
    }
    
    public int size() {
        return qtd;
    }

    @Override
    public String toString() {
        NoPilha atual = topo;
        String saida = "";
        while(atual != null) {
            saida += atual.dado + ", ";
            atual = atual.prox;
        }
        return saida;
    }
    
}