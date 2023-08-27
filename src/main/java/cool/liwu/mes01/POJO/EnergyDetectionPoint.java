package cool.liwu.mes01.POJO;

public class EnergyDetectionPoint {
    private Integer id;
    private String pointName;
    private String pointAddress;
    private Double realTimePower;
    private Double realTimeVoltage;
    private Integer status;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public String getPointAddress() {
        return pointAddress;
    }

    public void setPointAddress(String pointAddress) {
        this.pointAddress = pointAddress;
    }

    public Double getRealTimePower() {
        return realTimePower;
    }

    public void setRealTimePower(Double realTimePower) {
        this.realTimePower = realTimePower;
    }

    public Double getRealTimeVoltage() {
        return realTimeVoltage;
    }

    public void setRealTimeVoltage(Double realTimeVoltage) {
        this.realTimeVoltage = realTimeVoltage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
