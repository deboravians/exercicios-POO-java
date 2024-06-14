import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        VendingMachine machine = new VendingMachine(0);

        while(true){

            var linha = scanner.nextLine();
            System.out.println("$" + linha);
            var args = linha.split(" ");

            if (args[0].equals("end")) {
                break;
            } else if (args[0].equals("show")) {
                System.out.println(machine);
            } else if (args[0].equals("init")) {
                machine = new VendingMachine( Integer.parseInt(args[1]) );
            } else if (args[0].equals("limpar")) {
                machine.clearSlot( Integer.parseInt(args[1]) );
            } else if (args[0].equals("dinheiro")) {
                machine.insertCash( Integer.parseInt(args[1]) );
            } else if (args[0].equals("comprar")) {
                machine.buyItem( Integer.parseInt(args[1]) );
            } else if (args[0].equals("set")) {
                machine.setSlot(Integer.parseInt(args[1]), new Slot( args[2], Float.parseFloat(args[4]), Integer.parseInt(args[3])));
            } else if (args[0].equals("troco")) {
                machine.withdrawCash();
            } else {
                System.out.println("comando invalido");
            }
        }
    }
    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat decForm = new DecimalFormat("0.00");
}