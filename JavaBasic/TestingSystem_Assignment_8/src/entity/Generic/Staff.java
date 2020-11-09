package entity.Generic;

public class Staff<K> {
	private K id;
	private String name;

	public Staff(K id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public K getId() {
		return id;
	}

	public void setId(K id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
