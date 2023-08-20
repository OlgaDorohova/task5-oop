package my.home.programming5.task5.data;


public class UserData {

private String type;
private int amount;
private String color;

public UserData() {}

public UserData(String type, String color, int amount) {
	this.type = type;
	this.amount = amount;
	this.color = color;
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

@Override
public String toString() {
	return "UserData [type=" + type + ", amount=" + amount + ", color=" + color + "]";
}
}
