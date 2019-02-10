package cb.beans;

public class Customer {

	private String cust_name;
	private int cust_id;
	private Address cust_address;
	
	public Customer() {}
	
	public Customer(String cust_nameC,int cust_idC,Address cust_addressC) {
		
		this.cust_name=cust_nameC;
		this.cust_id=cust_idC;
		this.cust_address=cust_addressC;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public Address getCust_address() {
		return cust_address;
	}

	public void setCust_address(Address cust_address) {
		this.cust_address = cust_address;
	}
	
	@Override
    public String toString() {
        return "Customer [cust_name=" + cust_name + ", cust_id=" + cust_id + ", cust_address=" + cust_address +" ]";
    }

}
