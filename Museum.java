package ManyToMany_BiDirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Museum {
	
	@Id
	int id;
	String name;
	String address;
	
	@ManyToMany
	@JoinColumn(name = "visior_id")
	List<Visitor> visitor;
	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Visitor> getVisitor() {
		return visitor;
	}

	public void setVisitor(List<Visitor> visitor) {
		this.visitor = visitor;
	}
	
}
