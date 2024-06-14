public class Pass {
    private int age;
    private String name;

    public Pass(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPriority(){
        return age >= 65;
    }

    @Override
    public String toString() {
        return getName() + ":" + getAge();
    }
}
