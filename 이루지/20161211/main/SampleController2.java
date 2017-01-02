package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//������ MVC�� ��Ʈ�ѷ� ��ü���� ����ϴ� �ֳ����̼�
@Controller
public class SampleController2 {

		private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
		//Ư�� URI�� ��Ī�Ǵ� Ŭ������ �޼ҵ����� ����ϴ� �ֳ����̼�
		@RequestMapping("doC")
		//�ڵ����� �ش� ��ü�� ����� �����ϵ��� ����� �ֳ����̼� 
		//��û�� msg�̸��� �Ķ���͸� ���ڿ��� ó�����ְ� �信 ���޵ǵ��� 
		public String doC(@ModelAttribute("msg") String msg){
			
			logger.info("doC called....................");
			
			return "result";
		}
}
