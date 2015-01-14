package pro.pojo;

public class Orders {
	private String orderid;
	private String name;
	private String cost;
	private String userid;
	private String statusid;
	private String paywayid;
	private String orderstatusname;
	private String paywaystyle;
	private String address;
	private String amount;
	
	private String zip;
	
	private String email;
	private String homephone;
	private String cellphone;
	private String officephone;
	
	public String getamount(){
		return amount;
	}
	public void setamount(String amount){
		this.amount=amount;
	}
	
	public String getaddress(){
		return address;
	}
	public void setaddress(String address){
		this.address=address;
	}
	
	
	
	
	public String gethomephone(){
		return homephone;
	}
	public void sethomephone(String homephone){
		this.homephone=homephone;
	}
	
	public String getcellphone(){
		return cellphone;
	}
	public void setcellphone(String cellphone){
		this.cellphone=cellphone;
	}
	
	public String getofficephone(){
		return officephone;
	}
	public void setofficephone(String officephone){
		this.officephone=officephone;
	}
	

	
	public String getzip(){
		return zip;
	}
	public void setzip(String zip){
		this.zip=zip;
	}
	
	public String getemail(){
		return email;
	}
	public void setemail(String email){
		this.email=email;
	}
	public String getorderid(){
		return orderid;
	}
	public void setorderid(String orderid){
		this.orderid=orderid;
	}
	
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	
	public String getcost(){
		return cost;
	}
	public void setcost(String cost){
		this.cost=cost;
	}
	
	public String getuserid(){
		return userid;
	}
	public void setuserid(String userid){
		this.userid=userid;
	}
	
	public String getorderstatusname(){
		return orderstatusname;
	}
	public void setorderstatusname(String orderstatusname){
		this.orderstatusname=orderstatusname;
	}
	
	public String getpaywayid(){
		return paywayid;
	}
	public void setpaywayid(String paywayid){
		this.paywayid=paywayid;
	}
	public String getstatusid(){
		return statusid;
	}
	public void setstatusid(String statusid){
		this.statusid=statusid;
	}
	public String getpaywaystyle(){
		return paywaystyle;
	}
	public void setpaywaystyle(String paywaystyle){
		this.paywaystyle=paywaystyle;
	}
}
