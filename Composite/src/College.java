import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    public College(String name, String des) {
        super(name, des);
    }

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    @Override
    protected void print() {
        System.out.println("学院是：" + this.getName());
        for(OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
}
