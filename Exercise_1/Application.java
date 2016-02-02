//IchsanRachmanGhifari_1301140299_IF3809//

public class Application{
	private String NamaAplikasi;
	private int UkuranAplikasi;
	
	public void Application(String NamaAplikasi, int UkuranAplikasi)
	{
		this.NamaAplikasi = NamaAplikasi;
		this.UkuranAplikasi = UkuranAplikasi;
	}
	
	public String getNamaAplikasi()
	{
		return NamaAplikasi;
	}
	
	public int getUkuranAplikasi()
	{
		return UkuranAplikasi;
	}
	
	public String toString()
	{
		return("Nama Aplikasi : "+NamaAplikasi+", Ukuran Aplikasi : "+UkuranAplikasi);
	}
}
