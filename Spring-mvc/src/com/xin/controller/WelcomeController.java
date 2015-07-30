package com.xin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.xin.domain.User;

@Controller
public class WelcomeController{

	//锟斤拷锟斤拷锟斤拷锟芥方锟斤拷锟斤拷址锟斤拷http://localhost:8080/Spring-mvc/login/wuxin
	@RequestMapping(value = "/login/{user}", method = RequestMethod.GET)
	public ModelAndView myMethod(HttpServletRequest request,HttpServletResponse response, 
			@PathVariable("user") String user, ModelMap modelMap) throws Exception {
		modelMap.put("message", user);
		return new ModelAndView("/hello", modelMap);
	}
	
	//锟斤拷锟斤拷锟斤拷锟芥方锟斤拷锟斤拷址锟斤拷http://localhost:8080/Spring-mvc/hello
	@RequestMapping(value="/hello1",method=RequestMethod.GET)
	public String test1(){
		return "index";
	}
	
	//锟斤拷锟斤拷锟角伙拷取锟斤拷锟斤拷锟斤拷锟�
	/**
	 * 通锟斤拷@PathVariabl注锟斤拷锟饺÷凤拷锟斤拷写锟斤拷莶锟斤拷锟�
	 * 通锟斤拷ModelMap锟斤拷页锟芥传值
	 * 锟斤拷锟斤拷锟斤拷锟芥方锟斤拷锟斤拷址锟斤拷http://localhost:8080/Spring-mvc/hello.do/1/xin
	 * @param id
	 * @param userName
	 * @return
	 */
	@RequestMapping(value="/hello2.do/{id}/{userName}")
	public String test2(@PathVariable int id,@PathVariable String userName){
		System.out.println("id="+id+",userName="+userName);
		return "hello";
	}
	
	/**
	 * 直锟斤拷锟斤拷HttpServletRequest锟斤拷取
	 * 锟斤拷锟斤拷锟斤拷锟芥方锟斤拷锟斤拷址锟斤拷http://localhost:8080/Spring-mvc/hello3.do?id=2&userName=xin
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/hello3.do")
	public String test3(HttpServletRequest request,HttpServletResponse response){
		int id=Integer.parseInt(request.getParameter("id"));
		String userName=request.getParameter("userName");
		System.out.println("id="+id+",userName="+userName);
		return "hello";
	}
	
	/**
	 * 锟斤拷注锟斤拷@RequestParam锟斤拷锟斤拷锟斤拷锟斤拷锟絠d,userName锟斤拷锟斤拷锟斤拷id,userName
	 * 锟斤拷锟斤拷锟斤拷锟斤拷锟絬serName锟斤拷锟斤拷锟斤拷时锟斤拷锟斤拷锟届常锟斤拷锟斤拷,锟斤拷锟斤拷通锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷required=false锟斤拷锟�
	 * 锟斤拷锟斤拷: @RequestParam(value="userName",required=false)锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟轿猽serName
	 * 		String userName:锟斤拷锟秸诧拷锟斤拷锟斤拷锟斤拷为userName
	 * 锟斤拷锟斤拷锟斤拷锟芥方锟斤拷锟斤拷址锟斤拷http://localhost:8080/Spring-mvc/hello4.do?id=2&userName=xin
	 * @param id
	 * @param userName
	 * @return
	 */
	@RequestMapping(value="/hello4.do")
	public String test4(@RequestParam("id")int id,@RequestParam(value="userName",required=false)String userName){
		System.out.println("id="+id+",userName="+userName);
		return "hello";
	}
	
