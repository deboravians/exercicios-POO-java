import java.util.*;
import java.util.stream.Collectors;

class Mercantil {
    private ArrayList<Pessoa> caixas;
    private LinkedList<Pessoa> espera;

    public Mercantil(int qtdCaixas){
        caixas = new ArrayList<Pessoa>();
        espera = new LinkedList<Pessoa>();

        for(int i = 0; i < qtdCaixas; i++){
            caixas.add(null);
        }
    }

    private boolean validarIndice(int indice){
        if(indice < 0 || indice > caixas.size() - 1) return false;
        return true;
    }

    public void chegar(Pessoa pessoa){
        espera.add(pessoa);
    }

    public boolean chamar(int indice){
        if(!validarIndice(indice)){
            System.out.println("fail: caixa inexistente");
            return false;
        }
        if(espera.isEmpty()){
            System.out.println("fail: sem clientes");
            return false;
        }
        if(caixas.get(indice) != null){
            System.out.println("fail: caixa ocupado");
            return false;
        }
        caixas.set(indice, espera.remove(0));
        return true;
    }

    public Pessoa finalizar(int indice){
        if(!validarIndice(indice)){
            System.out.println("fail: caixa inexistente");
            return null;
        }
        if(caixas.get(indice) == null){
            System.out.println("fail: caixa vazio");
            return null;
        }
        Pessoa pessoa = new Pessoa(caixas.get(indice).getNome());
        caixas.set(indice, null);
        return pessoa;
    }

    @Override
    public String toString() {
        var caixas = this.caixas.stream()
                .map(pessoa -> pessoa == null ? "-----" : pessoa.getNome())
                .collect(Collectors.joining(", "));
        var espera = this.espera.stream()
                .map(pessoa -> pessoa.getNome())
                .collect(Collectors.joining(", "));
        return "Caixas: [" + caixas + "]\nEspera: [" + espera + "]";
    }
}
