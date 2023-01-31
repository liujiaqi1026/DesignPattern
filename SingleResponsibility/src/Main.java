public class Main {
    public static void main(String[] args) {
        Vehicle motor = new RoadVehicle();
        Vehicle plane = new AirVehicle();
        motor.run("motor");
        plane.run("plane");
    }
}
