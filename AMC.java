
class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class AMC {
    public static void main(String[] args) {
        MyEmployee aarsh = new MyEmployee();
        // aarsh.id =23;
        // aarsh.name="Aarsh"; Throws Error due to private access modifier
        aarsh.setName("AARSH SEVAK");
        System.out.println(aarsh.getName());
        aarsh.setId(122);
        System.out.println(aarsh.getId());
    }
}
