package com.manojkragy.songmeter.songmeter;

public class Line {
	long id;
	String name;
	String author;
	long totalMatra;
	public Line(long id, String name, String author, long totalMatra) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.totalMatra = totalMatra;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public long getTotalMatra() {
		return totalMatra;
	}
	@Override
	public String toString() {
		return "Line [id=" + id + ", name=" + name + ", author=" + author + ", totalMatra=" + totalMatra + "]";
	}
	

}
