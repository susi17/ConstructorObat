public class Sirup extends Obat{
	
	public int harga;

	public Sirup(String nama, int harga){
		super(nama);
		this.harga = harga;
	}

	public Sirup(String nama){
		super(nama);
	}

	public void showHarga(){
		System.out.println(harga);
	}
}