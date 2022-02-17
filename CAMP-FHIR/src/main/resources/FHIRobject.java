package main.resources;

public class FHIRobject {
	int Level = 0;
	String Name = null;
	String HibernateName = null;
	String MethodName = null;
	String Param = null;
	String ReturnType = null;
	String MethodDeclaringClass = null;
	
	public void printClass() {
//		System.out.println("Level: "+ level );
//		System.out.println( "Name: " +currentMethodName);
//		System.out.println("MethodName: " +method.getName());
//      System.out.println("      ReturnType:" + method.getReturnType().getName().replace("$", "."));
//		System.out.println("      MethodDeclaringClass:" + method.getDeclaringClass().getName());
		System.out.println("Level: "+ Level );
		System.out.println("HibernateName: "+ HibernateName );
		System.out.println( "Name: " +Name);
		System.out.println("MethodName: " +MethodName);
		System.out.println("      Param:" + Param);
        System.out.println("      ReturnType:" + ReturnType);
		System.out.println("      MethodDeclaringClass:" + MethodDeclaringClass);
	  }

}
