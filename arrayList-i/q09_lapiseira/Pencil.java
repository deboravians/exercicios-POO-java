import java.util.LinkedList;

public class Pencil {
    private float thickness; //calibre da lapiseira
    private Lead tip; //grafite que ta na ponta
    private LinkedList<Lead> barrel; //"tambor" da lapiseira

    public Pencil(float thickness){
        this.thickness = thickness;
        this.tip = null;
        this.barrel = new LinkedList<Lead>();
    }

    public boolean insert(Lead lead){
        if(lead.getThickness() != this.thickness){
            System.out.println("fail: calibre incompativel");
            return false;
        }
        barrel.add(lead);
        return true;
    }

    public Lead remove(){
        if(this.tip == null){
            System.out.println("fail: nao existe grafite no bico");
            return null;
        }
        Lead leadAux = this.tip;
        this.tip = null;
        return leadAux;
    }

    public boolean pull(){
        if(this.tip != null){
            System.out.println("fail: ja existe grafite no bico");
            return false;
        }
        this.tip = barrel.remove(0);
        return true;
    }

    public void writePage(){
        if(this.tip == null){
            System.out.println("fail: nao existe grafite no bico");
            return;
        }
        else if(this.tip.getSize() <= 10){
            System.out.println("fail: tamanho insuficiente");
            this.tip = null;
            return;
        }
        else if(this.tip.getSize() - this.tip.usagePerSheet() < 10){
            this.tip.setSize(10);
            System.out.println("fail: folha incompleta");
            return;
        }
        this.tip.setSize(this.tip.getSize() - this.tip.usagePerSheet());
    }

    @Override
    public String toString() {
        String saida = "calibre: " + this.thickness + ", ";
        saida += "bico: " + "[";
        if(this.tip != null){
            saida += this.tip;
        }
        saida += "], ";
        saida += "tambor: {";
        for (Lead lead : barrel) {
            saida += "[" + lead + "]";
        }
        saida += "}";
        return saida;
    }
}
