package Service;

import model.Goods;

public interface GoodsService {

	public int addGoods(Goods goods);
	public int removeGoods(int goodsId);
	public int updategoods(int goodsId,float price);

}