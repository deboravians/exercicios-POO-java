public class Lead {
    private float thickness;
    private String hardness;
    private int size;

    public Lead(float thickness, String hardness, int size){
        this.thickness = thickness;
        this.hardness = hardness;
        this.size = size;
    }

    public int usagePerSheet(){
        if(getHardness().equals("HB")){
            return 1;
        }
        else if(getHardness().equals("2B")){
            return 2;
        }
        else if(getHardness().equals("4B")){
            return 4;
        }
        else if(getHardness().equals("6M")){
            return 6;
        }
        return 0;
    }

    public String getHardness(){
        return hardness;
    }

    public int getSize(){
        return size;
    }

    public float getThickness(){
        return thickness;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String toString(){
        return "%s:%s:%d".formatted(getThickness(), getHardness(), getSize());
    }
}
