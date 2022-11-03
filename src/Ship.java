public class Ship implements Transport{
    public String name;
    public int taiTrong;
    public double sucGio;

    public Ship(String name, int taiTrong, double sucGio) {
        this.name = name;
        this.taiTrong = taiTrong;
        this.sucGio = sucGio;
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

    public double getSucGio() {
        return sucGio;
    }

    public void setSucGio(double sucGio) {
        this.sucGio = sucGio;
    }

    @Override
    public void move() {
        System.out.println("sea plan");

    }

    @Override
    public void checkHanhTinh() {
        System.out.println("Ship on the way");

    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", taiTrong=" + taiTrong +
                ", sucGio=" + sucGio +
                '}';
    }
}
