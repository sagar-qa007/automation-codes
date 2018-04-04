package TestPack;

public class innerClass1 {
	public innerClass1() {
		System.out.println("innerClass1");
	}

	class MyHelperClass {
		MyHelperClass() {
			System.out.println("MyHelperClass");
		}

		int someHelperMethod(int z, int q) {
			System.out.println("someHelperMethod");
			return q;
		}
	}

	void method1() {
	}

	int method2() {
		System.out.println("method2");
		return 0;
	}

	public void method3(int x, int y) {
		System.out.println("method3");
	}
}