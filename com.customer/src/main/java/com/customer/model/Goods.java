package com.customer.model;

public class Goods {

	public Integer goodsId;
	public String goodsName;
	public long goodsQuantity;
	public long goodsPrice;
	/**
	 * default constructor
	 */
	public Goods() {
		super();
	}
	/**
	 * @param goodsId
	 * @param goodsName
	 * @param goodsQuantity
	 * @param goodsPrice
	 */
	public Goods(Integer goodsId, String goodsName, long goodsQuantity, long goodsPrice) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsQuantity = goodsQuantity;
		this.goodsPrice = goodsPrice;
	}
	/**
	 * @return the goodsId
	 */
	public Integer getGoodsId() {
		return goodsId;
	}
	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * @return the goodsQuantity
	 */
	public long getGoodsQuantity() {
		return goodsQuantity;
	}
	/**
	 * @param goodsQuantity the goodsQuantity to set
	 */
	public void setGoodsQuantity(long goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	/**
	 * @return the goodsPrice
	 */
	public long getGoodsPrice() {
		return goodsPrice;
	}
	/**
	 * @param goodsPrice the goodsPrice to set
	 */
	public void setGoodsPrice(long goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
}
