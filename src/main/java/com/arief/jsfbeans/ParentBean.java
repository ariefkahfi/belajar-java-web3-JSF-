package com.arief.jsfbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="parentBean",eager = true)
@RequestScoped
public class ParentBean {


    @ManagedProperty(value = "#{childBean}")
    private ChildBean child;


    private String childBeanName="There is no ChildBean";

    public String getChildBeanName() {
       // System.out.println("getChildBeanName()");

       if(child.getChildName()!=null){
          return child.getChildName();
       }
       return childBeanName;
    }

    public void setChildBeanName(String childBeanName) {
        this.childBeanName = childBeanName;
    }

    public ChildBean getChild() {
        return child;
    }

    public void setChild(ChildBean child) {
        this.child = child;
    }
}
