package com.controller;
import javax.persistence.Entity;  //Below Annotations
import javax.persistence.Table;   //Below Annotations
import javax.persistence.Id;   //Below Annotations
@Entity 
@Table
public class Shoe {
private String company;
private String kinds;
@Id
private String sizes;
private String prices;
public Shoe() {	
}
public String getCompany() {
	return company;
}
public String getKinds() {
	return kinds;
}
public String getSizes() {
	return sizes;
}
public void setCompany(String company) {
	this.company = company;
}
public void setKinds(String kinds) {
	this.kinds = kinds;
}
public void setSizes(String sizes) {
	this.sizes = sizes;
}
public String getPrices() {
	return prices;
}
public void setPrices(String prices) {
	this.prices = prices;
}
@Override
public String toString() {
	return "Shoe [company=" + company + ", kinds=" + kinds + ", sizes=" + sizes + ", prices=" + prices
			+ ", getCompany()=" + getCompany() + ", getKinds()=" + getKinds() + ", getSizes()=" + getSizes()
			+ ", getPrices()=" + getPrices() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}
