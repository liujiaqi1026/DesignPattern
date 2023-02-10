import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "13213123");

        OrganizationComponent computerCollege = new College("计算机学院", "111");
        OrganizationComponent infoCollege = new College("信息学院", "222");
        university.add(computerCollege);
        university.add(infoCollege);

        computerCollege.add(new Department("软件工程", "123123"));
        computerCollege.add(new Department("网络工程", "3213123"));

        infoCollege.add(new Department("信息工程", "123123"));

        university.print();
    }
}
