public class Calculadora {
    public int batteryMax;
    public int battery;
    public float display;

    public Calculadora(int batteryMax) {
        this.batteryMax = batteryMax;
        this.battery = 0;
        this.display = 0;
    }

    public void chargeBattery(int value) {
        if(value + battery > batteryMax){
            this.battery = this.batteryMax;
        }
        else{
            this.battery += value;
        }
    }

    public boolean useBattery() {
        if(this.battery > 0){
            this.battery -= 1;
            return true;
        }
        else{
            System.out.println("fail: bateria insuficiente");
            return false;
        }
    }

    public void sum(int a, int b) {
        if(useBattery()){
            this.display = a + b;
        }
    }
    
    public void division(int a, int b) {
        if(b == 0){
            System.out.println("fail: divisao por zero");
            useBattery();
            return;
        }
         if(useBattery()){
            this.display = (float) a / b;
        }
    }

    public String toString() {
        return String.format("display = %.2f, battery = %d", this.display, this.battery);
    }
}
