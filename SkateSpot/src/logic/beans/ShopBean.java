package logic.beans;



public class ShopBean 
{
	private String name;
	private String city;
	private String partitaIVA;
	private String municipality;
	private String area;
	private String description;
	private String street;
	private String number;
	private static final String MATCH2="^[0-9]*$";
	
	public ShopBean() {}

	public ShopBean(String name,String city,String partitaIVA,String municipality,String area,String description)
	{
		setName(name);
		setCity(city);
		setPartitaIVA(partitaIVA);
		setMunicipality(municipality);
		setArea(area);
		setDescription(description);
	}
	public void control(String street,String number)
	{
		setStreet(street);
		setNumber(number);
	}

	public void setName(String name)
	{
		 
			this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	public void setCity(String city)
	{
		 
			this.city=city;
				
	}
	public String getCity()
	{
		return city;
	}
	public void setPartitaIVA(String partitaIVA)
	{
			this.partitaIVA=partitaIVA;
				
	}
	public String getPartitaIVA()
	{
		return partitaIVA;
	}
	public void setMunicipality(String municipality)
	{
			this.municipality=municipality;		
	}
	public String getMunicipality()
	{
		return municipality;
	}
	public void setArea(String area)
	{
			this.area=area;	
	}
	public String getArea()
	{
		return area;
	}
	public void setDescription(String description)
	{ 
			this.description=description;
		
	}
	public String getDescription()
	{
		return description;
	}
	public void setStreet(String street)
	{
		 
			this.street=street;
		
	}
	public String getStreet()
	{
		return street;
	}
	public void setNumber(String number)
	{ 
			this.number=number;
		
	}
	public String getNumber()
	{
		return number;
	}
	
	public boolean check()
	{
		return(!name.equals("")&&!city.equals("")&&!partitaIVA.equals("")&&partitaIVA.matches(MATCH2)&&(partitaIVA.length()==11)&&!municipality.equals("")&&!area.equals("")&&!description.equals("")&&!street.equals("")&&!number.equals("")&&number.matches(MATCH2));
		
		
	}
}