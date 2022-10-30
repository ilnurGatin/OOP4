import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <B extends LightCar, C extends FreightCar> {
    private Queue<Transport> transportQueue = new LinkedList<>();

    public void addTransport(Transport transport) {
        if (transport != null && !(transport instanceof Bus)){
            transportQueue.offer(transport);
        }
    }

    public void runDiagnostic() {
        Transport transport = (Transport) transportQueue.poll();
        if (transport != null) {
            System.out.println("Проводим техосмотр " + transport.getModel() + " " + transport.getModel());
            runDiagnostic();
        }
    }

}
