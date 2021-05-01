package Product;

public class Product {
	
	String pcode;
	String pname;
	String pcategory;
	String pprice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String pcode, String pname, String pcategory, String pprice) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.pcategory = pcategory;
		this.pprice = pprice;
	}
	
	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}
	


}
