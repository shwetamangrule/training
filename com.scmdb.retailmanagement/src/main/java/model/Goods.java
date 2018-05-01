package model;
public class Goods {

	

	public int goodsId;
	public String goodsName;
	public int goodsQuantity;
	public float goodsPrice;
	public int SupplierId;
	/**
	 * @return the goodsId
	 */
	public int getGoodsId() {
		return goodsId;
	}
	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(int goodsId) {
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
	public int getGoodsQuantity() {
		return goodsQuantity;
	}
	/**
	 * @param goodsQuantity the goodsQuantity to set
	 */
	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	/**
	 * @return the goodsPrice
	 */
	public float getGoodsPrice() {
		return goodsPrice;
	}
	/**
	 * @param goodsPrice the goodsPrice to set
	 */
	public void setGoodsPrice(float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	/**
	 * @return the supplierId
	 */
	public int getSupplierId() {
		return SupplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}
	/**
	 * @param goodsId
	 * @param goodsName
	 * @param goodsQuantity
	 * @param goodsPrice
	 * @param supplierId
	 */
	public Goods(int goodsId, String goodsName, int goodsQuantity, float goodsPrice, int supplierId) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsQuantity = goodsQuantity;
		this.goodsPrice = goodsPrice;
		SupplierId = supplierId;
	}
	/**
	 * 
	 */
	public Goods() {
		super();
	}
	
}