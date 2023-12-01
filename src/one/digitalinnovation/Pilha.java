package one.digitalinnovation;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    //método para adicionar um no na pilha
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    //método que exclui o ultimo/primeiro elemento da pilha
    public No pop(){
     if(!this.isEmpty()){
         No noPoped = refNoEntradaPilha;
         refNoEntradaPilha = refNoEntradaPilha.getRefNo();
         return noPoped;
        }   return null;
    }

    //método que chama o no do topo sem excluir
    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
      return  refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "----------\n";
        stringRetorno +="       Pilha\n";
        stringRetorno += "----------\n";

        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null) {
                stringRetorno += "[No {dado = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "==========";
        return stringRetorno;
    }
}
