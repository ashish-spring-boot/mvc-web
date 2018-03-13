/**
 * @author ashish.adhikari
 */
package boot.spring.mvcweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

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
@Entity
public class User implements IUser{
	@Id
	private String userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer age;
}
