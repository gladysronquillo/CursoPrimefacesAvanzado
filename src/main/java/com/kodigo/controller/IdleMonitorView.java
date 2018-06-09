package com.kodigo.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
@ManagedBean
public class IdleMonitorView {
     
    public void onIdle() {
       
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		//return "/index?faces-redirect=true";
    }
 
   
}