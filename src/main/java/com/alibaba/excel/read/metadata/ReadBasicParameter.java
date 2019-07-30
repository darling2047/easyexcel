package com.alibaba.excel.read.metadata;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.excel.metadata.BasicParameter;
import com.alibaba.excel.read.listener.ReadListener;

/**
 * Read basic parameter
 *
 * @author zhuangjiaju
 **/
public class ReadBasicParameter extends BasicParameter {
    /**
     * Count the number of added heads when read sheet.
     *
     * <li>0 - This Sheet has no head ,since the first row are the data
     * <li>1 - This Sheet has one row head , this is the default
     * <li>2 - This Sheet has two row head ,since the third row is the data
     */
    private Integer headRowNumber;
    /**
     * Custom type listener run after default
     */
    private List<ReadListener> customReadListenerList = new ArrayList<ReadListener>();

    public Integer getHeadRowNumber() {
        return headRowNumber;
    }

    public void setHeadRowNumber(Integer headRowNumber) {
        this.headRowNumber = headRowNumber;
    }

    public List<ReadListener> getCustomReadListenerList() {
        return customReadListenerList;
    }

    public void setCustomReadListenerList(List<ReadListener> customReadListenerList) {
        this.customReadListenerList = customReadListenerList;
    }
}