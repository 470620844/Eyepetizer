package me.racofix.open.model;

import java.util.List;

/**
 * @User: 蜡笔小新
 * @date: 16-11-18
 * @GitHub: https://github.com/meikoz
 */

public class HomeBean {
    private long date;
    private long nextPublishTime;
    private int count;
    private String nextPageUrl;
    private Object dialog;
    private List<SectionBean> sectionList;

    public long getDate() {
        return date;
    }

    public long getNextPublishTime() {
        return nextPublishTime;
    }

    public int getCount() {
        return count;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public Object getDialog() {
        return dialog;
    }

    public List<SectionBean> getSectionList() {
        return sectionList;
    }
}
