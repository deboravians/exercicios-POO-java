import java.util.*;

public class Main{
    public static void main(String args[]){
        Carro carro = new Carro();
        
        while(true){
            var line = scanner.nextLine();
            System.out.println("$" + line);
            var comando = line.split(" ");
            
            if(comando[0].equals("end")){
                break;
            }
            else if(comando[0].equals("show")){
                System.out.println(carro.toString());
            }
            else if(comando[0].equals("leave")){
                carro.leave();
            }
            else if(comando[0].equals("enter")){
                carro.enter();
            }
            else if(comando[0].equals("drive")){
                carro.drive(Integer.parseInt(comando[1]));
            }
            else if(comando[0].equals("fuel")){
                carro.fuel(Integer.parseInt(comando[1]));
            }
        }
        
    }
    private static Scanner scanner = new Scanner(System.in);
}
