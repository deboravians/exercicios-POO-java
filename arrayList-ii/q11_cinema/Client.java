public class Client {
    private String fone;
    private String id;

    public Client(String id, String fone){
        this.fone = fone;
        this.id = id;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getId() + ":" + getFone();
    }
}
