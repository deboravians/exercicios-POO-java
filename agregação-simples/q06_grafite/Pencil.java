class Pencil {
    private float thickness;
    private Lead tip;

    public Pencil(float thickness) {
        this.thickness = thickness;
        this.tip = null;
    }

    public float getThickness() {
        return this.thickness;
    }

    public void setThickness(float value) {
        return;
    }

    public boolean hasGrafite() {
        if(this.tip == null){
            return false;
        } else{
            System.out.println("fail: ja existe grafite");
            return true;
        }
    }

    public boolean insert(Lead grafite) {
        if(hasGrafite()){
            return false;
        }
        if(grafite.getThickness() != this.thickness){
            System.out.println("fail: calibre incompativel");
            return false;
        }
        this.tip = grafite;
        return true;
    }

    public Lead remove() {
        if(this.tip != null){
            Lead grafite = this.tip;
            this.tip = null;
            return grafite;
        } else{
            System.out.println("fail: nao existe grafite");
            return null;
        }
        
    }

    public void writePage() {
        if(this.tip == null){
            System.out.println("fail: nao existe grafite");
            return;
        }
        else if(this.tip.getSize() <= 10){
            System.out.println("fail: tamanho insuficiente");
            return;
        }
        else if(this.tip.getSize() - 10 < this.tip.usagePerSheet()){
            System.out.println("fail: folha incompleta");
            this.tip.setSize(10);
            return;
        }
        this.tip.setSize(this.tip.getSize() - this.tip.usagePerSheet());
    }
    
    public String toString() {
        String saida = "calibre: " + thickness + ", grafite: ";
        if (tip != null)
            saida += "[" + tip + "]";
        else
            saida += "null";
        return saida;
    }
}
