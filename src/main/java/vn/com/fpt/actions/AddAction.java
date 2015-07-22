package vn.com.fpt.actions;

import com.opensymphony.xwork2.ActionSupport;

import vn.com.fpt.authServ.AuthenticationService;
import vn.com.fpt.authServ.AuthenticationServiceImplService;
import vn.com.fpt.biddingEngine.BidService;
import vn.com.fpt.biddingEngine.BidWs;
import vn.com.fpt.biddingEngine.Item;

public class AddAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		return "add";
	}
}
