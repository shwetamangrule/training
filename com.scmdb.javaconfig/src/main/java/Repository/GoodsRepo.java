package Repository;

import model.Goods;

public interface GoodsRepo {

	public int addGoods(Goods goods);
	public int removeGoods(long goodsId);
	public int updategoods(long goodsId,float price);

}