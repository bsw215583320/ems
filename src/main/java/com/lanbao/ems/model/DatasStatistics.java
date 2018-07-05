package com.lanbao.ems.model;

import java.util.Date;

public class DatasStatistics {
    private String id;
    private Date timestamp;
    private String circuit;
    private Double active;
    private Double reactive;
    private String remark;

    public DatasStatistics() {
    }

    public DatasStatistics(String id, Date timestamp, String circuit, Double active, Double reactive, String remark) {
        this.id = id;
        this.timestamp = timestamp;
        this.circuit = circuit;
        this.active = active;
        this.reactive = reactive;
        this.remark = remark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public Double getActive() {
        return active;
    }

    public void setActive(Double active) {
        this.active = active;
    }

    public Double getReactive() {
        return reactive;
    }

    public void setReactive(Double reactive) {
        this.reactive = reactive;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
