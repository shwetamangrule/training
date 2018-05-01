package Service;

import Repository.GoodsRepo;
import model.Goods;

public class GoodsServiceImpl implements GoodsService {

 public GoodsRepo goodsrepo;

public GoodsServiceImpl(GoodsRepo goodsrepo) {

	super();
	this.goodsrepo = goodsrepo;
}
	@Override
	public int addGoods(Goods goods) {

			return goodsrepo.addGoods(goods);
	}
	@Override
	public int removeGoods(int goodsId) {

			return goodsrepo.removeGoods(goodsId);
	}
	@Override
	public int updategoods(int goodsId, float price) {

		return goodsrepo.updategoods(goodsId, price);
	}
}
