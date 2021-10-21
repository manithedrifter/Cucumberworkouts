package cm.amni.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before()
	public void first() {
		System.out.println("first");
	}

	


}
