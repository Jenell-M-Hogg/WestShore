package boat;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import interfaces.StorageItem;

public class Boat implements StorageItem {
	private BoatGraphic graphic;
	BoatModel info;
	
	public Boat(String customerName){
		this.graphic=(new BoatGraphic(customerName));
		this.info=new BoatModel();
		
		createPopUp();
		
		
	}

	
	private void createPopUp() {
		
		
		String popUp="";
		
		String[] categories={"Make","Length", "Beam", "Registration no."};
		String[] infos= {info.getMake(),info.getLength(),info.getBeam(),info.getRegistration()};
		String m = System.getProperty("line.seperator");
		
		for(int i=0; i<4;i++){
			if(infos[i]!=null){
				popUp=popUp+categories[i]+": "+infos[i]+m;
			}
			
		}
		
		getGraphic().setToolTipText(popUp);
		
		
	}



	@Override
	public void store(String location) {
		this.info.setLocation(location);
		
	}


	public BoatGraphic getGraphic() {
		return graphic;
	}
	
	public void select(){
		graphic.select();
		
	}



	
	
	

}
