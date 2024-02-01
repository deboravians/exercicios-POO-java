import java.util.*;

public class Main{
    public static void main(String[] args){
        Animal a = new Animal();
        
        while(true){
        var line = scanner.nextLine();
        var arg = line.split(" ");
        System.out.println("$" + line);
        
            if(arg[0].equals("init")){
                a = new Animal(arg[1], arg[2]);
            }
            else if(arg[0].equals("show")){
                System.out.println(a);
            }
            else if(arg[0].equals("grow")){
                a.envelhecer(Integer.parseInt(arg[1]));
            }
            else if(arg[0].equals("noise")){
                System.out.println(a.fazerBarulho());
            }
            else if(arg[0].equals("end")){
                break;
            }
            else{
                System.out.println("Comando inválido");
            }
        }
    }
    public static Scanner scanner = new Scanner(System.in);
}
