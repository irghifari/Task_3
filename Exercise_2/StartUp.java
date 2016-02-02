//IchsanRachmanGhifari_1301140299_IF3809//

public class StartUp {
	private Member[] member = new Member[100];
	private Project[] projectList = new Project[100];
	private int nMember=0;
	private int nProject=0;
	
	public void addMember(Member m) 
	{
		member[nMember] = m; 
		nMember++;
	} 
	
	public Member getMember(int id) 
	{
		return member[id];
	}
	
	public void createProject(String ProjectName) 
	{
		Project p = new Project(ProjectName);
		projectList[nProject] = p;
		nProject++;
	}
	
	public Project getProject(int id)
	{
		return projectList[id];
	}
	
	public void setProjectMember(Project p, Member m) {
		int pw = m.getProjectWorked();
		pw++;
		p.addMember(m);
		m.setProjectWorked(pw);
	}
	
	public void  releaseProject(Project p) 
	{
		p.releaseApp();
	}
	
	public int getNumReleasedProject() {
		int jumlah;
		int i;
		jumlah = 0;
		i = 0;
		while (projectList[i] != null) 
		{
			if (projectList[i].isReleased()) 
			{
				jumlah++;
			}
			i++;
		}
		return jumlah;
	}
}
