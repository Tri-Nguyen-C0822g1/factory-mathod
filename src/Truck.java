public class Truck implements Transport {

    public String name;
    public int taiTrong;

    public Truck(String name, int taiTrong) {
        this.name = name;
        this.taiTrong = taiTrong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public void move() {
        System.out.println("plan road");
    }

    @Override
    public void checkHanhTinh() {
        System.out.println("Truck is moving");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", taiTrong=" + taiTrong +
                '}';
    }
}
