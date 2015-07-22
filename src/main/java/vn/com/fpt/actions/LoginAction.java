package vn.com.fpt.actions;

import com.opensymphony.xwork2.ActionSupport;

import vn.com.fpt.authServ.AuthenticationService;
import vn.com.fpt.authServ.AuthenticationServiceImplService;
import vn.com.fpt.biddingEngine.BidService;
import vn.com.fpt.biddingEngine.BidWs;
import vn.com.fpt.biddingEngine.Item;

public class LoginAction extends ActionSupport {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("Successful");

		AuthenticationServiceImplService authImplServ = new AuthenticationServiceImplService();
		AuthenticationService authServ = authImplServ.getAuthenticationServiceImplPort();
		System.out.println(authServ.getAuthentication());

		BidService bidService = new BidService();
		BidWs bidWs = bidService.getBidWsPort();

		Item foundItem = bidWs.getItemDemo(null);
		System.out.println(foundItem.getItemName());
		return SUCCESS;
	}
}
