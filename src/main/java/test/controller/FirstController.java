package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RestController
@Controller
public class FirstController {

	@RequestMapping(value = "/hello" , method=RequestMethod.GET)
	public String Thanks(String str){
		
		System.out.println(str);
		
		return "thanks for get comming..." + str ; 
	}
	
	@RequestMapping(value = "/hello" , method=RequestMethod.POST)
	public String ThanksPost(@RequestBody Animal p){
		try{
			System.out.println(p.getName());
			Person pp = new Person();
			pp.setBody("large");
			pp.setHead("1.2");
			pp.setLeg("3.3");
			return "thanks for post comming..." + pp ; 
		}catch(Exception e){
			e.printStackTrace();
		}
		return null ; 
	}
	
	@RequestMapping(value = "/test" , method=RequestMethod.POST)
	public String ThanksPost(@RequestBody String str){
		System.out.println(str);
		Person pp = new Person();
		pp.setBody("large");
		pp.setHead("1.2");
		pp.setLeg("3.3");
		return "thanks!"; 
	}
	
}
