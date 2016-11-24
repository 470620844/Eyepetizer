package me.racofix.open.model;

import java.util.List;

/**
 * @User: 蜡笔小新
 * @date: 16-11-18
 * @GitHub: https://github.com/meikoz
 */

public class SectionBean {

    private int id;
    private String type;
    private Object header;
    /**
     * type : forwardFooter
     * data : {"text":"查看往期编辑精选","font":"normal","actionUrl":"eyepetizer://feed/","adTrack":null}
     */

    private FooterBean footer;
    private int count;
    private Object adTrack;
    /**
     * type : video
     * data : {"dataType":"VideoBeanForClient","id":11033,"title":"特条丨不断前行的「灯泡」","description":"MacBook Pro 最新广告「Bulbs」用人类的各项大小发明串连起来，成功表达了：电光火石的灵感推进着人类前进的脚步。而新功能 Touch bar 不禁令人想起奇异博士的大招~这次的信仰，果粉们会充值么？From Apple","provider":{"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"},"category":"广告","author":null,"cover":{"feed":"http://img.kaiyanapp.com/16cacffafbd36a695d5760ecd3bb9a72.jpeg?imageMogr2/quality/60","detail":"http://img.kaiyanapp.com/16cacffafbd36a695d5760ecd3bb9a72.jpeg?imageMogr2/quality/60","blurred":"http://img.kaiyanapp.com/38187120912d56cb40d704fdadf98c14.jpeg?imageMogr2/quality/60","sharing":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=11033&editionType=default","duration":97,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=11033","forWeibo":"http://wandou.im/3cncnb"},"releaseTime":1479438418000,"playInfo":[{"height":720,"width":1280,"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=11033&editionType=high"}],"consumption":{"collectionCount":118,"shareCount":189,"replyCount":11},"campaign":null,"waterMarks":null,"adTrack":null,"tags":[{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null},{"id":450,"name":"苹果","actionUrl":"eyepetizer://tag/450/?title=%E8%8B%B9%E6%9E%9C","adTrack":null},{"id":594,"name":"神剪辑","actionUrl":"eyepetizer://tag/594/?title=%E7%A5%9E%E5%89%AA%E8%BE%91","adTrack":null}],"type":"NORMAL","idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1479430800000,"promotion":null,"label":null,"collected":false,"played":false}
     */

    private List<ItemListBean> itemList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getHeader() {
        return header;
    }

    public void setHeader(Object header) {
        this.header = header;
    }

    public FooterBean getFooter() {
        return footer;
    }

    public void setFooter(FooterBean footer) {
        this.footer = footer;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getAdTrack() {
        return adTrack;
    }

    public void setAdTrack(Object adTrack) {
        this.adTrack = adTrack;
    }

    public List<ItemListBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBean> itemList) {
        this.itemList = itemList;
    }

    public static class FooterBean {
        private String type;
        /**
         * text : 查看往期编辑精选
         * font : normal
         * actionUrl : eyepetizer://feed/
         * adTrack : null
         */

        private DataBean data;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            private String text;
            private String font;
            private String actionUrl;
            private Object adTrack;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getFont() {
                return font;
            }

            public void setFont(String font) {
                this.font = font;
            }

            public String getActionUrl() {
                return actionUrl;
            }

