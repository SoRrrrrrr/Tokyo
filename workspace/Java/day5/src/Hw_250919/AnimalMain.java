package Hw_250919;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalDAO dao = new AnimalDAO();
		AnimalService service = new AnimalService(dao);
		AnimalController controller = new AnimalController(service);
		
		controller.run();
	}

}
