class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(){
        id=45;
        name="Deval";
    }
    public MyMainEmployee(String myName,int myId){
        id=myId;
        name=myName;
    }

    public String getName() {
        return name;
    }

    public void setname(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

}

public class Constructors {
    public static void main(String[] args) {
        // MyMainEmployee aarsh = new MyMainEmployee();
        MyMainEmployee aarsh = new MyMainEmployee("DevalSinh Zala",22);
        // aarsh.setname("AMS");
        // aarsh.setId(1245);
        // aarsh.getName();
        // aarsh.getId();
        System.out.println(aarsh.getName());
        System.out.println(aarsh.getId());
    }
}
