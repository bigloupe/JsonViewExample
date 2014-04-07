package com.mangofactory.jsonview.example;

import com.fasterxml.jackson.annotation.JsonView;
import com.mangofactory.jsonview.BaseView;

public class Book {

    @JsonView(SummaryView.class)
    private String title;
    
    @JsonView(SummaryView.class)
    private String author;
    
    private String review;
    
    @JsonView(BaseView.class)
	private Integer id;

    public static interface SummaryView extends BaseView {}

	public Book(String title, String author, String review, int id) {
		this.title = title;
		this.author = author;
		this.review = review;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the review
	 */
	public String getReview() {
		return review;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @param review the review to set
	 */
	public void setReview(String review) {
		this.review = review;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
    
    
}