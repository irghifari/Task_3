//IchsanRachmanGhifari_1301140299_IF3809//

public class Driver1 {
	public static void main(String[] args ) 
	{
		StartUp st = new StartUp();
		Member m = new Member("Alex");
		st.addMember(m);
		m = new Member("Beni");
		st.addMember(m);
		m = new Member("Cakra");
		st.addMember(m);
		m = new Member("Deni");
		st.addMember(m);
		m = new Member("Eric");
		st.addMember(m);
			
		st.createProject("Project1");
		st.createProject("Project2");
			
		Project p = st.getProject(0);
		m = st.getMember(0);
		st.setProjectMember(p,m);
			
		st.releaseProject(st.getProject(1));
			
		System.out.println(st.getMember(0).toString());
		System.out.println(st.getMember(1).toString());
		System.out.println(st.getMember(2).toString());
		System.out.println(st.getMember(3).toString());
		System.out.println(st.getMember(4).toString());
		System.out.println("Projek keluar: "+st.getNumReleasedProject());
	}
}
