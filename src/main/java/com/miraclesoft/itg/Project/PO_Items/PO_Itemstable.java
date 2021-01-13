package com.miraclesoft.itg.Project.PO_Items;

public class PO_Itemstable {
	int POID;
	public int getPOID() {
		return POID;
	}
	public void setPOID(int pOID) {
		POID = pOID;
	}
	public int getItemsID() {
		return ItemsID;
	}
	public void setItemsID(int itemsID) {
		ItemsID = itemsID;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	int ItemsID;
	int Qty;
	int Price;
	int Discount;

}
