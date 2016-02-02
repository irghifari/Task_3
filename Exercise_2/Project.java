//IchsanRachmanGhifari_1301140299_IF3809//

public class Project {
	private String projectName;
	private Member[] teamMember;
	private int nTeam = 0;
	private boolean releaseStatus;
	
	public Project(String projectName) 
	{
		this.projectName = projectName;
		teamMember = new Member[5];
		releaseStatus = false;
	}
	
	public void addMember(Member m) 
	{
		teamMember[nTeam] = m;
		nTeam++;
	}
	
	public boolean isReleased() 
	{
		return releaseStatus;
	}
	
	public void releaseApp() 
	{
		releaseStatus = true;
	}
	
	public String toString() 
	{
		String condition;
		if (releaseStatus = true) 
		{
			condition = "Released";
		}
		else 
		{
			condition = "in progress"; 
		}
		return ("Projek "+projectName+" status "+condition+" dengan tim "+nTeam);
	}
}
