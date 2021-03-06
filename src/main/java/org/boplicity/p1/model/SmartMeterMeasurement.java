package org.boplicity.p1.model;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.math.BigDecimal;

public class SmartMeterMeasurement implements Serializable {

    private DateTime timestamp;
    private BigDecimal electricityConsumptionLowRateKwh;
    private BigDecimal electricityConsumptionNormalRateKwh;
    private BigDecimal electricityProductionLowRateKwh;
    private BigDecimal electricityProductionNormalRateKwh;
    private BigDecimal currentPowerConsumptionW;
    private BigDecimal currentPowerProductionW;
    private BigDecimal gasConsumptionM3;

    public DateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getElectricityConsumptionLowRateKwh() {
        return electricityConsumptionLowRateKwh;
    }

    public void setElectricityConsumptionLowRateKwh(BigDecimal electricityConsumptionLowRateKwh) {
        this.electricityConsumptionLowRateKwh = electricityConsumptionLowRateKwh;
    }

    public BigDecimal getElectricityConsumptionNormalRateKwh() {
        return electricityConsumptionNormalRateKwh;
    }

    public void setElectricityConsumptionNormalRateKwh(BigDecimal electricityConsumptionNormalRateKwh) {
        this.electricityConsumptionNormalRateKwh = electricityConsumptionNormalRateKwh;
    }

    public BigDecimal getElectricityProductionLowRateKwh() {
        return electricityProductionLowRateKwh;
    }

    public void setElectricityProductionLowRateKwh(BigDecimal electricityProductionLowRateKwh) {
        this.electricityProductionLowRateKwh = electricityProductionLowRateKwh;
    }

    public BigDecimal getElectricityProductionNormalRateKwh() {
        return electricityProductionNormalRateKwh;
    }

    public void setElectricityProductionNormalRateKwh(BigDecimal electricityProductionNormalRateKwh) {
        this.electricityProductionNormalRateKwh = electricityProductionNormalRateKwh;
    }

    public BigDecimal getCurrentPowerConsumptionW() {
        return currentPowerConsumptionW;
    }

    public void setCurrentPowerConsumptionW(BigDecimal currentPowerConsumptionW) {
        this.currentPowerConsumptionW = currentPowerConsumptionW;
    }

    public BigDecimal getCurrentPowerProductionW() {
        return currentPowerProductionW;
    }

    public void setCurrentPowerProductionW(BigDecimal currentPowerProductionW) {
        this.currentPowerProductionW = currentPowerProductionW;
    }

    public BigDecimal getGasConsumptionM3() {
        return gasConsumptionM3;
    }

    public void setGasConsumptionM3(BigDecimal gasConsumptionM3) {
        this.gasConsumptionM3 = gasConsumptionM3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmartMeterMeasurement that = (SmartMeterMeasurement) o;

        if (currentPowerConsumptionW != null ? !currentPowerConsumptionW.equals(that.currentPowerConsumptionW) : that.currentPowerConsumptionW != null)
            return false;
        if (currentPowerProductionW != null ? !currentPowerProductionW.equals(that.currentPowerProductionW) : that.currentPowerProductionW != null)
            return false;
        if (electricityConsumptionLowRateKwh != null ? !electricityConsumptionLowRateKwh.equals(that.electricityConsumptionLowRateKwh) : that.electricityConsumptionLowRateKwh != null)
            return false;
        if (electricityConsumptionNormalRateKwh != null ? !electricityConsumptionNormalRateKwh.equals(that.electricityConsumptionNormalRateKwh) : that.electricityConsumptionNormalRateKwh != null)
            return false;
        if (electricityProductionLowRateKwh != null ? !electricityProductionLowRateKwh.equals(that.electricityProductionLowRateKwh) : that.electricityProductionLowRateKwh != null)
            return false;
        if (electricityProductionNormalRateKwh != null ? !electricityProductionNormalRateKwh.equals(that.electricityProductionNormalRateKwh) : that.electricityProductionNormalRateKwh != null)
            return false;
        if (gasConsumptionM3 != null ? !gasConsumptionM3.equals(that.gasConsumptionM3) : that.gasConsumptionM3 != null)
            return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = timestamp != null ? timestamp.hashCode() : 0;
        result = 31 * result + (electricityConsumptionLowRateKwh != null ? electricityConsumptionLowRateKwh.hashCode() : 0);
        result = 31 * result + (electricityConsumptionNormalRateKwh != null ? electricityConsumptionNormalRateKwh.hashCode() : 0);
        result = 31 * result + (electricityProductionLowRateKwh != null ? electricityProductionLowRateKwh.hashCode() : 0);
        result = 31 * result + (electricityProductionNormalRateKwh != null ? electricityProductionNormalRateKwh.hashCode() : 0);
        result = 31 * result + (currentPowerConsumptionW != null ? currentPowerConsumptionW.hashCode() : 0);
        result = 31 * result + (currentPowerProductionW != null ? currentPowerProductionW.hashCode() : 0);
        result = 31 * result + (gasConsumptionM3 != null ? gasConsumptionM3.hashCode() : 0);
        return result;
    }
}
