public class Department extends OrganizationComponent{
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println("系是:" + this.getName());
    }
}
