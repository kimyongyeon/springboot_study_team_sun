package org.zerock.web;

import java.util.HashMap;
import java.util.Map;

//�����̷�Ʈ 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//������ MVC�� ��Ʈ�ѷ� ��ü���� ����ϴ� �ֳ����̼�
@Controller
public class SampleController4 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	//Ư�� URI�� ��Ī�Ǵ� Ŭ������ �޼ҵ����� ����ϴ� �ֳ����̼�
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr){
		logger.info("doE called but redirect to /doF...........");
		//�ӽõ����͸� ����
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("param1", "dd");
		map.put("param2", "ee");
		rttr.addFlashAttribute("param1",map);
		//rttr.addFlashAttribute("msg", "This is the Message!! with redirected");
		return "redirect:/doF";
	}
	//Ư�� URI�� ��Ī�Ǵ� Ŭ������ �޼ҵ����� ����ϴ� �ֳ����̼�
	@RequestMapping("/doF")
	public String doF(String msg){
		//logger.info("doF called............."+msg);
		return "result";
	}
}
