package com.arief.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(eager = true)
@RequestScoped
public class FacesServlet2 {

    private String name="This is FacesServlet2";

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public String goHome(){
        return "pages/home";
    }
}
