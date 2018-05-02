package Service;

import Repository.GoodsRepo;
import model.Goods;

public class GoodsServiceImpl implements GoodsService {

 public GoodsRepo goodsrepo;

public GoodsServiceImpl(GoodsRepo goodsrepo) {

	super();
	this.goodsrepo = goodsrepo;
}
/*
 * (non-Javadoc)
 * @see Service.GoodsService#addGoods(model.Goods)
 */
	@Override
	public int addGoods(Goods goods) {

			return goodsrepo.addGoods(goods);
	}
	/*
	 * (non-Javadoc)
	 * @see Service.GoodsService#removeGoods(int)
	 */
	@Override
	public int removeGoods(int goodsId) {

			return goodsrepo.removeGoods(goodsId);
	}
	/*
	 * (non-Javadoc)
	 * @see Service.GoodsService#updategoods(int, float)
	 */
	@Override
	public int updategoods(int goodsId, float price) {

		return goodsrepo.updategoods(goodsId, price);
	}
}
