package entity.Generic;

public class Phone extends MyMap {

	public Phone(Object key, Object value) {
		super(key, value);
	}

	public <V> V getPhoneNumber() {
		return (V) this.getValue();
	}

}
