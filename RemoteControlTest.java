
public class RemoteControlTest {

	public static void main(String[] args) {
		Command[] comandos = new Command[4];
		
		////Comandos de luz
		SimpleRemoteControl remoteLuz = new SimpleRemoteControl();
		Light light = new Light();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		comandos[0] = lightOn;
		remoteLuz.setCommand(comandos[0]);
		remoteLuz.buttonWasPressed();
		
		LightOffCommand lightOff = new LightOffCommand(light);
		comandos[1] = lightOff;
		remoteLuz.setCommand(comandos[1]);
		remoteLuz.buttonWasPressed();
		
		SimpleRemoteControl remoteGarage = new SimpleRemoteControl();
		Garage garage = new Garage();
		
		////Comandos de garage
		GarageOpenCommand garageOpen = new GarageOpenCommand(garage);
		comandos[2] = garageOpen;
		remoteGarage.setCommand(comandos[2]);
		remoteGarage.buttonWasPressed();
		
		GarageCloseCommand garageClose = new GarageCloseCommand(garage);
		comandos[3] = garageClose;
		remoteGarage.setCommand(comandos[3]);
		remoteGarage.buttonWasPressed();
		
	}
}
