package com.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Goods;
import com.training.repository.GoodsRepo;
@Service
public class GoodsServiceImpl implements GoodsService {
@Autowired
 public GoodsRepo goodsrepo;

//public GoodsServiceImpl(GoodsRepo goodsrepo) {
//
//	super();
//	this.goodsrepo = goodsrepo;
//}
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
