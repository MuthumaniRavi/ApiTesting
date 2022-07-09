package org.api.json.objmapper;

import java.util.ArrayList;

public class Employee2 {
private int page;
private int per_page;
private int total;
private int total_pages;
private ArrayList<DataDetails> data;
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public int getPer_page() {
	return per_page;
}
public void setPer_page(int per_page) {
	this.per_page = per_page;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getTotal_pages() {
	return total_pages;
}
public void setTotal_pages(int total_pages) {
	this.total_pages = total_pages;
}
public ArrayList<DataDetails> getData() {
	return data;
}
public void setData(ArrayList<DataDetails> data) {
	this.data = data;
}














}
