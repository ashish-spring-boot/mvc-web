/**
 * @author ashish.adhikari
 */
package boot.spring.mvcweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ashish.adhikari
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements IUser{
	private String userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer age;
}
