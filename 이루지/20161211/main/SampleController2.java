package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//스프링 MVC의 컨트롤러 객체임을 명시하는 애노테이션
@Controller
public class SampleController2 {

		private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
		//특정 URI에 매칭되는 클래스나 메소드임을 명시하는 애노테이션
		@RequestMapping("doC")
		//자동으로 해당 객체를 뷰까지 전달하도록 만드는 애노테이션 
		//요청시 msg이름의 파라미터를 문자열로 처리해주고 뷰에 전달되도록 
		public String doC(@ModelAttribute("msg") String msg){
			
			logger.info("doC called....................");
			
			return "result";
		}
}
