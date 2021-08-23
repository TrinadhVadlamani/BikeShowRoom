
public class Car {
	
		private String name;
		private String model;
		private String type;
		private int engineCC;
		private double price;
		
		public Car() {
			super();
		}

		public Car(String name, String model, String type, int engineCC, double price) {
			super();
			this.name = name;
			this.model = model;
			this.type = type;
			this.engineCC = engineCC;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getEngineCC() {
			return engineCC;
		}

		public void setEngineCC(int engineCC) {
			this.engineCC = engineCC;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

	
		
	}


