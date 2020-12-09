package Abstraction;

    abstract class Parent {
    	
    	
    	 abstract void message();
    	 
    	 public void text() {
    		

}
    }

    class A extends Parent {
    	
    	public void message() {
   		 System.out.println("This is first subclass");
    	
    	 }
    	
    }
    
    class D extends Parent {
    	
    	public void message() {
      		 System.out.println("This is second subclass");
    	}
    	
    }
    
    class Exercise3 {
   	 
   	 public static void main(String[] args) {
   		
   		 A a = new A();
   		 D d = new D();
   		 a.message();
   		 d.message();
   		 
   	 }
   	 
    }
