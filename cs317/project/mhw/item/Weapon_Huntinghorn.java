package cs317.project.mhw.item;

/**
 * 
 * @author Tyler Procko
 * @date January-May 2018
 * 
 * Weapon_Huntinghorn object class. Stores all data for an instance of the class.
 * 
 * Extends: Weapon
 *
 */

public class Weapon_Huntinghorn extends Weapon
{
	private int attack;
	private String sharpness;
	private int affinity;
	private String elementType;
	private int elementDamage;
	private int hiddenElement;
	private int level1Gem;
	private int level2Gem;
	private int level3Gem;
	private int defenseBonus;
	private String elderseal;
	private String note1;
	private String note2;
	private String note3;
	
	/**
	 * Default constructor.
	 * 
	 * @param name
	 * @param rarity
	 * @param attack
	 * @param sharpness
	 * @param affinity
	 * @param elementType
	 * @param elementDamage
	 * @param hiddenElement
	 * @param level1Gem
	 * @param level2Gem
	 * @param level3Gem
	 * @param defenseBonus
	 * @param elderseal
	 * @param note1
	 * @param note2
	 * @param note3
	 */
	public Weapon_Huntinghorn(String name, int rarity, int attack, String sharpness, int affinity,
			String elementType, int elementDamage, int hiddenElement, int level1Gem, int level2Gem,
			int level3Gem, int defenseBonus, String elderseal, String note1, String note2,
			String note3)
	{
		type = "huntinghorn";
		this.name = name;
		this.rarity = rarity;
		
		this.attack = attack;
		this.sharpness = sharpness;
		this.affinity = affinity;
		this.elementType = elementType;
		this.elementDamage = elementDamage;
		this.hiddenElement = hiddenElement;
		this.level1Gem = level1Gem;
		this.level2Gem = level2Gem;
		this.level3Gem = level3Gem;
		this.defenseBonus = defenseBonus;
		this.elderseal = elderseal;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
	}
	
	@Override
	public String getAllInfo()
	{
		allInfo = 
				"Rarity: " + rarity + "\n\n"
				
				+ "Attack: " + attack + "\n"
				+ "Sharpness: " + sharpness + "\n"
				+ "Affinity: " + affinity + "%\n\n"
				
				+ "Element: " + elementType + ", with a damage of " + elementDamage + "\n"
				+ "Hidden element: " + hiddenElement + "\n\n"
				
				+ "Note one: "  + note1 + "\n"
				+ "Note two: "  + note2 + "\n"
				+ "Note three: "  + note3 + "\n\n"
				
				+ "Level 1 gem slots: " + level1Gem + "\n"
				+ "Level 2 gem slots: " + level2Gem + "\n"
				+ "Level 3 gem slots: " + level3Gem + "\n\n"
				
				+ "Defense bonus: " + defenseBonus + "\n\n"
				
				+ "Elderseal: " + elderseal + "\n";
		
		return allInfo;
	}
	
	@Override
	public int getAttack() {
		return attack;
	}

	public String getSharpness() {
		return sharpness;
	}

	@Override
	public int getAffinity() {
		return affinity;
	}

	public String getElementType() {
		return elementType;
	}

	public int getElementDamage() {
		return elementDamage;
	}

	public int getHiddenElement() {
		return hiddenElement;
	}

	public int getLevel1Gem() {
		return level1Gem;
	}

	public int getLevel2Gem() {
		return level2Gem;
	}

	public int getLevel3Gem() {
		return level3Gem;
	}

	@Override
	public int getDefenseBonus() {
		return defenseBonus;
	}

	public String getElderseal() {
		return elderseal;
	}

	public String getNote1() {
		return note1;
	}

	public String getNote2() {
		return note2;
	}

	public String getNote3() {
		return note3;
	}
}