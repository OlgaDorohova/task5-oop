package my.home.programming5.task5.builder;

import my.home.programming5.task5.bean.bouquet.Bouquet;
import my.home.programming5.task5.bean.flower.Flower;
import my.home.programming5.task5.bean.packaging.Wrapper;
import my.home.programming5.task5.data.UserBouquet;
import my.home.programming5.task5.data.UserData;

public class Director {
private UserBouquet userBouquet;
private Bouquet bouquet;

public Director(){}

public Director(UserBouquet ub){
	this.userBouquet = ub;
}



public Bouquet addWrapper(String item) {
	
	
	switch (item) {
	case "paper":
		bouquet.setWrapper(buildWrapper(new PaperBuilder()));
		break;
		
	case "cellophane":
		bouquet.setWrapper(buildWrapper(new CellophaneBuilder()));
		break;
		
	case "ribbon":
		bouquet.setWrapper(buildWrapper(new RibbonBuilder()));
		break;
	}
	
	return bouquet;
}

public Bouquet addFlower(){
	
	for(UserData uData: userBouquet.getUserDataList()) {
		bouquet.addFlower(buildFlower(new FlowerBuilder(), uData), uData.getAmount());
	}
	
	return bouquet;
}

public Wrapper buildWrapper(WrapperBuilder builder) {
	builder.build();
	return builder.getWrapper();
}

public Flower buildFlower(FlowerBuilder builder, UserData ud) throws IllegalArgumentException{
	return builder.build(ud);
	
}

public void createBouquet() {
	bouquet = new Bouquet();
	addWrapper(userBouquet.getWrapper());
	addFlower();
} 

public Bouquet getBouquet() {
	return bouquet;
}

}
