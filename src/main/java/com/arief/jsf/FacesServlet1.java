package com.arief.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


public class FacesServlet1 {
    private String h = "Hello";


    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }


    public String goToDataPage(){
        return "pages/data-page";
    }

}
