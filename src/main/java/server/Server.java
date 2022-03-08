package server;

import service.WakeUpServiceImpl;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        WakeUpServiceImpl service=new WakeUpServiceImpl();
        String address="http://localhost:49565/wakeupservice";
        Endpoint.publish(address,service);
        System.out.println("The server is ready");
        System.out.println("============================");
        try {
            Thread.sleep(5*60*10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The server is closing");
        System.exit(0);
    }
}
