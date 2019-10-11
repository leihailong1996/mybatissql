package com.baosight.shgt.service.support.vo;

import java.io.Serializable;

public class TCsBizAttachmentVo
        implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String bizAttachmentId;
    private String attachmentId;
    private String bizId;
    private String bizObj;
    private String bizType;
    private String createPerson;
    private String createDate;
    private String modiPerson;
    private String modiDate;
    private String fileName;
    private String extName;
    private Long fileSize;
    private String filePath;
    private String uploadDate;
    private String fileFrom;
    private String importDate;

    public String getBizAttachmentId()
    {
        return this.bizAttachmentId;
    }

    public String getAttachmentId() {
        return this.attachmentId;
    }

    public String getBizId() {
        return this.bizId;
    }

    public String getBizObj() {
        return this.bizObj;
    }

    public String getBizType() {
        return this.bizType;
    }

    public String getCreatePerson() {
        return this.createPerson;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public String getModiPerson() {
        return this.modiPerson;
    }

    public String getModiDate() {
        return this.modiDate;
    }

    public String getFileName()
    {
        return this.fileName;
    }

    public String getExtName() {
        return this.extName;
    }

    public Long getFileSize() {
        return this.fileSize;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getUploadDate() {
        return this.uploadDate;
    }

    public String getFileFrom() {
        return this.fileFrom;
    }

    public String getImportDate() {
        return this.importDate;
    }

    public void setBizAttachmentId(String bizAttachmentId)
    {
        this.bizAttachmentId = bizAttachmentId; }
    public void setAttachmentId(String attachmentId) { this.attachmentId = attachmentId; }
    public void setBizId(String bizId) { this.bizId = bizId; }
    public void setBizObj(String bizObj) { this.bizObj = bizObj; }
    public void setBizType(String bizType) { this.bizType = bizType; }
    public void setCreatePerson(String createPerson) { this.createPerson = createPerson; }
    public void setCreateDate(String createDate) { this.createDate = createDate; }
    public void setModiPerson(String modiPerson) { this.modiPerson = modiPerson; }
    public void setModiDate(String modiDate) { this.modiDate = modiDate; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    public void setExtName(String extName) { this.extName = extName; }
    public void setFileSize(Long fileSize) { this.fileSize = fileSize; }
    public void setFilePath(String filePath) { this.filePath = filePath; }
    public void setUploadDate(String uploadDate) { this.uploadDate = uploadDate; }
    public void setFileFrom(String fileFrom) { this.fileFrom = fileFrom; }
    public void setImportDate(String importDate) { this.importDate = importDate; }
    public boolean equals(Object o) { if (o == this) return true; if (!(o instanceof TCsBizAttachmentVo)) return false; TCsBizAttachmentVo other = (TCsBizAttachmentVo)o; if (!other.canEqual(this)) return false; Object this$bizAttachmentId = getBizAttachmentId(); Object other$bizAttachmentId = other.getBizAttachmentId(); if (this$bizAttachmentId == null ? other$bizAttachmentId != null : !this$bizAttachmentId.equals(other$bizAttachmentId)) return false; Object this$attachmentId = getAttachmentId(); Object other$attachmentId = other.getAttachmentId(); if (this$attachmentId == null ? other$attachmentId != null : !this$attachmentId.equals(other$attachmentId)) return false; Object this$bizId = getBizId(); Object other$bizId = other.getBizId(); if (this$bizId == null ? other$bizId != null : !this$bizId.equals(other$bizId)) return false; Object this$bizObj = getBizObj(); Object other$bizObj = other.getBizObj(); if (this$bizObj == null ? other$bizObj != null : !this$bizObj.equals(other$bizObj)) return false; Object this$bizType = getBizType(); Object other$bizType = other.getBizType(); if (this$bizType == null ? other$bizType != null : !this$bizType.equals(other$bizType)) return false; Object this$createPerson = getCreatePerson(); Object other$createPerson = other.getCreatePerson(); if (this$createPerson == null ? other$createPerson != null : !this$createPerson.equals(other$createPerson)) return false; Object this$createDate = getCreateDate(); Object other$createDate = other.getCreateDate(); if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate)) return false; Object this$modiPerson = getModiPerson(); Object other$modiPerson = other.getModiPerson(); if (this$modiPerson == null ? other$modiPerson != null : !this$modiPerson.equals(other$modiPerson)) return false; Object this$modiDate = getModiDate(); Object other$modiDate = other.getModiDate(); if (this$modiDate == null ? other$modiDate != null : !this$modiDate.equals(other$modiDate)) return false; Object this$fileName = getFileName(); Object other$fileName = other.getFileName(); if (this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName)) return false; Object this$extName = getExtName(); Object other$extName = other.getExtName(); if (this$extName == null ? other$extName != null : !this$extName.equals(other$extName)) return false; Object this$fileSize = getFileSize(); Object other$fileSize = other.getFileSize(); if (this$fileSize == null ? other$fileSize != null : !this$fileSize.equals(other$fileSize)) return false; Object this$filePath = getFilePath(); Object other$filePath = other.getFilePath(); if (this$filePath == null ? other$filePath != null : !this$filePath.equals(other$filePath)) return false; Object this$uploadDate = getUploadDate(); Object other$uploadDate = other.getUploadDate(); if (this$uploadDate == null ? other$uploadDate != null : !this$uploadDate.equals(other$uploadDate)) return false; Object this$fileFrom = getFileFrom(); Object other$fileFrom = other.getFileFrom(); if (this$fileFrom == null ? other$fileFrom != null : !this$fileFrom.equals(other$fileFrom)) return false; Object this$importDate = getImportDate(); Object other$importDate = other.getImportDate(); return this$importDate == null ? other$importDate == null : this$importDate.equals(other$importDate); }
    protected boolean canEqual(Object other) { return other instanceof TCsBizAttachmentVo; }
    public int hashCode() { int PRIME = 59; int result = 1; Object $bizAttachmentId = getBizAttachmentId(); result = result * 59 + ($bizAttachmentId == null ? 43 : $bizAttachmentId.hashCode()); Object $attachmentId = getAttachmentId(); result = result * 59 + ($attachmentId == null ? 43 : $attachmentId.hashCode()); Object $bizId = getBizId(); result = result * 59 + ($bizId == null ? 43 : $bizId.hashCode()); Object $bizObj = getBizObj(); result = result * 59 + ($bizObj == null ? 43 : $bizObj.hashCode()); Object $bizType = getBizType(); result = result * 59 + ($bizType == null ? 43 : $bizType.hashCode()); Object $createPerson = getCreatePerson(); result = result * 59 + ($createPerson == null ? 43 : $createPerson.hashCode()); Object $createDate = getCreateDate(); result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode()); Object $modiPerson = getModiPerson(); result = result * 59 + ($modiPerson == null ? 43 : $modiPerson.hashCode()); Object $modiDate = getModiDate(); result = result * 59 + ($modiDate == null ? 43 : $modiDate.hashCode()); Object $fileName = getFileName(); result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode()); Object $extName = getExtName(); result = result * 59 + ($extName == null ? 43 : $extName.hashCode()); Object $fileSize = getFileSize(); result = result * 59 + ($fileSize == null ? 43 : $fileSize.hashCode()); Object $filePath = getFilePath(); result = result * 59 + ($filePath == null ? 43 : $filePath.hashCode()); Object $uploadDate = getUploadDate(); result = result * 59 + ($uploadDate == null ? 43 : $uploadDate.hashCode()); Object $fileFrom = getFileFrom(); result = result * 59 + ($fileFrom == null ? 43 : $fileFrom.hashCode()); Object $importDate = getImportDate(); result = result * 59 + ($importDate == null ? 43 : $importDate.hashCode()); return result; }
    public String toString() { return "TCsBizAttachmentVo(bizAttachmentId=" + getBizAttachmentId() + ", attachmentId=" + getAttachmentId() + ", bizId=" + getBizId() + ", bizObj=" + getBizObj() + ", bizType=" + getBizType() + ", createPerson=" + getCreatePerson() + ", createDate=" + getCreateDate() + ", modiPerson=" + getModiPerson() + ", modiDate=" + getModiDate() + ", fileName=" + getFileName() + ", extName=" + getExtName() + ", fileSize=" + getFileSize() + ", filePath=" + getFilePath() + ", uploadDate=" + getUploadDate() + ", fileFrom=" + getFileFrom() + ", importDate=" + getImportDate() + ")"; }

}