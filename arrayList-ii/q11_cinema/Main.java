import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Sala sala = new Sala(0);

        while(true){
            var linha = scanner.nextLine();
            System.out.println("$" + linha);
            var comando = linha.split(" ");

            if(comando[0].equals("end")){
                break;
            }
            else if(comando[0].equals("init")){
                sala = new Sala(Integer.parseInt(comando[1]));
            }
            else if(comando[0].equals("show")){
                System.out.println(sala);
            }
            else if(comando[0].equals("reservar")){
                sala.reservar(comando[1], comando[2], Integer.parseInt(comando[3]));
            }
            else if(comando[0].equals("cancelar")){
                sala.cancelar(comando[1]);
            }
            else{
                System.out.println("fail: comando invalido");
            }
        }
    }
    public static Scanner scanner = new Scanner(System.in);
}