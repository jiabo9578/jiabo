package com.huatec.teaching.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.huatec.teaching.domain.TUser;
import com.huatec.teaching.service.TClassService;
import com.huatec.teaching.service.TUserService;

/**
 * springboot demo 项目 mybatis controller类
 * @author 贾波
 */

//配置拦截前缀
@RequestMapping("/springboot-mybatis")
@Controller
public class MyBatisController {
	
	//注解注入service
	@Autowired
	private TClassService tClassService;
	@Autowired
	private TUserService tUserService;

	/**
	 * 获取全部用户 并跳转到页面
	 * @return
	 */
	@RequestMapping("/getUserList")
	public String helloWord(Model model)
	{
		//在user表中查询出所有记录放到页面
		List<TUser> userList = tUserService.findTuserList(new TUser());
		model.addAttribute("userList", userList);
		return "userlist";
	}
	
	
	/**
	 * 保存用户
	 * @param name
	 * @param age
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	public String saveUser(@RequestParam String name,@RequestParam int age)
	{
		TUser user = new TUser();
		user.setAge(age);
		user.setName(name);
		tUserService.save(user);
		return "ok";
	}
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/delUser",method=RequestMethod.GET)
	public String delUser(@RequestParam String id)
	{
		tUserService.delete(id);
		return "ok";
	}
	
	/**
	 * 根据ID获取用户  返回JSON
	 * @param id 用户ID
	 * @return
	 */
	@ResponseBody
	@RequestMapping("getUser")
	public String getUser(String id)
	{
		TUser user = tUserService.findById(id);
		JSONObject object = (JSONObject) JSONObject.toJSON(user);
		return object.toJSONString();
	}
	/**
	 * 修改用户
	 * @param name
	 * @param age
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/editUser",method=RequestMethod.POST)
	public String editUser(String name,int age,String id)
	{
		TUser user = new TUser();
		user.setAge(age);
		user.setName(name);
		user.setId(Integer.valueOf(id));
		tUserService.update(user);
		return "ok";
	}
	
	
}
