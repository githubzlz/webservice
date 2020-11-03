package example;

import com.test.client.HelloWorldServiceLocator;
import com.test.client.HelloWorld_PortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * @author zhaokejin
 * @description
 * @date 2020/6/10
 */
public class HelloWorldClient {

    public static void main(String[] args) throws ServiceException, RemoteException {
        HelloWorldServiceLocator helloWorldServiceLocator = new HelloWorldServiceLocator();
        HelloWorld_PortType service = helloWorldServiceLocator.getHelloWorld();
        System.out.println(service.sayHelloWorldFrom("test"));
    }
}
