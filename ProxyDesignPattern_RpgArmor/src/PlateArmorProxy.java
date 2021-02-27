
public class PlateArmorProxy implements Armor{
	private Character character;
	private PlateArmor plateArmor;
	
	public PlateArmorProxy(Character character) {
		this.character=character;
		this.plateArmor = new PlateArmor();
	}
	
	@Override
	public void wear() {
		if (character.getCharacterClass().equals("Mage")) {
			System.out.println("Mages cannot wear plate armor.");
		}else {
			plateArmor.wear();
		}
	}
}
