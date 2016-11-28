package me.racofix.open.model;

import java.util.List;

/**
 * @User: 蜡笔小新
 * @date: 16-11-28
 * @GitHub: https://github.com/meikoz
 */

public class DiscoveryBean {
    private List<ItemListBean> itemList;

    public List<ItemListBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBean> itemList) {
        this.itemList = itemList;
    }

    public class ItemListBean<T> {
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        private String type;
        private T data;
    }
}
