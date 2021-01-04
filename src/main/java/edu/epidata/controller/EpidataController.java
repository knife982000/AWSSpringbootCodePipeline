package edu.epidata.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EpidataController {

	@GetMapping("hello")
	public String helloService(@PathParam("name")String name) {
		if (name == null) {
			return "Hello world!";
		}
		return "Hello "+ name;
	}
}
