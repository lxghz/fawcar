package com.fawcar.afterservice.entity;

import java.util.Date;

public class DeputeBillForm {
    private String id;

    private String ndealerid;

    private String nbranchid;

    private String cservicerequisitionno;

    private String nvehicleid;

    private String crepairstatus;



    private String cmalfunctiondescription;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNdealerid() {
        return ndealerid;
    }

    public void setNdealerid(String ndealerid) {
        this.ndealerid = ndealerid == null ? null : ndealerid.trim();
    }

    public String getNbranchid() {
        return nbranchid;
    }

    public void setNbranchid(String nbranchid) {
        this.nbranchid = nbranchid == null ? null : nbranchid.trim();
    }

    public String getCservicerequisitionno() {
        return cservicerequisitionno;
    }

    public void setCservicerequisitionno(String cservicerequisitionno) {
        this.cservicerequisitionno = cservicerequisitionno == null ? null : cservicerequisitionno.trim();
    }

    public String getNvehicleid() {
        return nvehicleid;
    }

    public void setNvehicleid(String nvehicleid) {
        this.nvehicleid = nvehicleid == null ? null : nvehicleid.trim();
    }

    public String getCrepairstatus() {
        return crepairstatus;
    }

    public void setCrepairstatus(String crepairstatus) {
        this.crepairstatus = crepairstatus == null ? null : crepairstatus.trim();
    }

    public String getCmalfunctiondescription() {
        return cmalfunctiondescription;
    }

    public void setCmalfunctiondescription(String cmalfunctiondescription) {
        this.cmalfunctiondescription = cmalfunctiondescription == null ? null : cmalfunctiondescription.trim();
    }

}