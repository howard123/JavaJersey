package serverside;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jsonmodel.AccountModel;

@Path("/demoMime")
public class demoMimeType {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTxt() {
		return "This is text!";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String getXml() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getJson() {
		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
				+ "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	}

	@GET
	@Path("/account")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public AccountModel getAccount() {
		AccountModel acct = new AccountModel();
		acct.setId(111);
		acct.setAcctDesc("Checking account");

		return acct;
	}

}
