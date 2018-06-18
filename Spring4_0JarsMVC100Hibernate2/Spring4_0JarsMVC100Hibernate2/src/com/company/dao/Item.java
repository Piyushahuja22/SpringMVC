package com.company.dao;

public class Item {
	private int itemId;
	private String itemName;
	
	public Item(int itemId, String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}
	
	public Item() {
		super();
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + "]";
	}
}
