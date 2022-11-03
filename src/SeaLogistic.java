public class SeaLogistic implements Logistics{
    @Override
    public void plan() {
        System.out.println("sea plan");
    }

    @Override
    public Transport createTransport() {
        return new Ship("Titalic1", 80,2.4);
    }
}
