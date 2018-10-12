package demohystrixuserphone.demohystrixcar.entity;

import java.util.Date;

public class GpsInfo {
    private String id;

    private String carId;

    private String gpsLoginType;

    private String gpsUsername;

    private String gpsPassword;

    private String lostAddress;

    private String status;

    private Date addTime;

    private String addManager;

    private Date updateTime;

    private String updateManager;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getGpsLoginType() {
        return gpsLoginType;
    }

    public void setGpsLoginType(String gpsLoginType) {
        this.gpsLoginType = gpsLoginType == null ? null : gpsLoginType.trim();
    }

    public String getGpsUsername() {
        return gpsUsername;
    }

    public void setGpsUsername(String gpsUsername) {
        this.gpsUsername = gpsUsername == null ? null : gpsUsername.trim();
    }

    public String getGpsPassword() {
        return gpsPassword;
    }

    public void setGpsPassword(String gpsPassword) {
        this.gpsPassword = gpsPassword == null ? null : gpsPassword.trim();
    }

    public String getLostAddress() {
        return lostAddress;
    }

    public void setLostAddress(String lostAddress) {
        this.lostAddress = lostAddress == null ? null : lostAddress.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAddManager() {
        return addManager;
    }

    public void setAddManager(String addManager) {
        this.addManager = addManager == null ? null : addManager.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateManager() {
        return updateManager;
    }

    public void setUpdateManager(String updateManager) {
        this.updateManager = updateManager == null ? null : updateManager.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {

        this.remark = remark == null ? null : remark.trim();
    }


    @Override
    public String toString() {
        return "GpsInfo{" +
                "id='" + id + '\'' +
                ", carId='" + carId + '\'' +
                ", gpsLoginType='" + gpsLoginType + '\'' +
                ", gpsUsername='" + gpsUsername + '\'' +
                ", gpsPassword='" + gpsPassword + '\'' +
                ", lostAddress='" + lostAddress + '\'' +
                ", status='" + status + '\'' +
                ", addTime=" + addTime +
                ", addManager='" + addManager + '\'' +
                ", updateTime=" + updateTime +
                ", updateManager='" + updateManager + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}