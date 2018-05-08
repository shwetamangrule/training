package com.training.repository;

import com.training.model.Goods;
/*
 * interface to implements goods services logic
 */
public interface GoodsRepo {

	public int addGoods(Goods goods);
	public int removeGoods(long goodsId);
	public int updategoods(long goodsId,float price);

}