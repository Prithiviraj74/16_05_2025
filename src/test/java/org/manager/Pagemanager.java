package org.manager;

import org.page.Forgottenpage;
import org.page.forgottenpagelogin;

public class Pagemanager {// creating singleton for forgottenlogin and forgottenpage.
  private  forgottenpagelogin fgplogin;
  
  private  Forgottenpage forgotten; 
  public Forgottenpage getforgotten() {
  	if(forgotten==null) {
  	forgotten=new Forgottenpage();
  	}
  	return forgotten;
  }
  
public  forgottenpagelogin getfgplogin(){//create setter for creating singleton.
	if(fgplogin==null) {
	fgplogin=new forgottenpagelogin();
	}
	return fgplogin;
}

}


