package java_oop_exam;

public class TestPhone {

	public static void main(String[] args) {
		Iphone1 iphone1 = new Iphone1();
		iphone1.battery();
		iphone1.call();
		iphone1.camera();
		iphone1.massage();
		iphone1.wireless();
		AppleWatch.appleWatchInfo();
		
		iphone1.setPrice(750);
		iphone1.setInfo("I bought this phone in 2000,");
		iphone1.setUser('M');
		iphone1.setMadeInUSA(false);
		System.out.println(iphone1.getInfo()+ " the price was " + iphone1.getPrice()+ "$ \t My gander is :" + iphone1.getUser()+ ". \tIt was made in USA \t"+iphone1.isMadeInUSA());
		
	}
	
	Phone phone = new Phone() {
		
		@Override
		public void wireless() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void massage() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void interfaceInfo() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void camera() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void call() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void battery() {
			// TODO Auto-generated method stub
			
		}
	};
	
	AppleWatch aWatch = new AppleWatch() {
	};
	
}
