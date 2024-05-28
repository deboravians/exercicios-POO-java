import java.util.*;

public class Main {
    public static void main(String[] _args){
        Trampoline trampoline = new Trampoline();

        while(true){
            var line = scanner.nextLine();
            var args = line.split(" ");
            System.out.println("$"+ line);

            if(args[0].equals("end")){
                break;
            }
            else if(args[0].equals("arrive")){
                trampoline.arrive(new Kid(args[1],(int) Double.parseDouble(args[2]))) ;
            }
            else if(args[0].equals("enter")) {
                trampoline.enter();
            }
            else if(args[0].equals("leave")) {
                trampoline.leave();
            }
            else if(args[0].equals("remove")) {//name
                trampoline.remoteKid(args[1]);
            }
            else if(args[0].equals("show")) {
                System.out.println(trampoline);
            }
            else {
                System.out.println("fail: comando invalido");
            }
        }
    }
    private static Scanner scanner = new Scanner(System.in);
}