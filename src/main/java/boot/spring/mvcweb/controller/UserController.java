/**
 * @author ashish.adhikari
 */
package boot.spring.mvcweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import boot.spring.mvcweb.model.User;
import boot.spring.mvcweb.repository.UserRepository;

/**
 * @author ashish.adhikari
 *
 */
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user")
	public String getUserById(@RequestParam(name="id", required=true) String userId) throws Exception {
		return  new ObjectMapper().writeValueAsString(userRepository.findByUserId(userId));
	}
	
	@PostMapping(value = "/add")
	public String saveUser(@RequestBody User user) {
		String response = "Add user ";
		try {
			userRepository.save(user);
			response += " successful with user id : "+user.getUserId();
		}catch(Exception e) {
			response += " failed! \n"+e.getMessage();
		}
		
		return response;
	}
}
