package de.vl.git.second;

public class GitTestMain {

	public static void main(String[] args) {
		System.out.println("Git is cool");
		GitTestMain thisClass = new GitTestMain();
		int i=1;
		thisClass.testParameterMethod(i++, i);
		thisClass.testParameterMethod(i, i++);
		
		System.out.println("Just for merge");

	}
	
	public void testParameterMethod(int p1, int p2){
		System.out.println("p1 = "+p1+"; p2 = "+p2);
	}

}
