import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        switch (getType()) {
            case "common house":
                HouseDirector houseDirector = new HouseDirector();
                houseDirector.setHouseBuilder(new CommonHouse());
                House commonHouse = houseDirector.build();
                break;
            default:
                break;
        }
    }

    public static String getType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the type:");
        return scanner.nextLine();
    }
}
