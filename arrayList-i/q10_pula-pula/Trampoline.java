import java.util.LinkedList;

public class Trampoline {
    private LinkedList<Kid> playing;
    private LinkedList<Kid> waiting;

    public Trampoline(){
        waiting = new LinkedList<Kid>();
        playing = new LinkedList<Kid>();
    }

    protected Kid removeFromList(String name, LinkedList<Kid> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(name)){
                Kid retorno = list.get(i);
                list.remove(i);
                return retorno;
            }
        }
        return null;
    }

    public void arrive(Kid kid){
        waiting.addFirst(kid);
    }

    public void enter(){
        if(waiting.isEmpty()){
            System.out.println("Não tem ninguém na fila de espera!");
            return;
        }
        playing.addFirst(waiting.removeLast());
    }

    public void leave(){
        if(playing.isEmpty()){
            System.out.println("Não tem ninguém no pula-pula!");
            return;
        }
        waiting.addFirst(playing.removeLast());
    }

    public Kid remoteKid(String name){
        for(int i = 0; i < waiting.size(); i++){
            if(waiting.get(i).getName().equals(name)){
                return removeFromList(waiting.get(i).getName(), waiting);
            }
            if(playing.get(i).getName().equals(name)){
                return removeFromList(playing.get(i).getName(), playing);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String saida = "[";
        for(int i = 0; i < waiting.size(); i++){
            saida += waiting.get(i);
            if(i != waiting.size() - 1){
                saida += ", ";
            }
        }
        saida += "] => [";
        for(int i = 0; i < playing.size(); i++){
            saida += playing.get(i);
            if(i != playing.size() - 1){
                saida += ", ";
            }
        }
        saida += "]";
        return saida;
    }
}
