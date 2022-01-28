package core.program.child;

import core.programs.N;

public class Y extends N {
	
	public static void main(String args[]) {
	    
		new X().methodProtected();
	    new X().methodDefault();
        new N().methodPublic();
	
	}

}