package org.framestudy.spring_hibernate;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.personmag.beans.Person;
import org.framestudy.spring_hibernate.personmag.service.IPersonService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ForwardRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestPersonService {

	@Resource
	private IPersonService personServiceImpl;
	
	@Test
	public void testGetPersonByPersonInfo(){
		
		List<?> list = personServiceImpl.getPersonByPersonInfo("这是");
		Person person = (Person) list.get(0);
		System.out.println(person.getName());
//		System.out.println(person.getAdds());
	}
	
	@Ignore
	public void testGetPersonByAddress(){
		
		List<?> list = personServiceImpl.getPersonByAddress("九");
		System.out.println(list);
		
		
		
	}
	
	@Ignore
	public void testGetPersonById(){
		
		Person person = personServiceImpl.getPersonById(1l);
		System.out.println(person.getName());
	}
	
	
	
	
}