            public void setActionUrl(String actionUrl) {
                this.actionUrl = actionUrl;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }
        }
    }

    public static class ItemListBean {
        private String type;
        /**
         * dataType : VideoBeanForClient
         * id : 11033
         * title : 特条丨不断前行的「灯泡」
         * description : MacBook Pro 最新广告「Bulbs」用人类的各项大小发明串连起来，成功表达了：电光火石的灵感推进着人类前进的脚步。而新功能 Touch bar 不禁令人想起奇异博士的大招~这次的信仰，果粉们会充值么？From Apple
         * provider : {"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"}
         * category : 广告
         * author : null
         * cover : {"feed":"http://img.kaiyanapp.com/16cacffafbd36a695d5760ecd3bb9a72.jpeg?imageMogr2/quality/60","detail":"http://img.kaiyanapp.com/16cacffafbd36a695d5760ecd3bb9a72.jpeg?imageMogr2/quality/60","blurred":"http://img.kaiyanapp.com/38187120912d56cb40d704fdadf98c14.jpeg?imageMogr2/quality/60","sharing":null}
         * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=11033&editionType=default
         * duration : 97
         * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=11033","forWeibo":"http://wandou.im/3cncnb"}
         * releaseTime : 1479438418000
         * playInfo : [{"height":720,"width":1280,"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=11033&editionType=high"}]
         * consumption : {"collectionCount":118,"shareCount":189,"replyCount":11}
         * campaign : null
         * waterMarks : null
         * adTrack : null
         * tags : [{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null},{"id":450,"name":"苹果","actionUrl":"eyepetizer://tag/450/?title=%E8%8B%B9%E6%9E%9C","adTrack":null},{"id":594,"name":"神剪辑","actionUrl":"eyepetizer://tag/594/?title=%E7%A5%9E%E5%89%AA%E8%BE%91","adTrack":null}]
         * type : NORMAL
         * idx : 0
         * shareAdTrack : null
         * favoriteAdTrack : null
         * webAdTrack : null
         * date : 1479430800000
         * promotion : null
         * label : null
         * collected : false
         * played : false
         */

        private DataBean data;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            private String dataType;
            private int id;
            private String title;
            private String description;
            /**
             * name : YouTube
             * alias : youtube
             * icon : http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png
             */

            private ProviderBean provider;
            private String category;
            private Object author;
            /**
             * feed : http://img.kaiyanapp.com/16cacffafbd36a695d5760ecd3bb9a72.jpeg?imageMogr2/quality/60
             * detail : http://img.kaiyanapp.com/16cacffafbd36a695d5760ecd3bb9a72.jpeg?imageMogr2/quality/60
             * blurred : http://img.kaiyanapp.com/38187120912d56cb40d704fdadf98c14.jpeg?imageMogr2/quality/60
             * sharing : null
             */

            private CoverBean cover;
            private String playUrl;
            private int duration;
            /**
             * raw : http://www.eyepetizer.net/detail.html?vid=11033
             * forWeibo : http://wandou.im/3cncnb
             */

            private WebUrlBean webUrl;
            private long releaseTime;
            /**
             * collectionCount : 118
             * shareCount : 189
             * replyCount : 11
             */

            private ConsumptionBean consumption;
            private Object campaign;
            private Object waterMarks;
            private Object adTrack;
            private String type;
            private int idx;
            private Object shareAdTrack;
            private Object favoriteAdTrack;
            private Object webAdTrack;
            private long date;
            private Object promotion;
            private Object label;
            private boolean collected;
            private boolean played;
            //二级类别
            private List<ItemListBean> itemList;
            private HeaderBean header;

            public HeaderBean getHeader() {
                return header;
            }

            public void setHeader(HeaderBean header) {
                this.header = header;
            }

            public List<ItemListBean> getItemList() {
                return itemList;
            }

            public void setItemList(List<ItemListBean> itemList) {
                this.itemList = itemList;
            }

            /**
             * height : 720
             * width : 1280
             * name : 高清
             * type : high
             * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=11033&editionType=high
             */

            private List<PlayInfoBean> playInfo;
            /**
             * id : 16
             * name : 广告
             * actionUrl : eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A
             * adTrack : null
             */

            private List<TagsBean> tags;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public ProviderBean getProvider() {
                return provider;
            }

            public void setProvider(ProviderBean provider) {
                this.provider = provider;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public Object getAuthor() {
                return author;
            }

            public void setAuthor(Object author) {
                this.author = author;
            }

            public CoverBean getCover() {
                return cover;
            }

            public void setCover(CoverBean cover) {
                this.cover = cover;
            }

            public String getPlayUrl() {
                return playUrl;
            }

            public void setPlayUrl(String playUrl) {
                this.playUrl = playUrl;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public WebUrlBean getWebUrl() {
                return webUrl;
            }

            public void setWebUrl(WebUrlBean webUrl) {
                this.webUrl = webUrl;
            }

            public long getReleaseTime() {
                return releaseTime;
            }

            public void setReleaseTime(long releaseTime) {
                this.releaseTime = releaseTime;
            }

            public ConsumptionBean getConsumption() {
                return consumption;
            }

            public void setConsumption(ConsumptionBean consumption) {
                this.consumption = consumption;
            }

            public Object getCampaign() {
                return campaign;
            }

            public void setCampaign(Object campaign) {
                this.campaign = campaign;
            }

            public Object getWaterMarks() {
                return waterMarks;
            }

            public void setWaterMarks(Object waterMarks) {
                this.waterMarks = waterMarks;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getIdx() {
                return idx;
            }

            public void setIdx(int idx) {
                this.idx = idx;
            }

            public Object getShareAdTrack() {
                return shareAdTrack;
            }

            public void setShareAdTrack(Object shareAdTrack) {
                this.shareAdTrack = shareAdTrack;
            }

            public Object getFavoriteAdTrack() {
                return favoriteAdTrack;
            }

            public void setFavoriteAdTrack(Object favoriteAdTrack) {
                this.favoriteAdTrack = favoriteAdTrack;
            }

            public Object getWebAdTrack() {
                return webAdTrack;
            }

            public void setWebAdTrack(Object webAdTrack) {
                this.webAdTrack = webAdTrack;
            }

            public long getDate() {
                return date;
            }

            public void setDate(long date) {
                this.date = date;
            }

            public Object getPromotion() {
                return promotion;
            }

            public void setPromotion(Object promotion) {
                this.promotion = promotion;
            }

            public Object getLabel() {
                return label;
            }

            public void setLabel(Object label) {
                this.label = label;
            }

            public boolean isCollected() {
                return collected;
            }

            public void setCollected(boolean collected) {
                this.collected = collected;
            }

            public boolean isPlayed() {
                return played;
            }

            public void setPlayed(boolean played) {
                this.played = played;
            }

            public List<PlayInfoBean> getPlayInfo() {
                return playInfo;
            }

            public void setPlayInfo(List<PlayInfoBean> playInfo) {
                this.playInfo = playInfo;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class HeaderBean {
                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getFont() {
                    return font;
                }

                public void setFont(String font) {
                    this.font = font;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                private int id;
                private String title;
                private String font;
                private String cover;
                private String actionUrl;
            }

            public static class ProviderBean {
                private String name;
                private String alias;
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAlias() {
                    return alias;
                }

                public void setAlias(String alias) {
                    this.alias = alias;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class CoverBean {
                private String feed;
                private String detail;
                private String blurred;
                private Object sharing;

                public String getFeed() {
                    return feed;
                }

                public void setFeed(String feed) {
                    this.feed = feed;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getBlurred() {
                    return blurred;
                }

                public void setBlurred(String blurred) {
                    this.blurred = blurred;
                }

                public Object getSharing() {
                    return sharing;
                }

                public void setSharing(Object sharing) {
                    this.sharing = sharing;
                }
            }

            public static class WebUrlBean {
                private String raw;
                private String forWeibo;

                public String getRaw() {
                    return raw;
                }

                public void setRaw(String raw) {
                    this.raw = raw;
                }

                public String getForWeibo() {
                    return forWeibo;
                }

                public void setForWeibo(String forWeibo) {
                    this.forWeibo = forWeibo;
                }
            }

            public static class ConsumptionBean {
                private int collectionCount;
                private int shareCount;
                private int replyCount;

                public int getCollectionCount() {
                    return collectionCount;
                }

                public void setCollectionCount(int collectionCount) {
                    this.collectionCount = collectionCount;
                }

                public int getShareCount() {
                    return shareCount;
                }

                public void setShareCount(int shareCount) {
                    this.shareCount = shareCount;
                }

                public int getReplyCount() {
                    return replyCount;
                }

                public void setReplyCount(int replyCount) {
                    this.replyCount = replyCount;
                }
            }

            public static class PlayInfoBean {
                private int height;
                private int width;
                private String name;
                private String type;
                private String url;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class TagsBean {
                private int id;
                private String name;
                private String actionUrl;
                private Object adTrack;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }
            }
        }
    }
}
