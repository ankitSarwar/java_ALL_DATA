package opps;

interface ICamera {
    void capture();
    void record();
    int fun();
}

interface IBrowser {
    void download();
    void openWebsite();
    int fun();
}
//class SmartPhone extends Dummyclass implements ICamera, IBrowser{
class SmartPhone implements ICamera, IBrowser{
    public void capture() {
        System.out.println("capturing");
    }
    public void record() {
        System.out.println("recording");
    }
    public void download() {
        System.out.println("downloading");
    }
    public void openWebsite() {
        System.out.println("opening");
    }
    public int fun() {
        System.out.println("fun");
        return 0;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
//     SmartPhone phone = new SmartPhone();
    	IBrowser phon = new SmartPhone();
    	  phon.fun();
	      phon.download();
	      phon.openWebsite(); 
	      
        ICamera phone = new SmartPhone();
        phone.capture();
        phone.record();
        phone.fun();
        
//         phone.download();
//         phone.openWebsite(); 
    }
}
