package Teaching;



	class OuterClass//1st class--outer class
	{
		int x = 10;
		
		class InnerClass// 2nd Class--inner Class
		{
			int y = 5;
		}
	}

	
	    public class JavaInnerClass1 {
		public static void main (String[] args) {
			OuterClass myOuter = new OuterClass();
			//OuterClassName.InnerClassName InnerClassobject=OuterClassobject.new InnerClass
			OuterClass.InnerClass myInner = myOuter.new InnerClass();
			System.out.println(myInner.y + myOuter.x);
			
		}
	}

