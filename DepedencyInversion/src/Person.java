public class Person {

    /**
     * 这里体现了依赖倒转，我们让Person类的方法依赖高级抽象接口IReceiver，而不是具体的Email或者WeChat。
     * 这样如果想要新加实现类，直接实现IReceiver接口即可，并且无需修改Receive方法。
     * @param iReceiver
     */
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
        p.receive(new WeChat());
    }
}

class Email implements IReceiver {
    public String getInfo() {
        return "Email received.";
    }
}

class WeChat implements IReceiver {
    public String getInfo() {
        return "WeChat received.";
    }
}


