
public class Main {
	public static void main(String[] args) {
		Armor armor = new PlateArmorProxy(new Character("Fighter"));
		armor.wear();
		
		armor = new PlateArmorProxy(new Character("Mage"));
		armor.wear();
	}
}
