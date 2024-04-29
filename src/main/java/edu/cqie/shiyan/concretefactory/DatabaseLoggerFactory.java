package edu.cqie.shiyan.concretefactory;

import edu.cqie.shiyan.concreteproduct.DatabaseLogger;
import edu.cqie.shiyan.concreteproduct.FileLogger;
import edu.cqie.shiyan.factory.LoggerFactory;
import edu.cqie.shiyan.product.Logger;

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }

}
