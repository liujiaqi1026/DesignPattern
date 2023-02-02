public abstract class Pizza {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void cut() {
        System.out.println("cutting...");
    }

    public void box() {
        System.out.println("boxing...");
    }
}
