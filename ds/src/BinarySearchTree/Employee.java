package BinarySearchTree;

//import org.springframework.beans.factory.annotation.Value;



//@Component
public class Employee 
{
	//Attributes
	//@Value("20")
	int eId;
	String eName;
	String eAddress;
	
	public Employee()
	{
		System.out.println("--Object created---");
		
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + "]";
	}
	
	

}
