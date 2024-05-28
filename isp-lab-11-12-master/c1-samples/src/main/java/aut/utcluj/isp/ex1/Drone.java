
package aut.utcluj.isp.ex1;

public class Drone {

    private String id;
    private boolean state;

    Drone(String dR1, boolean b) {
        this.id = dR1;
        this.state = b;
    }

    Drone(String dR3) {
        this.id = dR3;
    }

    public String getId() {
        return id;
    }

    public boolean isState() {
        return state;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Drone drone = (Drone) object;
        return java.util.Objects.equals(id, drone.id);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
    public static void main(String[] args){
        Drone d1 = new Drone("1234", true);
        Drone d2 = new Drone("1234", false);
        System.out.println(d1.equals(d2));
    }
}
