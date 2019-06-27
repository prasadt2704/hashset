package collection;

import java.util.Date;
import java.util.Scanner;

public class collection {

	public String country;
	public String denomination;
	public int yearOfMinting;
	public int currVal;
	public Date acqDate;


	
	
	
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getDenomination() {
		return denomination;
	}


	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}


	public int getYearOfMinting() {
		return yearOfMinting;
	}


	public void setYearOfMinting(int yearOfMinting) {
		this.yearOfMinting = yearOfMinting;
	}


	public int getCurrVal() {
		return currVal;
	}


	public void setCurrVal(int currVal) {
		this.currVal = currVal;
	}


	public Date getAcqDate() {
		return acqDate;
	}


	public void setAcqDate(Date acqDate) {
		this.acqDate = acqDate;
	}


	public collection()
	{
		
	}
	
	
	
	
	public collection(String country, String denomination, int yearOfMinting, int currVal, Date acqDate) {
		super();
		this.country = country;
		this.denomination = denomination;
		this.yearOfMinting = yearOfMinting;
		this.currVal = currVal;
		this.acqDate = acqDate;
	}



	public void display()
	{
		System.out.println("Country:"+this.country);
		System.out.println("Denomination:"+this.denomination);
		System.out.println(" year of minting:"+this.yearOfMinting);
		System.out.println("current values:"+this.currVal);
		System.out.println("Date:"+this.acqDate);
	}
	
	
	public boolean equals(collection c)
	{
		if(this.country.equals(c.getCountry()) && this.denomination.equals(c.getDenomination()) &&
				(this.yearOfMinting==c.getYearOfMinting()) && this.currVal==c.getCurrVal())
		{
			return true;
		}
		else 
		{
		return false;
		}
		
	}
	
}
