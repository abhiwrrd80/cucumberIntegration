package cucumberProject;

import cucumber.api.java.en.When;

public class Exercise3 {
	@When("testme displays welcome message")
	public void testme_displays_welcome_message() {
	System.out.println("welcome");
	}

	@When("user performs login function")
	public void user_performs_login_function() {
		System.out.println("log in");
	}

	@When("user performs search function")
	public void user_performs_search_function() {
		System.out.println("search something");
	}

	@When("user validating the cart")
	public void user_validating_the_cart() {
		System.out.println("check and validate the cart");
	}

	@When("user performs payment")
	public void user_performs_payment() {
		System.out.println("pay the balance");
	}

	@When("user performs logout")
	public void user_performs_logout() {
		System.out.println("now go out");
	}


}
