package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// ctrl + shift + o : import 정리
@RestController
public class BoardController {
	@RequestMapping("/hello")
	public String hello(int num) {
		String gugudan="";
		for(int i=1;i<10;i++)
			gugudan+=num+"*"+i+"="+(num*i)+" ";
		return gugudan;
	}
	@RequestMapping("/inha")
	public String inha(String param) {
		return param + "inha.ac.kr";
	}
	@RequestMapping("/name")
	public String name(String id) {
		return "당신의 학번은 "+ id +"입니다.";
	}
}
