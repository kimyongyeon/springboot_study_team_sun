package org.zerock.web;

import java.util.HashMap;
import java.util.Map;

//리다이렉트 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//스프링 MVC의 컨트롤러 객체임을 명시하는 애노테이션
@Controller
public class SampleController4 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	//특정 URI에 매칭되는 클래스나 메소드임을 명시하는 애노테이션
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr){
		logger.info("doE called but redirect to /doF...........");
		//임시데이터를 전달
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("param1", "dd");
		map.put("param2", "ee");
		rttr.addFlashAttribute("param1",map);
		//rttr.addFlashAttribute("msg", "This is the Message!! with redirected");
		return "redirect:/doF";
	}
	//특정 URI에 매칭되는 클래스나 메소드임을 명시하는 애노테이션
	@RequestMapping("/doF")
	public String doF(String msg){
		//logger.info("doF called............."+msg);
		return "result";
	}
}
