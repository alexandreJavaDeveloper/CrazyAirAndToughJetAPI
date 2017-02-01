package com.suppliers.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@SuppressWarnings("unchecked")
	@Around("execution(* com.suppliers.service.SuppliersService.*(..))")
	public void printRequestReponse( final ProceedingJoinPoint joinPoint) throws Throwable {
		final Object[] args = joinPoint.getArgs();
		for (final Object arg: args) {
			LoggingAspect.LOGGER.info("Request: " + arg);
		}

		LoggingAspect.LOGGER.info("Response: [ ");
		final List proceed = (List) joinPoint.proceed();
		proceed.stream().forEach(object -> LoggingAspect.LOGGER.info(object.toString()));
		LoggingAspect.LOGGER.info("].");
	}

	@AfterThrowing("execution(* com.suppliers.service.SuppliersService.*(..))")
	public void throwingException(final JoinPoint joinPoint) {
		LoggingAspect.LOGGER.error("Join point of exception: " + joinPoint.toString());
	}
}