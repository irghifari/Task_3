//IF-38-09_Adzan Nugraha_1301140249

public class SmartPhone{
	private Application[] AppList = new Application[10];
	private int totalApp;
	private int memory;
	
	public void setMemory(int memory)
	{
		this.memory = memory;
	}
	
	public Application getApp(int id)
	{
		return AppList[id];
	}
	
	public int getTotalApp()
	{
		return totalApp;
	}
	
	public int getRemainingSize()
	{
		int mr = memory;
		int size = 0;
		for (int i = 0;i<AppList.length;i++)
		{
			if(AppList[i] != null)
			{
				size = size + AppList[i].getUkuranAplikasi();
			}
		}
		mr = mr-size;
		return mr;
	}
	
	public void addApplication(AppStore appStore, int apsId)
	{
		if(getRemainingSize()>=appStore.getApp(apsId).getUkuranAplikasi())
		{
			AppList[totalApp] = appStore.getApp(apsId);
			totalApp++;
		}
	}
	
	public String toString()
	{
		return ("Ukuran memory"+memory+", memory tersisa : "+getRemainingSize());
	}
}
