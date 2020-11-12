package entity.innerClass;

public class CPU {
	public int price;

	public class Processor {
		private int coreAmount;
		private int menufacturer;

		public float getCache() {
			return 4.3f;
		}

		public Processor(int coreAmount, int menufacturer) {
			super();
			this.coreAmount = coreAmount;
			this.menufacturer = menufacturer;
		}

	}

	public class Ram {
		private int memmory;
		private int menufacturer;

		public float getClockSpeed() {
			return 5.5f;
		}

		public Ram(int memmory, int menufacturer) {
			super();
			this.memmory = memmory;
			this.menufacturer = menufacturer;
		}

	}

	public CPU(int price) {
		super();
		this.price = price;
	}



}
