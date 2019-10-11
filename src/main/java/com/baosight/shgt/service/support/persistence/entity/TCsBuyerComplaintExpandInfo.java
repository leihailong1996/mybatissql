package com.baosight.shgt.service.support.persistence.entity;

import java.io.Serializable;

public class TCsBuyerComplaintExpandInfo
        implements Serializable
{
    private String allotCode;
    private String allotDate;
    private String acceptCode;
    private String acceptDate;
    private String agentTag;
    private String branchStatus;
    private String reparationsMethod;

    public String getAllotCode()
    {
        return this.allotCode;
    }

    public String getAllotDate() {
        return this.allotDate;
    }

    public String getAcceptCode() {
        return this.acceptCode;
    }

    public String getAcceptDate() {
        return this.acceptDate;
    }

    public String getAgentTag() {
        return this.agentTag;
    }

    public String getBranchStatus()
    {
        return this.branchStatus;
    }

    public String getReparationsMethod()
    {
        return this.reparationsMethod;
    }

    public void setAllotCode(String allotCode)
    {
        this.allotCode = allotCode; }
    public void setAllotDate(String allotDate) { this.allotDate = allotDate; }
    public void setAcceptCode(String acceptCode) { this.acceptCode = acceptCode; }
    public void setAcceptDate(String acceptDate) { this.acceptDate = acceptDate; }
    public void setAgentTag(String agentTag) { this.agentTag = agentTag; }
    public void setBranchStatus(String branchStatus) { this.branchStatus = branchStatus; }
    public void setReparationsMethod(String reparationsMethod) { this.reparationsMethod = reparationsMethod; }
    public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof TCsBuyerComplaintExpandInfo)) return false; TCsBuyerComplaintExpandInfo other = (TCsBuyerComplaintExpandInfo)o; if (!other.canEqual(this)) return false; Object this$allotCode = getAllotCode(); Object other$allotCode = other.getAllotCode(); if (this$allotCode == null ? other$allotCode != null : !this$allotCode.equals(other$allotCode)) return false; Object this$allotDate = getAllotDate(); Object other$allotDate = other.getAllotDate(); if (this$allotDate == null ? other$allotDate != null : !this$allotDate.equals(other$allotDate)) return false; Object this$acceptCode = getAcceptCode(); Object other$acceptCode = other.getAcceptCode(); if (this$acceptCode == null ? other$acceptCode != null : !this$acceptCode.equals(other$acceptCode)) return false; Object this$acceptDate = getAcceptDate(); Object other$acceptDate = other.getAcceptDate(); if (this$acceptDate == null ? other$acceptDate != null : !this$acceptDate.equals(other$acceptDate)) return false; Object this$agentTag = getAgentTag(); Object other$agentTag = other.getAgentTag(); if (this$agentTag == null ? other$agentTag != null : !this$agentTag.equals(other$agentTag)) return false; Object this$branchStatus = getBranchStatus(); Object other$branchStatus = other.getBranchStatus(); if (this$branchStatus == null ? other$branchStatus != null : !this$branchStatus.equals(other$branchStatus)) return false; Object this$reparationsMethod = getReparationsMethod(); Object other$reparationsMethod = other.getReparationsMethod(); return this$reparationsMethod == null ? other$reparationsMethod == null : this$reparationsMethod.equals(other$reparationsMethod); }
    protected boolean canEqual(Object other) { return other instanceof TCsBuyerComplaintExpandInfo; }
    public int hashCode() { int PRIME = 59; int result = 1; Object $allotCode = getAllotCode(); result = result * 59 + ($allotCode == null ? 43 : $allotCode.hashCode()); Object $allotDate = getAllotDate(); result = result * 59 + ($allotDate == null ? 43 : $allotDate.hashCode()); Object $acceptCode = getAcceptCode(); result = result * 59 + ($acceptCode == null ? 43 : $acceptCode.hashCode()); Object $acceptDate = getAcceptDate(); result = result * 59 + ($acceptDate == null ? 43 : $acceptDate.hashCode()); Object $agentTag = getAgentTag(); result = result * 59 + ($agentTag == null ? 43 : $agentTag.hashCode()); Object $branchStatus = getBranchStatus(); result = result * 59 + ($branchStatus == null ? 43 : $branchStatus.hashCode()); Object $reparationsMethod = getReparationsMethod(); result = result * 59 + ($reparationsMethod == null ? 43 : $reparationsMethod.hashCode()); return result; }
    public String toString() { return "TCsBuyerComplaintExpandInfo(allotCode=" + getAllotCode() + ", allotDate=" + getAllotDate() + ", acceptCode=" + getAcceptCode() + ", acceptDate=" + getAcceptDate() + ", agentTag=" + getAgentTag() + ", branchStatus=" + getBranchStatus() + ", reparationsMethod=" + getReparationsMethod() + ")"; }

}