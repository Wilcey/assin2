//Assignment One - James Wilce - C3236186
//Pet class which holds all set and get attributes for pet
 


public class Pet 
{
    private String type;    // the type of the pet. It can be only Cat or Dog.
    private String size;    // the size of the pet. It can be only Small, Medium or Large.
    private String name;    // the name of the pet. 
    private double weight;  //the weight of the pet.
    private int age;        //the age of the pet.
    private String doctorName;
    
    public Pet() 
    {
        type = "";
        size = "";
        name = "";
        weight = -1;
        age = -1;
        doctorName = "";
            
    }
    
    // add comments
    public void setType(String type)
    {
        this.type = type;
    }
    // add comments
    public String getType()
    {
        return type;
    }
        // add comments
    public void setSize(String type)
    {
        this.size = type;
    }
    // add comments
    public String getSize()
    {
        return size;
    }
        // add comments
    public void setName(String type)
    {
        this.name = type;
    }
    // add comments
    public String getName()
    {
        return name;
    }
        // add comments
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    // add comments
    public double getWeight()
    {
        return weight;
    }
        // add comments
    public void setAge(int age)
    {
        this.age = age;
    }
    // add comments
    public int getAge()
    {
        return age;
    }
    
    public void setDoctorName(String doctorName)
    {
        this.doctorName = doctorName;
    }
        
    public String getDoctorName()
    {
        return doctorName;
    }
        

}
