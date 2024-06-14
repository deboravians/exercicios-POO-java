import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Topic {
    private ArrayList<Pass> normalSeats;
    private ArrayList<Pass> prioritySeats;

    public Topic(int capacity, int qtdPriority){
        prioritySeats = new ArrayList<>();
        for(int i = 0; i < qtdPriority; i++){
            prioritySeats.add(null);
        }
        normalSeats = new ArrayList<>();
        for(int i = 0; i < capacity - qtdPriority; i++){
            normalSeats.add(null);
        }
    }

    private int findFree(List<Pass> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == null){
                return i;
            }
        }
        return -1;
    }

    private int findName(List<Pass> list, String name){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != null){
                if(list.get(i).getName().equals(name)){
                    return i;
                }
            }
        }
        return -1;
    }

    private boolean insertOnList(List<Pass> list, Pass pass){
        if(findFree(list) == -1) {
            return false;
        }
        list.set(findFree(list), pass);
        return true;
    }

    private boolean removeFromList(List<Pass> list, String name){
        if(findName(list, name) == -1){
            return false;
        }
        list.set(findName(list, name), null);
        return true;
    }

    public boolean insert(Pass pass){
        if(findName(prioritySeats, pass.getName()) != -1 || findName(normalSeats, pass.getName()) != -1){
            System.out.println("fail: " + pass.getName() + " ja esta na topic");
            return false;
        }
        if(pass.isPriority()){
            if(insertOnList(prioritySeats, pass)){
                return true;
            }
            else if(insertOnList(normalSeats, pass)){
                return true;
            }
        }
        if(!pass.isPriority()){
            if(insertOnList(normalSeats, pass)){
                return true;
            }
            if(insertOnList(prioritySeats, pass)){
                return true;
            }
        }
        System.out.println("fail: topic lotada");
        return false;
    }

    public boolean remove(String name){
        if(removeFromList(normalSeats, name)){
            return true;
        }
        if(removeFromList(prioritySeats, name)){
            return true;
        }
        System.out.println("fail: " + name + " nao esta na topic");
        return false;
    }

    @Override
    public String toString() {
        return "[" + Stream.concat(
                        this.prioritySeats.stream().map(p -> ("@" + ((p == null)?(""):("" + p)))),
                        this.normalSeats.stream().map(p -> ("=" + ((p == null)?(""):("" + p)))))
                .collect(Collectors.joining(" ")) + "]";
    }
}
