
package org.zerock.web;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/*
 * Runwith 스프링의 테스트 컨텍스트 프레임워크 JUnit 확장기능 지정
 *  각각의 테스트 별로 오브젝트가 생성되더라도 싱글톤의 applicationcontext를 보장
 *  
 *  ContextConfiguration
 *  spring bean 메타 설정파일의 위치 지정시 사용
 *  default : 테스트 클래스 파일이 있는 패키지 내에서 다음의 설정파일을 사용 
 *  
 *  webappconfiguration
 *  webapplicationcontext를 생성할수있도록 함 
 *  
 *  
 *  http://www.slideshare.net/sbcoba/spring-test-mvc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SampleControllerTest {

	private static final Logger logger
	= LoggerFactory.getLogger(SampleControllerTest.class);
	
	@Inject
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		//test를 위한 spring mvc엔진을 탑제한 mockmvc객체를생성
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		logger.info("set up.........");
	}
	@Test
	public void testDoA() throws Exception{
		//http method설정  , 호출URI기술 
		mockMvc.perform(MockMvcRequestBuilders.get("/doA"));
	}
	
}
