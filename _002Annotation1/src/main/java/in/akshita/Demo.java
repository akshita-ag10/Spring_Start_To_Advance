package in.akshita;

import org.springframework.stereotype.Component;


// the bean of this class will not be created by Spring, b/c in applicationConfig file we has asked spring to consider only 
//those classes that are in base package = com.akshita
@Component 
public class Demo {
	public Demo() {
		System.out.println("Demo bean created");
	}
}
