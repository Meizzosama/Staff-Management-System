public class Applyforjobs {
	String name; 
	String qualification;
    String city;
    String designation;
    
    Applyforjobs(String name,String qualification,String city,String designation)
    {
    	this.name=name;
    	this.qualification=qualification;
    	this.city=city;
    	this.designation= designation;
    }
    
    public String toString() {

        String info =  "Name: " + name + "\nQualification: " + qualification + "\nCity: " + city +"\nDesignation:"+designation+"\n";

        return info;

    }
    
}