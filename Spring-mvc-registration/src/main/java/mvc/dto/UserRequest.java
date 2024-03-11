package mvc.dto;

public class UserRequest {
	
	private String name;
	private String email;
	private String mno;
	private String username;
	private String password;
	
	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRequest(String username, String password) {
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
	}
	public UserRequest(String name, String email, String mno, String username, String password) {
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
