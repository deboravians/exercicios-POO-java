class Carro{
    public int pass; // quantidade de passageiros no carro
    public int passMax; // maximo de passageiros no carro
    public int gas; // gasolina atual do carro
    public int gasMax; // maximo de gasolina que o carro suporta
    public int km; // quilometragem atual do carro
    
    public Carro(){
        this.pass = pass;
        this.passMax = 2;
        this.gas = gas; 
        this.gasMax = 100;
        this.km = km;
    }
    
    public void enter(){
        if(this.pass == this.passMax){
            System.out.println("fail: limite de pessoas atingido");
        }
        else{
            this.pass += 1;
        }
    }
    
    public void leave(){
        if(this.pass != 0){
            this.pass -= 1;
        }
        else{
            System.out.println("fail: nao ha ninguem no carro");
        }
    }
    
    public void drive(int value){
        if(this.pass == 0){
            System.out.println("fail: nao ha ninguem no carro");
        }
        else if(this.gas == 0){
            System.out.println("fail: tanque vazio");
        }
        else if(value > this.gas){
            int gasAux = this.gas;
            this.gas = 0;
            this.km += gasAux;
            System.out.println("fail: tanque vazio apos andar " + gasAux + " km");
        }
        else{
            this.gas -= value;
            this.km += value;
        }
    }
    
    public void fuel(int value){
        if(value > this.gasMax - this.gas){
            this.gas += this.gasMax - this.gas;
        }
        else{
            this.gas += value;
        }
    }
    
    public String toString(){
        return "pass: " + this.pass + ", gas: " + this.gas + ", km: " + this.km;
    }
}
