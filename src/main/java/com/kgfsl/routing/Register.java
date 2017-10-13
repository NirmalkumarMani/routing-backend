package com.kgfsl.routing;
import javax.persistence.*;
@Entity
@Table(name="Registration")
public class Register
{
    @Id
 	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private Integer zipcode;
    private String location;
    public Register()
    {

    }
    public Register(Integer id,String name, String email,Integer zipcode,String location)
    {
      this.id=id;
      this.name=name;
      this.email=email;
      this.zipcode=zipcode;
      this.location=location;
}
public Integer getId()
{
    return id;

}
public void  SetId(Integer id)
{
    this.id=id;
}
public String getName()
{
    return name;
}
public void SetName(String name)
{
    this.name=name;
}
public String getEmail()
{
    return email;

}
public void SetEmail(String email)
{
    this.email=email;
}
public Integer getZipcode()
{
    return zipcode;

}
public void SetZipcode(Integer zipcode)
{
    this.zipcode=zipcode;

}
public String getLocation()
{
    return location;

}
public void SetLocation(String location)
{
    this.location=location;
}

public String toString()
{
    return name +" "+ email +" "+zipcode +" "+ location;
}
}