package client;

import service.WakeUpService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Provider;

public class Client {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("http://localhost:49565/wakeupservice?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        QName name= new QName("http://service/", "WakeUpMessageService");
        //Create service
        Service service = Service.create(url, name);
        System.out.println("SOAP service is now created");
        //use the getPort method to obtain service interface
        WakeUpService wakeUpService=service.getPort(WakeUpService.class);

        System.out.println(wakeUpService.wakeUp("Benjamin"));

    }
}
