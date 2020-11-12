package entity.static_final;

public abstract class HinhHoc {
	public final static int maxShape =5;
	public static int counter=0;
	public abstract float tinhDienTich();
	public abstract float tinhChuVi();
	public HinhHoc() throws Exception{
		if (counter>=maxShape){
			throw new Exception("Số lượng hình tối đa là: "+Config.SO_LUONG_HINH_TOI_DA);
		}
		else{
		counter=counter+1;
		System.out.println("Hình thứ "+counter);
	}
	}
}
