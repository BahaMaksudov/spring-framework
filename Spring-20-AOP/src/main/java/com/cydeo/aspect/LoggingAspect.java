package com.cydeo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.mapping.Join;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

//    @Pointcut("execution(* com.cydeo.controller.CourseController.*(..)");
//    private void pointcut(){}
//
//    @Before("pintcut()")

//    @Pointcut("execution(* com.cydeo.repository.CourseRepository.findById(*))")
//    private void anyProductRepositoryFindById(){}
//
//    @Before("anyProductRepositoryFindById()")
//    public void beforeCourseRepoOperation(JoinPoint joinPoint){
//        logger.info("Before (findById) : -> Method: {} - Arguments: {} - Target: {}", joinPoint, joinPoint.getArgs(),joinPoint.getTarget());
//    }


    //within
//    @Pointcut("within(com.cydeo.controller..*)")
//    private void anyControllerOperation() {}
//
//    @Pointcut("@within(org.springframework.stereotype.Service)")
//    private void anyServiceOperation(){
//
//    }
//
//    @Before("anyControllerOperation() || anyServiceOperation()")
//    public void beforeControllerAdvice(JoinPoint joinPoint){
//        logger.info("Before () -> Method: {} - Arguments: {} - Target: {}", joinPoint, joinPoint.getArgs(), joinPoint.getTarget());
//    }

//    @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
//    private void anyDeleteCourseOperation(){}
//
//    @Before("anyDeleteCourseOperation()")
//    public void beforeControllerAdvice(JoinPoint joinPoint){
//        logger.info("Before () -> Method: {} - Arguments: {} - Target: {}", joinPoint, joinPoint.getArgs(), joinPoint.getTarget());
//    }

    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    private void anyDeleteCourseOperation(){}

    @AfterReturning(pointcut = "anyDeleteCourseOperation()", returning = "result")
    public void afterReturningController(JoinPoint joinPoint, Object result){
        logger.info("After returning -> Method: {} - result: {}", joinPoint.getSignature().toShortString(), result.toString());
    }


}
