package mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserDetails {

	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;
	@Column
	private String name;
	@Id
	@Column
	private String email;
	@Column
	private String mno;
	@Column
	private String username;
	@Column
	private String password;
	
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String name, String email, String mno, String username, String password) {
		super();
		this.name = name;
		this.email = email;
		this.mno = mno;
		this.username = username;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ Name : "+getName()+", Email : "+getEmail()+", Mobile : "+getMno()+", Username : "+getUsername()+" ]";
	}
	
	
}
