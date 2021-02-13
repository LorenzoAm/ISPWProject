package logic.beans;




public class SpotBean
{
    private String name;
    private String street;
    private String number;
    private String city;
    private String municipality;
    private String area;
    private String type;
    private String description;
    
    
    public SpotBean() {}

    public SpotBean(String name,String street,String number,String city,String municipality,String area)
    {
        setName(name);
        setStreet(street);
        setNumber(number);
        setCity(city);
        setMunicipality(municipality);
        setArea(area);
    }

    public void control(String type,String description)
    {
        setType(type);
        setDescription(description);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setMunicipality(String municipality)
    {
        this.municipality = municipality;
    }

    public void setArea(String area)
    {
        this.area = area;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getName()
    {
        return name;
    }

    public String getStreet()
    {
        return street;
    }

    public String getNumber()
    {
        return number;
    }

    public String getCity()
    {
        return city;
    }

    public String getMunicipality()
    {
        return municipality;
    }

    public String getArea()
    {
        return area;
    }

    public String getType()
    {
        return type;
    }

    public String getDescription()
    {
        return description;
    }


    public boolean check()
    {
        return(checkName()&&checkStreet()&&checkNumber()&&checkCity()&&checkMunicipality()&&checkArea()&&checkType()&&checkDescription());
       
        
    }

    private boolean checkType()
    {
        return( !type.equals(""));
    }

    private boolean checkName()
    {
        return( !name.equals(""));
       
    }

    private boolean checkCity()
    {
        return( !city.equals(""));
        
    }

    private boolean checkMunicipality()
    {
        return( !municipality.equals(""));
        
    }

    private boolean checkArea()
    {
        return( !area.equals(""));
        
    }

    private boolean checkDescription()
    {
        return( !description.equals(""));
        
    }

    private boolean checkStreet()
    {
        return( !street.equals(""));
        
    }

    private boolean checkNumber()
    {
        return( !(number.equals("")) && (number.matches("^[0-9]*$")));
        
    }
}
