package github.word.github.word.api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pais")
public class ControllerPais {
	
	@GetMapping(path="/status")
	public String IsOnline() {
		return "APIOnline";
	}
	

}
