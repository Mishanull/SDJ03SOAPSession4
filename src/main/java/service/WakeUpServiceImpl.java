package service;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Random;

@WebService(endpointInterface = "service.WakeUpService",
serviceName="WakeUpMessageService")
public class WakeUpServiceImpl implements WakeUpService {

    @Override
    public String wakeUp(String name) {
        return getRandomMessage()+" "+ name;
    }
    public String getRandomMessage(){
        Random rand=new Random();
        String[] messages={"Get tha fuck out ","Hello mf ","Wake up you twat "};
        return messages[rand.nextInt(messages.length)];
    }
}
