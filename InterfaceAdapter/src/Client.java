public class Client {
    public static void main(String[] args) {
        new Phone().charging(new Adapter() {
            @Override
            public void output220V() {
                System.out.println("220V");
            }
        });
    }
}
