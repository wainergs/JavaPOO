
public class Equipamento {
	private boolean ligado = false;
	
	void liga(){
		ligado = true;
	}
	
	void desliga(){
		ligado = false;
	}
	

}

class EquipamentoSonoro extends Equipamento{
	private int volume;
	private boolean stereo;
	
	void mono(){
		stereo = false;
	}
	
	void stereo(){
		stereo = true;
	}
	
	void liga(){
		volume = 5;
	}
}
