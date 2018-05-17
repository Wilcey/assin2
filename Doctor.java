//Assignment One - James Wilce - C3236186
//Doctor class which holds all set and get attributes for doctor
 


public class Doctor 
{
	private String name = ""; 	// the name of the doctor
	private String spec = ""; 	// the specialisation of the doctor (it can be 'dog' or 'cat')
        
	
	public void setName(String name)
	{
		this.name = name;
	}
	
        public void setSpec(String name)
	{
		this.spec = name;
	}
	
	public String getName()
	{
		return name;
	}
        
        public String getSpec()
	{
		return spec;
	}

}
