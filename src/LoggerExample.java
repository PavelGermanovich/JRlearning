import sun.rmi.runtime.Log;

import java.io.IOException;
import java.util.logging.*;

//Требуется выставить такие настройки, чтобы:

//        Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
//        Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
//        Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java", независимо от серьезности сообщения
//        печатались в консоль в формате XML (*) и не передавались вышестоящим обработчикам на уровнях "org.stepic", "org" и "".


public class LoggerExample  {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(LoggerExample.class.getName());
        System.out.println(logger.getName());

         logger.setLevel(Level.ALL);

        Handler jhandler = new FileHandler("log.xml", false);
        jhandler.setLevel(Level.ALL);
        jhandler.setFormatter(new XMLFormatter());
        logger.addHandler(jhandler);


        logger.warning("message");
    }

    private static void configureLogging() {
        // your implementation here
        Logger logA = Logger.getLogger("org.stepic.java.logging.ClassA");
        Logger logB = Logger.getLogger("org.stepic.java.logging.ClassB");
        logA.setLevel(Level.ALL);
        logB.setLevel(Level.WARNING);
        Handler jH = new ConsoleHandler();
        jH.setLevel(Level.ALL);

        Logger logParent = Logger.getLogger("org.stepic.java");
        logParent.setLevel(Level.ALL);
        logParent.setUseParentHandlers(false);

        jH.setFormatter(new XMLFormatter());
        logParent.addHandler(jH);
    }







}
