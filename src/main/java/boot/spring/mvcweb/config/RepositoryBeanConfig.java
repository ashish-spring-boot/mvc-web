/**
 * @author ashish.adhikari
 */
package boot.spring.mvcweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import boot.spring.mvcweb.repository.UserRepository;

/**
 * @author ashish.adhikari
 *
 */
@Configuration
public class RepositoryBeanConfig {

	@Bean(initMethod="saveAll")
	UserRepository userRepository() {
		return new UserRepository();
	}
}
