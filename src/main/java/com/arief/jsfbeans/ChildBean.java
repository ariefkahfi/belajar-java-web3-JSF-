package com.arief.jsfbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="childBean",eager = true)
@RequestScoped
public class ChildBean {
    private String childName="Child One";

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }
}
