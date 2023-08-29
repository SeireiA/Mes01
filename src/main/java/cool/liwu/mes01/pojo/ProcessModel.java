package cool.liwu.mes01.pojo;

// 工艺建模数据POJO类
public class ProcessModel {
    private String id;
    private String processName;
    private String product;
    private String model;
    private String specification;
    private String unit;
    private double unitPowerConsumption;
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getUnitPowerConsumption() {
        return unitPowerConsumption;
    }

    public void setUnitPowerConsumption(double unitPowerConsumption) {
        this.unitPowerConsumption = unitPowerConsumption;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

