class Watch{
	String brand;
	double price;
	String type;
	boolean waterproof;
	String strap;

	Watch(String brand,
	double price,
	String type,
	boolean waterproof,
	String strap){

		this.brand = brand;
		this.price = price;
		this.type = type;
		this.waterproof = waterproof;
		this.strap = strap;

		System.out.println("OOO");
	}

	public void disPlayWatch(){
		System.out.println("Brand "+ brand);
		System.out.println("Price "+ price);
		System.out.println("type "+ type);
		System.out.println("waterproof "+ waterproof);
		System.out.println("strap "+ strap);
	}


	}

