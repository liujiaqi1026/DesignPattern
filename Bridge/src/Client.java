public class Client {
    public static void main(String[] args) {
        Phone foldedPhone = new FoldedPhone(new Huawei());
        Phone touchedPhone = new TouchedPhone(new Apple());

        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        touchedPhone.open();
        touchedPhone.call();
        touchedPhone.close();
    }
}
