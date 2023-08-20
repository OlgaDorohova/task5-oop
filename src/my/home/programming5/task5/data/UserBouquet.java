package my.home.programming5.task5.data;

import java.util.ArrayList;
import java.util.List;

public class UserBouquet {
	private List<UserData> datas;
	private String wrapper;

	public UserBouquet() {
		
	}

	public UserBouquet(List<UserData> datas) {
		this.datas = datas;
	}

	public void add(UserData userData) {
		datas.add(userData);
	}

	public List<UserData> getUserDataList() {
		return datas;
	}

	public String getWrapper() {
		return wrapper;
	}

	public void setWrapper(String wrapper) {
		this.wrapper = wrapper;
	}
	
	public void create() {
		datas = new ArrayList<>();
	}

	public int size() {
		return datas.size();
	}
	
	

}
