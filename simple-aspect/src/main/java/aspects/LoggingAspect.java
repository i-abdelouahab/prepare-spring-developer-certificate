package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("A method will execute...");

        Object returnedByMethod = joinPoint.proceed();

        logger.info("\u001B[32m"+"Method executed and returned "+returnedByMethod+""+"\u001B[0m");

        return returnedByMethod;
    }
}
