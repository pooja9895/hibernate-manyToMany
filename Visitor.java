package ManyToMany_BiDirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Visitor {
	@Id
	int id;
	String name;
	long phone;
	int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@ManyToMany(mappedBy = "visitor")
	List<Museum> museum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<Museum> getMuseum() {
		return museum;
	}

	public void setMuseum(List<Museum> museum) {
		this.museum = museum;
	}

}
