package com.example.android.newsapp;

/**
 * Created by Fajar Fachrizal on 20.07.2017.
 */

public class News {

    public String mUrl;
    private String mTitle;
    private String mAuthor;
    private String mDate;
    private String mCategory;

    /**
     * contruct new (@link News) object
     * @param date
     * @param title
     * @param author
     * @param url
     * @param category
     */
    public News(String date, String title, String author, String url, String category) {
        mDate = date;
        mTitle = title;
        mAuthor = author;
        mUrl = url;
        mCategory = category;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public void setmAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    @Override
    public String toString() {
        return "News{" +
                ", date='" + mDate + '\'' +
                "title='" + mTitle + '\'' +
                ", author='" + mAuthor + '\'' +
                ", url='" + mUrl + '\'' +
                ", section='" + mCategory + '\'' +
                '}';
    }
}
