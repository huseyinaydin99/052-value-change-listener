/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author husey
 */
@ManagedBean(name = "personel")
@RequestScoped
public class PersonelBean implements Serializable{

    /**
     * Creates a new instance of PersonelBean
     */
    private static final long serialVersionUID = 1L;
    private static Map<String,String> kisiler;
    private static String hakkinda = "Niğde Uni";
    static{
        kisiler = new LinkedHashMap<String,String>();
        kisiler.put("Huseyin Aydin", "Niğde Uni");
        kisiler.put("Hasan Ozturk", "Van Uni");
        kisiler.put("Yasemin Uslu", "Ankara Uni");
        kisiler.put("Umut Tabak", "Istanbul Uni");
    }
    
    public void personelHakkindaChanged(ValueChangeEvent e){
        hakkinda = e.getNewValue().toString();
    }

    public Map<String, String> getKisiler() {
        return kisiler;
    }

    public void setKisiler(Map<String, String> kisiler) {
        PersonelBean.kisiler = kisiler;
    }

    public String getHakkinda() {
        return hakkinda;
    }

    public void setHakkinda(String hakkinda) {
        PersonelBean.hakkinda = hakkinda;
    }
    
}
