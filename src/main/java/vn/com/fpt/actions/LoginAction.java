package vn.com.fpt.actions;

import com.opensymphony.xwork2.ActionSupport;

import vn.com.fpt.authServ.AuthenticationService;
import vn.com.fpt.authServ.AuthenticationServiceImplService;
import vn.com.fpt.biddingEngine.BidService;
import vn.com.fpt.biddingEngine.BidWs;
import vn.com.fpt.biddingEngine.Item;

public class LoginAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("Successful");

		AuthenticationServiceImplService authImplServ = new AuthenticationServiceImplService();
		AuthenticationService authServ = authImplServ.getAuthenticationServiceImplPort();
		System.out.println(authServ.getAuthentication());
		return "home";
	}
}
