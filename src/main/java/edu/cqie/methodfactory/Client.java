package edu.cqie.methodfactory;

import edu.cqie.methodfactory.factory.MobileFactory;
import edu.cqie.methodfactory.product.Mobile;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        InputStream in = Client.class.getResourceAsStream("factory.properties");
        Properties properties = new Properties();
        properties.load(in);
        in.close();
        //通过反射创建对象
        MobileFactory mf = (MobileFactory) Class.forName(properties.getProperty("factory")).getConstructor().newInstance();;
        //工厂生产产品
        Mobile mobile = mf.createMobile();
        mobile.show();
    }
}
