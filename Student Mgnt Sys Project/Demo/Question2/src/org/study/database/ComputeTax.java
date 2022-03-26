package org.study.database;

public class ComputeTax
{
	private int taxableincome;
	private String fillingstatus;
	
	public ComputeTax() 
	{
		super();
	}
	
	public ComputeTax(int taxableincome, String fillingstatus)
	{
		super();
		this.taxableincome = taxableincome;
		this.fillingstatus = fillingstatus;
	}

	public int getTaxableincome()
	{
		return taxableincome;
	}

	public String getFillingstatus()
	{
		return fillingstatus;
	}

	public void setTaxableincome(int taxableincome)
	{
		this.taxableincome = taxableincome;
	}

	public void setFillingstatus(String fillingstatus)
	{
		this.fillingstatus = fillingstatus;
	}
	
	public double calculate()
	{
		fillingstatus=fillingstatus.toLowerCase();
		double tax=0;
		switch(fillingstatus)
		{
			case "single": tax=taxableincome*0.3;
			break;
			case "married jointly": tax=(taxableincome*0.2)+5000;
			break;
			case "married separately": tax=(taxableincome*0.25)+3000;
			break;
			case "head of household": tax= taxableincome*0.1;
			break;
			default: tax= 0.3*taxableincome;
		}
		return tax;
	}
	
	
	
	
}
