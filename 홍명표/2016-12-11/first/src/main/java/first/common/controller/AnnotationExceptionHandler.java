package first.common.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class AnnotationExceptionHandler {
	@ExceptionHandler(Exception.class)
    public void handleException(Exception e) {
        System.out.println("exception");
    }
     
    @ExceptionHandler(RuntimeException.class) 
    public ModelAndView handleRuntimeException(RuntimeException e) {
    	System.out.println("runtime error");
        ModelAndView mv = new ModelAndView("/error/exceptionHandler");
        mv.addObject("data", e.getMessage());
         
        return mv;
    }
}
