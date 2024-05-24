import java.util.*;

public class Main{
    static Mercantil mercantil = new Mercantil(0);
    public static void main(String[] args){

        while(true){
            String line = scanner.nextLine();
            args = line.split(" ");
            System.out.println("$" + line);

            if(args[0].equals("init")){
                mercantil = new Mercantil(Integer.parseInt(args[1]));
            }
            else if(args[0].equals("arrive")){
                mercantil.chegar( new Pessoa(args[1]) );
            }
            else if(args[0].equals("show")){
                System.out.println(mercantil);
            }
            else if(args[0].equals("call")){
                mercantil.chamar(Integer.parseInt(args[1]));
            }
            else if(args[0].equals("finish")){
                mercantil.finalizar(Integer.parseInt(args[1]));
            }
            else if(args[0].equals("end")){
                break;
            }
            else{
                System.out.println("fail: comando invalido");
            }
        }
    }
    static Scanner scanner = new Scanner(System.in);
}