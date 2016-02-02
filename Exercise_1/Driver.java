//IchsanRachmanGhifari_1301140299_IF3809//

public class Driver{
	public static void main(String[] args)
	{
		AppStore apps = new AppStore();
		apps.createApp("aplikasi 1",100);
		apps.createApp("aplikasi 2",200);
		apps.createApp("aplikasi 3",300);
		apps.createApp("aplikasi 4",400);
		System.out.println(apps.toString());
		System.out.println(apps.getApp(2).toString());
		
		SmartPhone sm = new SmartPhone();
		sm.setMemory(300);
		System.out.println(sm.toString());
		sm.addApplication(apps, 1);
		System.out.println(sm.toString());
	}
}
