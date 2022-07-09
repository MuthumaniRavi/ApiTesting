package org.api.json.createjsonfile;

import java.util.ArrayList;
import java.util.List;

import org.api.json.objmapper.DataDetails;

public class Employee4 {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private List<Data> data;
	public int getPage() {
		return page;
	}
	public int getPer_page() {
		return per_page;
	}
	public int getTotal() {
		return total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public List<Data> getData() {
		return data;
	}
	public Employee4(int page, int per_page, int total, int total_pages, List<Data> datas) {
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data=datas;
	}
	
	
}
