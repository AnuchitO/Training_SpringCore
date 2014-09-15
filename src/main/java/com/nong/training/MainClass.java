package com.nong.training;

import com.nong.training.model.ConstructorMessage;
import com.nong.training.model.ConstructorMessageRenderer;
import com.nong.training.model.DefaultMessage;
import com.nong.training.model.ListMessage;
import com.nong.training.model.MapMessage;
import com.nong.training.model.PropertiesMessage;
import com.nong.training.model.SetMessage;
import com.nong.training.model.SetterMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
public class MainClass {
	private static Logger logger = Logger.getLogger(MainClass.class);
	public static void main(String[] args) {
/**Lab 1*/
		DefaultMessage defaultMessage = new DefaultMessage();
		logger.info("Messang is "+defaultMessage.getMessage());
		
/**Lab2*/				
		XmlBeanFactory factory =  new XmlBeanFactory(new FileSystemResource("src/main/resources/message-context.xml"));
		DefaultMessage message = (DefaultMessage)factory.getBean("defaultMessage");
		logger.info("DefaultMessage = "+message);
		
		ConstructorMessage constructorMessage = (ConstructorMessage)factory.getBean("constructorMessage");
		logger.info("Constructor Message = "+constructorMessage);
		
		SetterMessage setterMessage = (SetterMessage)factory.getBean("setterMessage");
		logger.info("Setter Message = "+setterMessage);

		
		ConstructorMessageRenderer  constructorMessageRenderer =  (ConstructorMessageRenderer) factory.getBean("constructorMessageRenderer");
		logger.info("ConstructorMessageRenderer Message = "+constructorMessageRenderer.getMessage());
		 
/*Lab3 */
		//XmlBeanFactory factory declare once but rewrite for remember
		XmlBeanFactory factoryList = new XmlBeanFactory(new FileSystemResource("src/main/resources/message-context.xml"));
		ListMessage listMessage = (ListMessage)factoryList.getBean("listMessage");
		logger.info("List Message = "+listMessage.getMessage());
			
		XmlBeanFactory factorySet = new XmlBeanFactory(new FileSystemResource("src/main/resources/message-context.xml"));	 
		SetMessage setMessage = (SetMessage)factorySet.getBean("setMessage");
		logger.info("Set Message = "+setMessage.getMessage());
		
		
		XmlBeanFactory factoryMap = new XmlBeanFactory(new FileSystemResource("src/main/resources/message-context.xml"));
		MapMessage mapMessage = (MapMessage)factoryMap.getBean("mapMessage");
		logger.info("Map Message = "+mapMessage.getMessage());
		
		XmlBeanFactory factoryProperties = new XmlBeanFactory(new FileSystemResource("src/main/resources/message-context.xml"));
		PropertiesMessage propertiesMessage = (PropertiesMessage)factoryProperties.getBean("propertiesMessage");
		logger.info("Properties Message =  "+propertiesMessage.getMessage());

	}
}
