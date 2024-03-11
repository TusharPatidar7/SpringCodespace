package lifeCycleOfBean;

import javax.security.auth.DestroyFailedException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Address implements InitializingBean, DisposableBean{
	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("\nafterPropertiesSet() method of address using InitializingBean!");
	}
	@Override
	public void destroy() throws DestroyFailedException {
		System.out.println("destroy() method using DisposableBean!\n");
	}
}
