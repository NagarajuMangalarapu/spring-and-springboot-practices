package Service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

public class IntegrationFlowService {
	
	
	//@ServiceActivator(inputChannel = "routerTwoSubFlowsOutput")
	public void getMessage(Message<String> message)
	{
		System.out.println(message);
		
	}

}
