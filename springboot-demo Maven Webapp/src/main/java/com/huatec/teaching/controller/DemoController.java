package com.huatec.teaching.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot demo 项目 controller类
 * @author 贾波
 */

//配置拦截前缀
@RequestMapping("/springboot-demo")
@Controller
public class DemoController {

	/**
	 * 第一个springboot请求
	 * 请求地址http://localhost:8080/springboot-demo/helloWorld
	 * @return
	 */
	@ResponseBody //返回json字符串
	@RequestMapping("/helloWorld")
	public String helloWord()
	{
		return "Hello world!";
	}
	
	/**
	 * 代参数的rest请求  method=RequestMethod.GET  此片表明只能接收get请求
	 * 请求地址http://localhost:8080/springboot-demo/rest/Wade
	 * @param name  参数名
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/rest/{name}",method=RequestMethod.GET)
	public String sayHello(@PathVariable("name") String name) {
		return "Hello " + name;
	}
	
	/**
	 * 跳转到post请求页面
	 * @return
	 */
	@RequestMapping("/toPostPage")
	public String toPostPage()
	{
		return "demoPost";
	}
	/**
	 * 代参数的请求  method=RequestMethod.POST  此片表明只能接收post请求
	 * 请先打开http://localhost:8080/springboot-demo/toPostPage
	 * @param name  参数名
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/demoPost",method=RequestMethod.POST)
	public String sayHelloForPost(@RequestParam String name) {
		return "Hello " + name;
	}
	
}
