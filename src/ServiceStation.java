import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transportQueue = new LinkedList<>();

    public void addTransport(Transport transport) {
        if (transport != null && !(transport instanceof Bus)){
            transportQueue.offer(transport);
        }
    }

    public void runDiagnostic() {
        Transport transport = (Transport) transportQueue.poll();
        if (transport != null) {
            System.out.println("Проводим техосмотр " + transport.getBrand() + " " + transport.getModel());
            runDiagnostic();
        }
    }

}
