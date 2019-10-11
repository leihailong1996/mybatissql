package com.baosight.shgt.service.pay.persistence.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PayingVO
        implements Serializable
{
    private List<String> payTypeList;
    private List<String> channelCodeList;
    private List<String> dependNoteCodeList;



    public List<String> getPayTypeList()
    {
        return this.payTypeList; }
    public List<String> getChannelCodeList() { return this.channelCodeList; }
    public List<String> getDependNoteCodeList() { return this.dependNoteCodeList; }


    public void setPayTypeList(List<String> payTypeList)
    {
        this.payTypeList = payTypeList; }
    public void setChannelCodeList(List<String> channelCodeList) { this.channelCodeList = channelCodeList; }
    public void setDependNoteCodeList(List<String> dependNoteCodeList) { this.dependNoteCodeList = dependNoteCodeList; }

}