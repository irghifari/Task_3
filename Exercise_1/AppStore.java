//IchsanRachmanGhifari_1301140299_IF3809//

public class AppStore{
		private Application[] AppList = new Application[100];
		private int totalApp = 0;
		
		public void createApp(String NamaAplikasi, int UkuranAplikasi)
		{
			Application app = new Application();
			AppList[totalApp] = app ;
			totalApp++;
		}
		
		public Application getApp(int id)
		{
			return AppList[id];
		}
		
		public int getTotalApp()
		{
			return totalApp;
		}
		
		public Application[] getAppList()
		{
			return AppList;
		}
		
		public String toString()
		{
			return("Ada"+totalApp+" aplikasi di Smartphone");
		}
}
