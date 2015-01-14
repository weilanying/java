package pro2.pojo;

public class Product {
	private String productid;
	private String name;
	private String description;
	private String basePrice;
	private String categoryid;
	private String author;
	private String publish;
	private String pages;
	private String images;
	
	public String getproductid(){
		return productid;
	}
	public void setproductid(String productid){
		this.productid=productid;
	}
	
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	
	public String getdescription(){
		return description;
	}
	public void setdescription(String description){
		this.description=description;
	}
	
	public String getbasePrice(){
		return basePrice;
	}
	public void setbasePrice(String basePrice){
		this.basePrice=basePrice;
	}
	
	public String getcategoryid(){
		return categoryid;
	}
	public void setcategoryid(String categoryid){
		this.categoryid=categoryid;
	}
	
	public String getauthor(){
		return author;
	}
	public void setauthor(String author){
		this.author=author;
	}
	
	public String getpublish(){
		return publish;
	}
	public void setpublish(String publish){
		this.publish=publish;
	}
	
	public String getpages(){
		return pages;
	}
	public void setpages(String pages){
		this.pages=pages;
	}
	
	public String getimages(){
		return images;
	}
	public void setimages(String images){
		this.images=images;
	}
}
