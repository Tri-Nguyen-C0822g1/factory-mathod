public class Main {
    public static void main(String[] args) {
        Logistics logistics1 = new RoadLogistic();
        logistics1.plan();
        Transport transport1 = logistics1.createTransport();
        System.out.println(transport1);

        Logistics logistics2 = new SeaLogistic();
        logistics2.plan();
        Transport transport2 = logistics2.createTransport();
        System.out.println(transport2);

    }
}