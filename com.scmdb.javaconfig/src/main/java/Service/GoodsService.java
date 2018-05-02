package Service;

import model.Goods;
/*
 * goods service imnterface
 */
public interface GoodsService {

	public int addGoods(Goods goods);
	public int removeGoods(int goodsId);
	public int updategoods(int goodsId,float price);

}