import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{
    public University(String name, String des) {
        super(name, des);
    }

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    @Override
    protected void print() {
        System.out.println("学校是：" + this.getName());
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