	/**
	 * 锟斤拷锟铰凤拷式锟斤拷使锟斤拷锟节�锟结交
	 * 锟皆讹拷注锟斤拷Bean锟斤拷锟斤拷(锟斤拷@ModelAttribute注锟斤拷锟饺OST锟斤拷锟斤拷锟紽ORM锟�锟斤拷锟�
	 * 锟斤拷锟斤拷锟斤拷锟芥方锟斤拷锟斤拷址锟斤拷http://localhost:8080/Spring-mvc/hello5.do?id=2&userName=xin
	 * 锟斤拷锟斤拷锟皆凤拷锟街ｏ拷锟斤拷锟斤拷锟斤拷没锟斤拷@ModelAttribute("user")也锟杰癸拷锟斤拷锟斤拷锟皆讹拷注锟斤拷
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/hello5.do")
	public String test5(@ModelAttribute("user")User user){
		System.out.println("id="+user.getUserID()+",userName="+user.getUserName());
		return "hello";
	}
	
	//锟斤拷锟斤拷锟斤拷锟斤拷页锟芥传锟捷诧拷锟斤拷
	/**
	 * ModelAndView锟斤拷莼锟斤拷锟斤拷锟紿ttpServletRequest锟斤拷Attribute锟斤拷值锟斤拷hello.jsp锟斤拷
	 * 锟斤拷锟斤拷锟斤拷锟芥方锟斤拷锟斤拷址锟斤拷http://localhost:8080/Spring-mvc/hello6.do
	 */
    @RequestMapping(value="/hello6.do")
	public ModelAndView test6(){
		Map<String,Object> data=new HashMap<String,Object>();
		data.put("message", "test6-->xin");
		return new ModelAndView("/hello", data);
	}
    
    /**
     * 使锟斤拷ModelMap锟斤拷为锟斤拷锟斤拷锟斤拷锟绞撅拷锟�
	   ModelMap锟斤拷莼锟斤拷锟斤拷锟紿ttpServletRequest锟斤拷Attribute锟斤拷值锟斤拷hello.jsp锟斤拷
	        锟斤拷锟斤拷锟斤拷锟芥方锟斤拷锟斤拷址锟斤拷http://localhost:8080/Spring-mvc/hello7.do
     * @return
     */
    @RequestMapping(value="/hello7.do")
    public String test7(ModelMap map){
    	//锟斤拷锟斤拷锟斤拷锟街凤拷式锟斤拷锟斤拷锟斤拷
    	//map.addAttribute("message", "test7-->xin");
    	map.put("message", "test7-->xin");
    	return "hello";
    }
    
    /**
     * 使锟斤拷@ModelAttribute示锟斤拷
	         锟斤拷Controller锟斤拷锟斤拷锟侥诧拷锟斤拷只锟紹ean锟斤拷锟皆凤拷锟斤拷锟斤拷使锟斤拷
	   @ModelAttribute锟斤拷莼锟斤拷锟斤拷锟紿ttpServletRequest锟斤拷Attribute锟斤拷值锟斤拷success.jsp锟斤拷
	       锟斤拷锟斤拷锟斤拷锟芥方锟斤拷锟斤拷址锟斤拷http://localhost:8080/Spring-mvc/hello8.do
     * @param user
     * @return
     */
    @RequestMapping(value="/hello8.do")
    public String test8(@ModelAttribute("user")User user){
    	user.setUserName("test8-->xin");
    	return "hello";
    }
    
    /**
     * Session锟芥储锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷HttpServletReequest锟斤拷getSession()锟斤拷锟斤拷
     * 锟斤拷锟斤拷锟斤拷锟芥方锟斤拷锟斤拷址锟斤拷http://localhost:8080/Spring-mvc/hello9.do
     * @return
     */
    @RequestMapping(value="/hello9.do")
    public String test9(HttpServletRequest request){
    	String userName=request.getParameter("userName");
    	request.setAttribute("message", userName);
    	//request.getSession().setAttribute("message", "test9-->xin");
    	return "hello";
    }
    
    //锟斤拷锟斤拷锟截讹拷锟斤拷
    //Spring MVC 默锟较诧拷锟矫碉拷锟斤拷转锟斤拷锟斤拷锟斤拷位锟斤拷图锟斤拷锟斤拷锟揭癸拷锟斤拷囟锟斤拷颍锟斤拷锟斤拷锟斤拷虏锟斤拷锟�1锟斤拷使锟斤拷RedirectView  2锟斤拷使锟斤拷redirect:前缀
    @RequestMapping(value="/hello10.do")
	public ModelAndView test10(){
		RedirectView view=new RedirectView("hello9.do");
		return new ModelAndView(view);
	}
	
	//锟斤拷锟斤拷锟叫筹拷锟矫的凤拷锟斤拷
    @RequestMapping(value="/hello11.do")
	public String test11(){
		return "redirect:hello9.do";  
	}
}
