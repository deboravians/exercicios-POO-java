import java.util.Scanner;

class Main {
    public static void main(String[] _args){
        Pencil lapiseira = new Pencil(0.5f);

        while(true){

            var line = scanner.nextLine();
            var args = line.split(" ");
            System.out.println("$" + line);

            if(args[0].equals("end")) {
                break;
            } else if(args[0].equals("init")) { //thickness
                lapiseira = new Pencil(Float.parseFloat(args[1]));
            } else if(args[0].equals("insert")) {//thickness hardness size
                lapiseira.insert(new Lead(Float.parseFloat(args[1]), args[2], (int) Float.parseFloat(args[3])));
            } else if(args[0].equals("remove")) {
                lapiseira.remove();
            } else if(args[0].equals("show")) {
                System.out.println("" + lapiseira);
            } else if (args[0].equals("write")) {
                lapiseira.writePage();
            } else if (args[0].equals("pull")) {
                lapiseira.pull();
            }  else {
                System.out.println("fail: comando invalido");
            }
        }
    }
    static Scanner scanner = new Scanner(System.in);
}