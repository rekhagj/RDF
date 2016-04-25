/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rdf_project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rekha
 */
public class QueryDataResult {

   private List<String> tites = new ArrayList<String>();
   private List<Result> contents = new ArrayList<Result>();
   

    public void setDurationofCall(long durationofCall) {
        this.durationofCall = durationofCall;
    }
   private long durationofCall; 

    public long getDurationofCall() {
        return durationofCall;
    }
    public List<String> getTites() {

        return tites;
    }

    public void setTites(List<String> tites) {
        this.tites = tites;
    }

    public List<Result> getContents() {
        return contents;
    }

    public void setContents(List<Result> contents) {
        this.contents = contents;
    }

}
