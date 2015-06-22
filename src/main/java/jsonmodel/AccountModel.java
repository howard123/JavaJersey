package jsonmodel;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AccountModel {

	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAcctDesc() {
		return acctDesc;
	}
	public void setAcctDesc(String acctDesc) {
		this.acctDesc = acctDesc;
	}
	private String acctDesc;

}
