package com.example.demo.controller;

import org.minbox.framework.logging.client.global.GlobalLogging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

/**
 * 请求日志示例
 *
 * @author 恒宇少年
 */
@RestController
@RequestMapping(value = "/test")
public class LoggingSampleController {

	@Autowired
	private GlobalLogging logger;

	/**
	 * 验证请求参数以及相应内容
	 *
	 * @param name
	 * @return
	 */
	@GetMapping
	public String hello(@RequestParam("name") String name) {
		logger.info("验证请求");
		try {
			int i = 1 / 0;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		}
		return "你好：" + name;
	}

	/**
	 * 验证主体请求内容以及相应内容
	 *
	 * @param user
	 * @return
	 */
	@PostMapping
	public String bodyHello(@RequestBody User user) {
		return "你好：" + user.getName();
	}

	/**
	 * RequestBody 示例类
	 */
	@Data
	public static class User {
		private String name;
	}
}
