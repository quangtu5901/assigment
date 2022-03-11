/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class CEX {
    private int makettypeid;
    private String name;
    private String cexname;

    /**
     *
     */
    public CEX() {
    }

    /**
     *
     * @param makettypeid
     * @param cexname
     * @param name
     */
    public CEX(int makettypeid,  String cexname ,String name) {
        this.makettypeid = makettypeid;
        this.name = name;
        this.cexname = cexname;
    }

    /**
     *
     * @return
     */
    public int getMakettypeid() {
        return makettypeid;
    }

    /**
     *
     * @param makettypeid
     */
    public void setMakettypeid(int makettypeid) {
        this.makettypeid = makettypeid;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getCexname() {
        return cexname;
    }

    /**
     *
     * @param cexname
     */
    public void setCexname(String cexname) {
        this.cexname = cexname;
    }

    
    
    
}
