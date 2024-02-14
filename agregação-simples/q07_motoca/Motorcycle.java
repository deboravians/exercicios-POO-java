class Motorcycle {
    private Person person; //agregacao
    private int power;
    private int time;
    
    public Motorcycle(int power){
        this.power = power;
        this.time = 0;
        this.person = null;
    }
    
    public boolean enter(Person person) {
        if(this.person == null){
            this.person = person;
            return true;
        }
        System.out.println("fail: busy motorcycle");
        return false;
    }
    public Person leave() {
        if(this.person == null){
            System.out.println("fail: empty motorcycle");
            return null;
        }
        var temp = this.person;
        this.person = null;
        return temp;
    }
    public void drive(int time){
        if(this.time == 0){
            System.out.println("fail: buy time first");
            return;
        }
        if(this.person == null){
            System.out.println("fail: empty motorcycle");
            return;
        }
        if(this.person.getAge() > 10){
            System.out.println("fail: too old to drive");
            return;
        }
        if(this.time < time){
            System.out.println("fail: time finished after " + this.time + " minutes");
            this.time = 0;
            return;
        }
        this.time -= time;
    }
    public void buyTime(int time){
        this.time += time;
    }
    public void buzinar(){
        String saida = "P";
        for(int i = 0; i < this.power; i++){
            saida += "e";
        }
        System.out.println(saida += "m");
    }
    public int getPower() {
        return power;
    }
    public int getTime() {
        return time;
    }
    public Person getPerson() {
        return person;
    }
    public String toString(){
        if(this.person == null){
            return "power:" + this.power + ", time:" + this.time 
            + ", person:(empty)";
        } else{
            return "power:" + this.power + ", time:" + this.time
            + ", person:(" + this.person + ")";
        }
    }
}
