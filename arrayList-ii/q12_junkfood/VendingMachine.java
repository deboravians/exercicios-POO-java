import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Slot> slots;
    private float profit;
    private float cash;
    private int capacity;

    public VendingMachine(int capacity){
        this.slots = new ArrayList<>();
        for(int i = 0; i < capacity; i++){
            this.slots.add(new Slot("empty", 0, 0));
        }
        this.profit = 0;
        this.cash = 0;
    }

    private boolean indiceInvalido(int ind) {
        if((ind < 0) || (ind >= this.slots.size())){
            System.out.println("fail: indice nao existe");
            return true;
        }
        return false;
    }

    public Slot getSlot(int index) {
        if(this.indiceInvalido(index)){
            return null;
        }
        return this.slots.get(index);
    }

    public void setSlot(int index, Slot slot){
        if(this.indiceInvalido(index)){
            return;
        }
        this.slots.set(index, slot);
    }

    public void clearSlot(int index){
        if(this.indiceInvalido(index)){
            return;
        }
        this.slots.set(index, new Slot("empty", 0, 0));
    }

    public void insertCash(float cash){
        this.cash += cash;
    }

    public float withdrawCash(){
        System.out.println("voce recebeu " + Main.decForm.format(this.cash) + " RS");

        float cash = this.cash;
        this.cash = 0;
        return cash;
    }

    public float getProfit(){
        return this.profit;
    }

    public void buyItem(int index){
        if(this.indiceInvalido(index)){
            return;
        }

        Slot item = this.slots.get(index);

        if(this.cash < item.getPrice()){
            System.out.println("fail: saldo insuficiente");
            return;
        }

        if(item.getQuantity() == 0){
            System.out.println("fail: espiral sem produtos");
            return;
        }

        item.setQuantity(item.getQuantity() - 1);
        this.cash -= item.getPrice();
        this.profit += item.getPrice();

        System.out.println("voce comprou um " + item.getName());
    }

    public String toString(){
        String s = "saldo: " + Main.decForm.format(this.cash) + "\n";
        for(int i = 0; i < this.slots.size(); i++){
            Slot slot = this.getSlot(i);
            s += i + " [" + slot + "]\n";
        }
        return s;
    }
}
