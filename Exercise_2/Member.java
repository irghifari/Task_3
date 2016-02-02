//IchsanRachmanGhifari_1301140299_IF3809//

public class Member {
	private String name;
	private String specialization;
	private int projectWorked=0;
	
	public Member (String name) 
	{
		this.name = name;
	}
	
	public Member (String name, String specialization) 
	{
		this.name = name;
		this.specialization = specialization;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setProjectWorked(int projectWorked) {
		this.projectWorked = projectWorked;
	}
	
	public int getProjectWorked() 
	{
		return projectWorked;
	}
	
	public void setSpecialization(String specialization) 
	{
		this.specialization = specialization;
	}
	
	public String getSpecialization() 
	{
		return specialization;
	}
	
	public String toString() {
		return ("Member "+name+" spesialisasi "+specialization+" dan bekerja "+projectWorked);
	}
} 
