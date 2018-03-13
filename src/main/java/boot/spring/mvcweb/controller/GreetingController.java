/**
 * @author ashish.adhikari
 */
package boot.spring.mvcweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ashish.adhikari
 *
 */
@Controller
public class GreetingController {
	
	@GetMapping("/greeting")
	public String getGreeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
	}
	
}
