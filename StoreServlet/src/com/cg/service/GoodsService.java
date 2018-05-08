package com.cg.service;

import com.cg.entity.Goods;

public interface GoodsService {

	public Goods addGoods(Goods goods);
	
	public Goods updateGoods(Goods goods);

	public int deleteGoods(int goodsId);
	
	public Goods orderGoods(Goods goods);
}
