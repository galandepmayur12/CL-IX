import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Connection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.Message;


public class TopicConsumer implements Runnable {

ActiveMQConnectionFactory connectionFactory = null;

public TopicConsumer(ActiveMQConnectionFactory connectionFactory) {
 this.connectionFactory = connectionFactory;
}

@Override
public void run() {
 try {
  // First create a connection
  Connection connection = 
    connectionFactory.createConnection();
  try {
	connection.start();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

  // Now create a Session
  Session session = ((javax.jms.Connection) connection).createSession(false,
    Session.AUTO_ACKNOWLEDGE);

  // Let's create a topic. If the topic exist, 
  //it will return that
  Destination topicDestination = 
    session.createTopic("isThisShit");

  // Create a MessageProducer from the Session 
  //to the Topic or Queue
  MessageConsumer messageConsumer =
    session.createConsumer(topicDestination);
  
  //Get the message
  Message message = (Message) messageConsumer.receive();

  TextMessage textMessage = (TextMessage)message;

  System.out.println("From pub: " + textMessage.getText());

  // Do the cleanup
  session.close();
  connection.close();
 } catch (JMSException jmse) {
  System.out.println("Exception: " + jmse.getMessage());
 }
}
}
