package my.home.programming5.task4.dao;

import java.io.FileNotFoundException;
import java.util.List;

import my.home.programming5.task4.bean.Treasure;

public interface TreasureDao {
	
	public List <Treasure> getAll() throws FileNotFoundException;
	
	public void deleteTreasure(Treasure Treasure) throws FileNotFoundException;
	
	public void addTreasure(Treasure treasure) throws FileNotFoundException;

}
