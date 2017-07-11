/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

/**
 *
 * @author husey
 */
public class PersonelValueListener implements ValueChangeListener{

    @Override
    public void processValueChange(ValueChangeEvent vce) throws AbortProcessingException {
        //PersonelBean personelBean = (PersonelBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("personel");
        PersonelBean personelBean = new PersonelBean();
        personelBean.setHakkinda(vce.getNewValue().toString());
    }
    
}
