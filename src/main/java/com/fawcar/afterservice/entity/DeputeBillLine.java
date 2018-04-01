package com.fawcar.afterservice.entity;

import java.util.Date;

public class DeputeBillLine {
    private String id;

    private String nmainid;

    private String citemcode;

    private String citemname;

    private String ckind;

    private Double nmanhaurexpen;

    private Double nmanhaur;

    private Double nmanhaurdiscountrate;

    private Double nworkgroupid;

    private Integer nprimaryrepairmanid;

    private Date dtaskbegindate;

    private Date dbegindate;

    private Date dtaskfinishdate;

    private Double neffectivemanhaur;

    private String cpursueitemflag;

    private String crepairagainflag;

    private String cacrosscurrentperiodflag;

    private String cbeginflag;

    private String cfinishflag;

    private String cremark;

    private Date dtstamp;

    private String ckindback;

    private String creturnflag;

    private String creturnflag1;

    private String creturnflag2;

    private String cremindflag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNmainid() {
        return nmainid;
    }

    public void setNmainid(String nmainid) {
        this.nmainid = nmainid == null ? null : nmainid.trim();
    }

    public String getCitemcode() {
        return citemcode;
    }

    public void setCitemcode(String citemcode) {
        this.citemcode = citemcode == null ? null : citemcode.trim();
    }

    public String getCitemname() {
        return citemname;
    }

    public void setCitemname(String citemname) {
        this.citemname = citemname == null ? null : citemname.trim();
    }

    public String getCkind() {
        return ckind;
    }

    public void setCkind(String ckind) {
        this.ckind = ckind == null ? null : ckind.trim();
    }

    public Double getNmanhaurexpen() {
        return nmanhaurexpen;
    }

    public void setNmanhaurexpen(Double nmanhaurexpen) {
        this.nmanhaurexpen = nmanhaurexpen;
    }

    public Double getNmanhaur() {
        return nmanhaur;
    }

    public void setNmanhaur(Double nmanhaur) {
        this.nmanhaur = nmanhaur;
    }

    public Double getNmanhaurdiscountrate() {
        return nmanhaurdiscountrate;
    }

    public void setNmanhaurdiscountrate(Double nmanhaurdiscountrate) {
        this.nmanhaurdiscountrate = nmanhaurdiscountrate;
    }

    public Double getNworkgroupid() {
        return nworkgroupid;
    }

    public void setNworkgroupid(Double nworkgroupid) {
        this.nworkgroupid = nworkgroupid;
    }

    public Integer getNprimaryrepairmanid() {
        return nprimaryrepairmanid;
    }

    public void setNprimaryrepairmanid(Integer nprimaryrepairmanid) {
        this.nprimaryrepairmanid = nprimaryrepairmanid;
    }

    public Date getDtaskbegindate() {
        return dtaskbegindate;
    }

    public void setDtaskbegindate(Date dtaskbegindate) {
        this.dtaskbegindate = dtaskbegindate;
    }

    public Date getDbegindate() {
        return dbegindate;
    }

    public void setDbegindate(Date dbegindate) {
        this.dbegindate = dbegindate;
    }

    public Date getDtaskfinishdate() {
        return dtaskfinishdate;
    }

    public void setDtaskfinishdate(Date dtaskfinishdate) {
        this.dtaskfinishdate = dtaskfinishdate;
    }

    public Double getNeffectivemanhaur() {
        return neffectivemanhaur;
    }

    public void setNeffectivemanhaur(Double neffectivemanhaur) {
        this.neffectivemanhaur = neffectivemanhaur;
    }

    public String getCpursueitemflag() {
        return cpursueitemflag;
    }

    public void setCpursueitemflag(String cpursueitemflag) {
        this.cpursueitemflag = cpursueitemflag == null ? null : cpursueitemflag.trim();
    }

    public String getCrepairagainflag() {
        return crepairagainflag;
    }

    public void setCrepairagainflag(String crepairagainflag) {
        this.crepairagainflag = crepairagainflag == null ? null : crepairagainflag.trim();
    }

    public String getCacrosscurrentperiodflag() {
        return cacrosscurrentperiodflag;
    }

    public void setCacrosscurrentperiodflag(String cacrosscurrentperiodflag) {
        this.cacrosscurrentperiodflag = cacrosscurrentperiodflag == null ? null : cacrosscurrentperiodflag.trim();
    }

    public String getCbeginflag() {
        return cbeginflag;
    }

    public void setCbeginflag(String cbeginflag) {
        this.cbeginflag = cbeginflag == null ? null : cbeginflag.trim();
    }

    public String getCfinishflag() {
        return cfinishflag;
    }

    public void setCfinishflag(String cfinishflag) {
        this.cfinishflag = cfinishflag == null ? null : cfinishflag.trim();
    }

    public String getCremark() {
        return cremark;
    }

    public void setCremark(String cremark) {
        this.cremark = cremark == null ? null : cremark.trim();
    }

    public Date getDtstamp() {
        return dtstamp;
    }

    public void setDtstamp(Date dtstamp) {
        this.dtstamp = dtstamp;
    }

    public String getCkindback() {
        return ckindback;
    }

    public void setCkindback(String ckindback) {
        this.ckindback = ckindback == null ? null : ckindback.trim();
    }

    public String getCreturnflag() {
        return creturnflag;
    }

    public void setCreturnflag(String creturnflag) {
        this.creturnflag = creturnflag == null ? null : creturnflag.trim();
    }

    public String getCreturnflag1() {
        return creturnflag1;
    }

    public void setCreturnflag1(String creturnflag1) {
        this.creturnflag1 = creturnflag1 == null ? null : creturnflag1.trim();
    }

    public String getCreturnflag2() {
        return creturnflag2;
    }

    public void setCreturnflag2(String creturnflag2) {
        this.creturnflag2 = creturnflag2 == null ? null : creturnflag2.trim();
    }

    public String getCremindflag() {
        return cremindflag;
    }

    public void setCremindflag(String cremindflag) {
        this.cremindflag = cremindflag == null ? null : cremindflag.trim();
    }
}