package com.lanbao.ems.model;

import java.util.Date;

public class TechnologyOffice {

    private String id;
    private Date timestamp;
    private Double voltage_a;
    private Double voltage_b;
    private Double voltage_c;
    private Double electric_a;
    private Double electric_b;
    private Double electric_c;
    private Double total_active_power;
    private Double total_reactive_power;
    private Double total_apparent_power;
    private Double total_power_factor;
    private Double total_harmonic_distortion;
    private Double io_active_power;
    private Double io_reactive_power;

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

    public Double getVoltage_a() {
        return voltage_a;
    }

    public void setVoltage_a(Double voltage_a) {
        this.voltage_a = voltage_a;
    }

    public Double getVoltage_b() {
        return voltage_b;
    }

    public void setVoltage_b(Double voltage_b) {
        this.voltage_b = voltage_b;
    }

    public Double getVoltage_c() {
        return voltage_c;
    }

    public void setVoltage_c(Double voltage_c) {
        this.voltage_c = voltage_c;
    }

    public Double getElectric_a() {
        return electric_a;
    }

    public void setElectric_a(Double electric_a) {
        this.electric_a = electric_a;
    }

    public Double getElectric_b() {
        return electric_b;
    }

    public void setElectric_b(Double electric_b) {
        this.electric_b = electric_b;
    }

    public Double getElectric_c() {
        return electric_c;
    }

    public void setElectric_c(Double electric_c) {
        this.electric_c = electric_c;
    }

    public Double getTotal_active_power() {
        return total_active_power;
    }

    public void setTotal_active_power(Double total_active_power) {
        this.total_active_power = total_active_power;
    }

    public Double getTotal_reactive_power() {
        return total_reactive_power;
    }

    public void setTotal_reactive_power(Double total_reactive_power) {
        this.total_reactive_power = total_reactive_power;
    }

    public Double getTotal_apparent_power() {
        return total_apparent_power;
    }

    public void setTotal_apparent_power(Double total_apparent_power) {
        this.total_apparent_power = total_apparent_power;
    }

    public Double getTotal_power_factor() {
        return total_power_factor;
    }

    public void setTotal_power_factor(Double total_power_factor) {
        this.total_power_factor = total_power_factor;
    }

    public Double getTotal_harmonic_distortion() {
        return total_harmonic_distortion;
    }

    public void setTotal_harmonic_distortion(Double total_harmonic_distortion) {
        this.total_harmonic_distortion = total_harmonic_distortion;
    }

    public Double getIo_active_power() {
        return io_active_power;
    }

    public void setIo_active_power(Double io_active_power) {
        this.io_active_power = io_active_power;
    }

    public Double getIo_reactive_power() {
        return io_reactive_power;
    }

    public void setIo_reactive_power(Double io_reactive_power) {
        this.io_reactive_power = io_reactive_power;
    }
}
