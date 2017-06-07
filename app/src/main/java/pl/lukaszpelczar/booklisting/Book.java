package pl.lukaszpelczar.booklisting;

/**
 * Created by Lukasz on 07/06/2017.
 */

public class Book {

    private String mUrl;
    private String mTitle;
    private String mDate;
    private String mAuthor;

    public Book(String url, String title, String date, String author){
        mUrl = url;
        mTitle = title;
        mDate = date;
        mAuthor = author;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmAuthor() {
        return mAuthor;
    }
}
