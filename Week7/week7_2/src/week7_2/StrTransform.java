package week7_2;

public enum StrTransform {
	TRIM{
		public void apply(String str) {
			System.out.printf("%s\n", str.trim());
		}
	},
	UPPER{
		public void apply(String str) {
			System.out.printf("%s\n", str.toUpperCase());
		}
	},
	KEBAB{
		public void apply(String str) {
			System.out.printf("%s\n", str.toLowerCase().trim().replace("_", "-").replace(" ", "-"));
		}
	};
	
	public abstract void apply(String str);
}
