import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <B extends LightCar, C extends FreightCar> {
    private Queue queue = new LinkedList<>();

    public void addTransport(Transport transport) {
        queue.offer(transport);
    }

    public void runDiagnostic() {
        Transport transport = (Transport) queue.poll();
        if (transport != null) {
            System.out.println("Проводим техосмотр " + transport.getModel() + " " + transport.getModel());
            runDiagnostic();
        }
    }

}
