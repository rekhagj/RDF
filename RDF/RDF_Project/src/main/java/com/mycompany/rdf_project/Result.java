/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rdf_project;

import java.util.Objects;

/**
 *
 * @author rekha
 */
public class Result {
    
    private String  x;
    private String y ;
    private String z ;
    private String xx;

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String getZ() {
        return z;
    }

    public String getXx() {
        return xx;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.x);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Result other = (Result) obj;
        if (!Objects.equals(this.x, other.x)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Result{" + "x=" + x + ", y=" + y + ", z=" + z + ", xx=" + xx + '}';
    }

   
    
    
}
