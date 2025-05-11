package homeInventory;

import java.io.Serializable;
public class Home implements Serializable{
	// initialized variables
	private int squareFeet;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private String modelName;
	private String saleStatus;
	
	//default constructor
	public Home() {
		squareFeet = -1;
		address = "NoAddress";
		city = "NoCity";
		state = "NoState";
		zipCode = -1;
		modelName = "NoModel";
		saleStatus = "NoStatus";
	}
	
	// parameterized constructor
	public Home(int squareFeet, String address, String city, String state, int zipCode, String modelName, String saleStatus)   { 
		this.squareFeet = squareFeet;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.modelName = modelName;
		this.saleStatus = saleStatus;		
	}	
	
	// setters
	public void setSquarefeet(int squareFeet ) {
		this.squareFeet = squareFeet;
	}
	public void setAddress(String address ) {
		this.address = address;
	}
	public void setCity(String city ) {
		this.city = city;
	}
	public void setState(String state ) {
		this.state = state;
	}
	public void setZipcode(int zipCode ) {
		this.zipCode = zipCode;
	}
	public void setModelname(String modelName ) {
		this.modelName = modelName;
	}
	public void setSaleStatus(String saleStatus ) {
		this.saleStatus = saleStatus;
	}
	
	//getters
	public int getSquarefeet() {
		return squareFeet;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZipcode() {
		return zipCode;
	}
	public String getModelname() {
		return modelName;
	}
	public String getSalestatus() {
		return saleStatus;
	}
	
	// method to format output
	@Override
	public String toString() {
		return "Square Feet: "+ squareFeet +"  " + "Address:" + address +"  " + "City:" + city +"  " + "State:" + state +"  " + "Zip Code:" + zipCode +"  " + "Model Name:" + modelName +"  " + "Sale Status:" + saleStatus;	
	}

	
	
}	

	