package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;
//스프링 MVC의 컨트롤러 객체임을 명시하는 애노테이션
@Controller
public class SampleController5 {
	//특정 URI에 매칭되는 클래스나 메소드임을 명시하는 애노테이션 
	@RequestMapping("/doJSON")
	//리턴타입이 http의 응답메시지로 전송 
	public @ResponseBody ProductVO doJSON(){
		
		ProductVO vo = new ProductVO("샘플상품",30000);
		
		return vo;
		
	}
	
}
