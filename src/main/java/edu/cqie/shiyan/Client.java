package edu.cqie.shiyan;

import edu.cqie.methodfactory.factory.MobileFactory;
import edu.cqie.methodfactory.product.Mobile;
import edu.cqie.shiyan.factory.LoggerFactory;
import edu.cqie.shiyan.product.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        InputStream in = edu.cqie.methodfactory.Client.class.getResourceAsStream("factory.properties");
        Properties properties = new Properties();
        properties.load(in);
        in.close();
        //通过反射创建对象
        LoggerFactory mf = (LoggerFactory) Class.forName(properties.getProperty("factory")).getConstructor().newInstance();;
        //工厂生产产品
        Logger logger = mf.createLogger();
        logger.writeLog();
    }
}
