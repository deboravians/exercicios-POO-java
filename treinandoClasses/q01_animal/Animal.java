public class Animal{
    public String especie;
    public String barulho;
    public int idade;
    public boolean alive;
    
    public Animal(){
    }
    
    public Animal(String especie, String barulho){
        this.especie = especie;
        this.barulho = barulho;
        this.idade = 0;
        this.alive = true;
    }
    
    public String fazerBarulho(){
        if(this.idade == 0){
            return "---";
        }
        if(!this.alive){
            return "RIP";
        }
        return this.barulho;
    }
    
    public void envelhecer(int valor){
        if(this.idade + valor >= 4){
            this.alive = false;
            this.idade = 4;
            System.out.println("warning: " + this.especie + " morreu");
            return;
        }
        this.idade += valor;
    }
    
    public String toString(){
        return this.especie + ":" + this.idade + ":" + this.barulho;
    }
}
