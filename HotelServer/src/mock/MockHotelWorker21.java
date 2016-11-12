package mock;

import objects.HotelWorker;
import vo.HotelWorkerVO;

public class MockHotelWorker21 extends HotelWorker {
	int hotelid;
	HotelWorkerVO w;
	
	public MockHotelWorker21(int id,HotelWorkerVO hwvo){
		hotelid = id;
		w = hwvo;
	}
	public int getid(){
		return this.hotelid;
	}
	public HotelWorkerVO getHotelWorkerVO(){
		return this.w;
	}
	
	
}
