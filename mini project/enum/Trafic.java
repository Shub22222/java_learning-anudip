enum TrafficLight {
    RED("Stop"),
    YELLOW("Ready"),
    GREEN("Go");

    private String detail;

    private TrafficLight(String detail) {
        this.detail = detail;
    }

    public String getdisc() {
        return detail;

    }

}

public class Trafic {
    public static void main(String[] args) {
        TrafficLight obj=TrafficLight.GREEN;
        System.out.println(obj.getdisc());
    }

}
