public abstract class OrganizationComponent {

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    private String des;

    protected void add(OrganizationComponent organizationComponent) {
        // 因为最后的叶子结点是没有add的，所以写一个默认实现，而不用抽象方法。
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        // 因为最后的叶子结点是没有add的，所以写一个默认实现，而不用抽象方法。
        throw new UnsupportedOperationException();
    }

    // 这个是三个子类都要实现的。
    protected abstract void print();
}
