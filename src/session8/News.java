package session8;

public class News implements INews{
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    int[] RateList = new int[3];

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title : " +Title);
        System.out.println("PublishDate : " +PublishDate);
        System.out.println("Author : " +Author);
        System.out.println("Content : " +Content);
        System.out.println("AverageRate : " +AverageRate);
    }

    void Calculate() {
        for(int i : RateList){
            AverageRate += i;
        }
        AverageRate /= RateList.length;
    }
}
