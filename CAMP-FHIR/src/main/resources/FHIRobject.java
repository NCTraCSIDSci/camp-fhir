package main.resources;

public class FHIRobject {
	int Level = 0;
	String Name = null;
	String HibernateName = null;
	String MethodName = null;
	String Param = null;
	String ReturnType = null;
	String MethodDeclaringClass = null;
	String xType = null;
	public FHIRobject(FHIRobject that) {
	 	this(that.Level ,
			    that.Name ,
			    that.HibernateName ,
			    that.MethodName ,
			    that.Param ,
			    that.ReturnType,
			    that.MethodDeclaringClass ,
			    that.xType );
	}
	public FHIRobject(int level, String name, String hibernateName, String methodName, String param,
		String returnType, String methodDeclaringClass, String xType) {
		this.Level = level;
		this.Name = name;
		this.HibernateName = hibernateName;
		this.MethodName = methodName;
		this.Param = param;
		this.ReturnType = returnType;
		this.MethodDeclaringClass = methodDeclaringClass;
		this.xType = xType;
}
	
	public FHIRobject() {
		
	}
	public void printClass() {

		System.out.println("Level: "+ Level );
		System.out.println("HibernateName: "+ HibernateName );
		System.out.println( "Name: " +Name);
		System.out.println("MethodName: " +MethodName);
		System.out.println("      Param:" + Param);
        System.out.println("      ReturnType:" + ReturnType);
		System.out.println("      MethodDeclaringClass:" + MethodDeclaringClass);
		System.out.println("      xType:" + xType);
	  }

}
