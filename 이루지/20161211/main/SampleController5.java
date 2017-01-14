package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;
//������ MVC�� ��Ʈ�ѷ� ��ü���� ����ϴ� �ֳ����̼�
@Controller
public class SampleController5 {
	//Ư�� URI�� ��Ī�Ǵ� Ŭ������ �޼ҵ����� ����ϴ� �ֳ����̼� 
	@RequestMapping("/doJSON")
	//����Ÿ���� http�� ����޽����� ���� 
	public @ResponseBody ProductVO doJSON(){
		
		ProductVO vo = new ProductVO("���û�ǰ",30000);
		
		return vo;
		
	}
	
}
