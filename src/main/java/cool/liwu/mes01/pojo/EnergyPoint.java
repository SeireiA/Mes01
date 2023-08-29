package cool.liwu.mes01.pojo;

public class EnergyPoint {
    private Long id;
    private String name; // 检测点名称
    private String address; // 检测点地址
    private double realTimePower; // 实时功率
    private double realTimeVoltage; // 实时电压
    private String status; // 状态
    private String remark; // 备注

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRealTimePower() {
        return realTimePower;
    }

    public void setRealTimePower(double realTimePower) {
        this.realTimePower = realTimePower;
    }

    public double getRealTimeVoltage() {
        return realTimeVoltage;
    }

    public void setRealTimeVoltage(double realTimeVoltage) {
        this.realTimeVoltage = realTimeVoltage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    // 省略getter和setter方法
}
