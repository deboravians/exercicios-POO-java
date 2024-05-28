import java.util.ArrayList;

public class Sala {
    private ArrayList<Client> cadeiras;
    public Sala(int capacidade){
        cadeiras = new ArrayList<Client>();

        for(int i = 0; i < capacidade; i++){
            cadeiras.add(null);
        }
    }

    private int procurar(String nome){
        for(int i = 0; i < cadeiras.size(); i++){
            if(cadeiras.get(i) != null){
                if(cadeiras.get(i).getId().equals(nome)){
                    return i;
                }
            }
        }
        return -1;
    }

    private boolean verificarIndice(int indice){
        if(indice > cadeiras.size() || indice < 0){
            return false;
        }
        return true;
    }

    public boolean reservar(String id, String fone, int ind){
        if(!verificarIndice(ind)){
            System.out.println("fail: cadeira nao existe");
            return false;
        }
        if(cadeiras.get(ind) != null){
            System.out.println("fail: cadeira ja esta ocupada");
            return false;
        }
        if(procurar(id) != -1){
            System.out.println("fail: cliente ja esta no cinema");
            return false;
        }
        Client cliente = new Client(id, fone);
        cadeiras.set(ind, cliente);
        return true;
    }

    public void cancelar(String id){
        if(procurar(id) == -1){
            System.out.println("fail: cliente nao esta no cinema");
            return;
        }
        for(int i = 0; i < cadeiras.size(); i++){
            if(cadeiras.get(i) != null){
                if(cadeiras.get(i).getId().equals(id)){
                    cadeiras.set(i, null);
                    return;
                }
            }
        }
    }

    public ArrayList<Client> getCadeiras(){
        return cadeiras;
    }

    @Override
    public String toString() {
        String saida = "[";
        for(int i = 0; i < cadeiras.size(); i++){
            if(cadeiras.get(i) == null){
                saida += "-";
            }
            else{
                saida += cadeiras.get(i);
            }
            if(i != cadeiras.size() - 1){
                saida += " ";
            }
        }
        return saida += "]";
    }
}
