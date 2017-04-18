package org.framestudy.spring_hibernate;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.relationmag.beans.Husband;
import org.framestudy.spring_hibernate.relationmag.beans.Wife;
import org.framestudy.spring_hibernate.relationmag.service.IHusbandService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestHusbandService {

	@Resource
	private IHusbandService husbandServiceImpl;
	
	@Test
	public void deleteHusband(){
		Husband hus = husbandServiceImpl.getHusbandById(1l);
		husbandServiceImpl.deleteHusband(hus);
	}
	
	@Ignore
	public void testGetHusbandByWifeName(){
		
		Husband hus = husbandServiceImpl.getHusbandByWifeName("小马");
		System.out.println(hus);
		
	}
	
	@Ignore
	public void testGetHusbandById(){
		Husband hus = husbandServiceImpl.getHusbandById(1l);
		System.out.println(hus.getName());
		
	}
	
	
	@Ignore
	public void testSaveHusband(){
		Husband hus = new Husband(null, "宝宝2", null);
		
		//如果想要双向保存的时候，并且还要将关系拉起来，那就需要双向的调用set()
//		Wife wife = new Wife(null, "小马", null);
//		hus.setWife(wife);
//		wife.setHus(hus);
		
		husbandServiceImpl.saveHusband(hus);
	}
	
	
	
	
}
