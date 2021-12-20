package uni.due.collection.List;

import java.util.Date;

public class Notice {
    private int id;
    private String title;
    private String creator;
    private Date createtime;

    public Notice(int id,String title,String creator,Date time)
    {
        super();
        this.id=id;
        this.title=title;
        this.creator=creator;
        this.createtime = time;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
