package Service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway
public interface IntegrationGateway {
	
	@Gateway(requestChannel = "Integration.flow.message")
   public String getMessage(Message<String> message);
}
