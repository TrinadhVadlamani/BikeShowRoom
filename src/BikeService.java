
public class BikeService {

	public static void displayAllBikeDetails(Car[] bikes) {
		// TODO Auto-generated method stub
		for (int i = 0; i < bikes.length; i++) {
			System.out.println(" bike name:   " + bikes[i].getName());
			System.out.println("Bike model: : " + bikes[i].getModel());
			System.out.println("Bike type :  " + bikes[i].getType());
			System.out.println("Bike engine cc:  " + bikes[i].getEngineCC());
			System.out.println("Bike price :  " + bikes[i].getPrice());
		}
	}

	public static Car[] SortBikeByName(Car[] bikes) {
		if (bikes != null) {
			for (int i = 0; i < bikes.length; i++) {
				for (int j = i + 1; j < bikes.length; j++) {
					if (bikes[i].getName().compareTo(bikes[j].getName()) > 0) {
						Car temp = bikes[i];
						bikes[i] = bikes[j];
						bikes[j] = temp;
					}
				}
			}
			displayAllBikeDetails(bikes);

		} else {
			System.out.println(" no bikes prsent");
		}

		return bikes;
	}

	public static Car[] SortBikeByType(Car[] bikes) {
		if (bikes != null) {
			for (int i = 0; i < bikes.length; i++) {
				for (int j = i + 1; j < bikes.length; j++) {
					if (bikes[i].getType().compareTo(bikes[j].getType()) != 0) {

						if (bikes[i].getType().compareTo(bikes[j].getType()) > 0) {
							Car temp = bikes[i];
							bikes[i] = bikes[j];
							bikes[j] = temp;
						}

					} else {
						if (bikes[i].getEngineCC() != bikes[j].getEngineCC()) {
							Car temp = bikes[i];
							bikes[i] = bikes[j];
							bikes[j] = temp;
						}
					}
				}
			}
			displayAllBikeDetails(bikes);

		} else {
			System.out.println(" no bikes prsent");
		}

		return bikes;
	}

	

	public static int SearchBike(Car[] bikes, String name, String model) {
		int first = 0;
		int last = bikes.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
         
			if (model.compareTo(bikes[mid].getModel()) > 0 && name.compareTo(bikes[mid].getName()) > 0) {
				first = mid + 1;
			} else if (model.compareTo(bikes[mid].getModel()) == 0 && name.compareTo(bikes[mid].getName()) == 0) {
				return mid;
				
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("element  is not found!");
		}
		return -1;
	}

}
