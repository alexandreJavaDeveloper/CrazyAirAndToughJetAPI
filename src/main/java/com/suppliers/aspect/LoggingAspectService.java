package com.suppliers.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspectService.class);

    @Pointcut("execution(* com.suppliers.service.SuppliersService.*(..))")
    public void service()
    {
    }

    @Before("service()")
    public void beforeService(final JoinPoint joinPoint)
    {
        final Object[] args = joinPoint.getArgs();

        LoggingAspectService.LOGGER.info("Request: [");
        for (final Object arg : args)
        {
            LoggingAspectService.LOGGER.info(arg.toString());
        }
        LoggingAspectService.LOGGER.info("]");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @AfterReturning(pointcut = "service()", returning = "result")
    public void afterService(final List result)
    {
        LoggingAspectService.LOGGER.info("Response: [");
        result.stream().forEach(object -> LoggingAspectService.LOGGER.info(object.toString()));
        LoggingAspectService.LOGGER.info("]");
    }

    @AfterThrowing("execution(* com.suppliers.service.SuppliersService.*(..))")
    public void throwingException(final JoinPoint joinPoint)
    {
        LoggingAspectService.LOGGER.error("Join point of exception: " + joinPoint.toString());
    }
}