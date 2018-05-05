package model;

import java.io.Serializable;
import java.util.ArrayList;


public class Player extends Person implements Serializable{

	private String position;
	private int overall;
	private char foot;
	private int salary;
	private int value;
	private boolean availableWeek;
	private int[] attributes = {0};
	private ArrayList<Action> actions;
	
	private int cntMatch;
	private int cntGoal;
	private int cntAssist;
	private int cntYellowCard;
	private int cntRedCard;

	/**
	 * @param name
	 * @param age
	 * @param height
	 * @param weight
	 * @param nationality
	 * @param position
	 * @param overall
	 * @param foot
	 * @param salary
	 * @param value
	 * @param availableWeek
	 * @param attributes
	 * @param actions
	 */
	public Player(String name, int age, int height, int weight, String nationality, String position, int overall,
			char foot, int salary, int value, boolean availableWeek, int[] attributes, ArrayList<Action> actions) {
		super(name, age, height, weight, nationality);
		this.position = position;
		this.overall = overall;
		this.foot = foot;
		this.salary = salary;
		this.value = value;
		this.availableWeek = availableWeek;
		this.attributes = attributes;
		this.actions = actions;
		
		this.cntMatch = 0;
		this.cntGoal = 0;
		this.cntAssist = 0;
		this.cntYellowCard = 0;
		this.cntRedCard = 0;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the overall
	 */
	public int getOverall() {
		return overall;
	}

	/**
	 * @param overall
	 *            the overall to set
	 */
	public void setOverall(int overall) {
		this.overall = overall;
	}

	/**
	 * @return the foot
	 */
	public char getFoot() {
		return foot;
	}

	/**
	 * @param foot
	 *            the foot to set
	 */
	public void setFoot(char foot) {
		this.foot = foot;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the availableWeek
	 */
	public boolean isAvailableWeek() {
		return availableWeek;
	}

	/**
	 * @param availableWeek
	 *            the availableWeek to set
	 */
	public void setAvailableWeek(boolean availableWeek) {
		this.availableWeek = availableWeek;
	}
	public int[] getAttributes() {
		return attributes;
	}
	
	private static final int ATT_RAN = 10;
	
	
	/**
	 * @return the attributes
	 */
	public void modifyAttributes() {
		if(position == "GK") {
			attributes[0] = overall + (int) (Math.random()  * ATT_RAN + 3);
			attributes[1] = overall + (int) (Math.random()  * ATT_RAN - 40);
			attributes[2] = overall + (int) (Math.random()  * ATT_RAN - 25);
			attributes[3] = overall + (int) (Math.random()  * ATT_RAN - 15);
			attributes[4] = overall + (int) (Math.random()  * ATT_RAN + 7);
			attributes[5] = overall + (int) (Math.random()  * ATT_RAN + 5);
			attributes[6] = overall + (int) (Math.random()  * ATT_RAN + 10);
			attributes[7] = overall + (int) (Math.random()  * ATT_RAN + 8);
		}
		if(position == "RB") {
			attributes[0] = overall + (int) (Math.random() * ATT_RAN + 10);
			attributes[1] = overall + (int) (Math.random() * ATT_RAN - 15);
			attributes[2] = overall + (int) (Math.random() * ATT_RAN + 5);
			attributes[3] = overall + (int) (Math.random() * ATT_RAN - 13);
			attributes[4] = overall + (int) (Math.random() * ATT_RAN + 5);
			attributes[5] = overall + (int) (Math.random() * ATT_RAN - 10);
			attributes[6] = overall + (int) (Math.random() * ATT_RAN - 60);
			attributes[7] = overall + (int) (Math.random() * ATT_RAN + 2);
		}
		if(position == "CB") {
			attributes[0] = overall + (int) (Math.random() * ATT_RAN - 7);
			attributes[1] = overall + (int) (Math.random() * ATT_RAN - 20);
			attributes[2] = overall + (int) (Math.random() * ATT_RAN - 8);
			attributes[3] = overall + (int) (Math.random() * ATT_RAN + 3);
			attributes[4] = overall + (int) (Math.random() * ATT_RAN + 10);
			attributes[5] = overall + (int) (Math.random() * ATT_RAN + 8);
			attributes[6] = overall + (int) (Math.random() * ATT_RAN - 40);
			attributes[7] = overall + (int) (Math.random() * ATT_RAN + 5);
		}
		if(position == "LB") {
			attributes[0] = overall + (int) (Math.random() * ATT_RAN + 10);
			attributes[1] = overall + (int) (Math.random() * ATT_RAN - 15);
			attributes[2] = overall + (int) (Math.random() * ATT_RAN + 5);
			attributes[3] = overall + (int) (Math.random() * ATT_RAN - 13);
			attributes[4] = overall + (int) (Math.random() * ATT_RAN + 5);
			attributes[5] = overall + (int) (Math.random() * ATT_RAN - 10);
			attributes[6] = overall + (int) (Math.random() * ATT_RAN - 60);
			attributes[7] = overall + (int) (Math.random() * ATT_RAN + 2);
		}
		if(position == "CM") {
			attributes[0] = overall + (int) (Math.random() * ATT_RAN - 5);
			attributes[1] = overall + (int) (Math.random() * ATT_RAN + 6);
			attributes[2] = overall + (int) (Math.random() * ATT_RAN - 3);
			attributes[3] = overall + (int) (Math.random() * ATT_RAN + 10);
			attributes[4] = overall + (int) (Math.random() * ATT_RAN + 0);
			attributes[5] = overall + (int) (Math.random() * ATT_RAN + 5);
			attributes[6] = overall + (int) (Math.random() * ATT_RAN - 40);
			attributes[7] = overall + (int) (Math.random() * ATT_RAN + 10);
		}
		if(position == "RW") {
			attributes[0] = overall + (int) (Math.random() * ATT_RAN + 10);
			attributes[1] = overall + (int) (Math.random() * ATT_RAN + 9);
			attributes[2] = overall + (int) (Math.random() * ATT_RAN + 10);
			attributes[3] = overall + (int) (Math.random() * ATT_RAN - 5);
			attributes[4] = overall + (int) (Math.random() * ATT_RAN - 15);
			attributes[5] = overall + (int) (Math.random() * ATT_RAN + 7);
			attributes[6] = overall + (int) (Math.random() * ATT_RAN - 65);
			attributes[7] = overall + (int) (Math.random() * ATT_RAN + 1);
		}
		if(position == "ST") {
			attributes[0] = overall + (int) (Math.random() * ATT_RAN + 5);
			attributes[1] = overall + (int) (Math.random() * ATT_RAN + 10);
			attributes[2] = overall + (int) (Math.random() * ATT_RAN + 5);
			attributes[3] = overall + (int) (Math.random() * ATT_RAN - 5);
			attributes[4] = overall + (int) (Math.random() * ATT_RAN - 35);
			attributes[5] = overall + (int) (Math.random() * ATT_RAN + 10);
			attributes[6] = overall + (int) (Math.random() * ATT_RAN - 60);
			attributes[7] = overall + (int) (Math.random() * ATT_RAN + 5);
		}
		if(position == "LW") {
			attributes[0] = overall + (int) (Math.random() * ATT_RAN + 10);
			attributes[1] = overall + (int) (Math.random() * ATT_RAN + 9);
			attributes[2] = overall + (int) (Math.random() * ATT_RAN + 10);
			attributes[3] = overall + (int) (Math.random() * ATT_RAN - 5);
			attributes[4] = overall + (int) (Math.random() * ATT_RAN - 15);
			attributes[5] = overall + (int) (Math.random() * ATT_RAN + 7);
			attributes[6] = overall + (int) (Math.random() * ATT_RAN - 65);
			attributes[7] = overall + (int) (Math.random() * ATT_RAN + 1);
		}
		
	}

	/**
	 * @param attributes
	 *            the attributes to set
	 */
	public void setAttributes(int[] attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return the actions
	 */
	public ArrayList<Action> getActions() {
		return actions;
	}

	/**
	 * @param actions
	 *            the actions to set
	 */
	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}

	public int getCntMatch() {
		return cntMatch;
	}

	public void setCntMatch(int cntMatch) {
		this.cntMatch = cntMatch;
	}

	public int getCntGoal() {
		return cntGoal;
	}

	public void setCntGoal(int cntGoal) {
		this.cntGoal = cntGoal;
	}

	public int getCntAssist() {
		return cntAssist;
	}

	public void setCntAssist(int cntAssist) {
		this.cntAssist = cntAssist;
	}

	public int getCntYellowCard() {
		return cntYellowCard;
	}

	public void setCntYellowCard(int cntYellowCard) {
		this.cntYellowCard = cntYellowCard;
	}

	public int getCntRedCard() {
		return cntRedCard;
	}

	public void setCntRedCard(int cntRedCard) {
		this.cntRedCard = cntRedCard;
	}


}
