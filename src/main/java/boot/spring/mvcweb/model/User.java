/**
 * @author ashish.adhikari
 */
package boot.spring.mvcweb.model;

import lombok.Data;

/**
 * @author ashish.adhikari
 *
 */
@Data
public class User implements IUser{
	private String userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer age;
}
