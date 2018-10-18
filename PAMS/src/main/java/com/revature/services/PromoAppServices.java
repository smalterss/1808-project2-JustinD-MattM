package com.revature.services;

import com.revature.dao.PromoAppDao;
import com.revature.pojos.PromoApp;

public class PromoAppServices extends PromoAppDao{

	  public void updateSupervisorApproval(PromoApp p) {
		  p.setSupevisorApproval(true);
	  }
	  
	  public void updateMaangerApproval(PromoApp p) {
		  p.setManagerApproval(true);
	  }
	  
	  public void updateStoreManagerApproval(PromoApp p) {
		  p.setStoreManagerApproval(true);
	  }
}
