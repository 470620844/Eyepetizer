package me.racofix.open.model;

import java.util.List;

/**
 * @User: 蜡笔小新
 * @date: 16-11-28
 * @GitHub: https://github.com/meikoz
 */

public class DataListBean {
    private String dataType;
    private List<DiscoveryBean.ItemListBean<DataBean>> itemList;
    private int count;

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public List<DiscoveryBean.ItemListBean<DataBean>> getItemList() {
        return itemList;
    }

    public void setItemList(List<DiscoveryBean.ItemListBean<DataBean>> itemList) {
        this.itemList = itemList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
