package patronsingleton;

public class ManejoString {

	static ManejoString ms; 
	
	//constructor privado para solo crear una instancia del objeto
	private ManejoString(){
	}
	
	public static ManejoString getInstance(){
		if(ms==null){
			ms = new ManejoString();
		}
		return ms; 
	}
	
	
}
