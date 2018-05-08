package com.cg.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.entity.Goods;


public class GoodsDaoImpl implements GoodsDao{

	  private JdbcTemplate jdbcTemplate;
	  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate=jdbcTemplate;
			
		}
	@Override
	public Goods addGoods(Goods goods) {
		 String query = "insert into goods (goodsId,goodsName,goodsQuantity,goodsPrice) values (?,?,?,?)";
	      //  jdbcTemplate = new JdbcTemplate(dataSource);
	        Object[] inputs = new Object[] {goods.getGoodsId(), goods.getGoodsName(), goods.getGoodsQuantity(),goods.getGoodsPrice()};
	        jdbcTemplate.update(query, inputs);
	        return goods;
	}

	@Override
	public Goods updateGoods(Goods goods) {
		String sql = "update goods set goodsName=? where goodsId = ?";
		//jdbcTemplate = new JdbcTemplate(dataSource);
         Object[] inputs = new Object[] {goods.getGoodsName(),goods.getGoodsId()};
        jdbcTemplate.update(sql, inputs);
		return goods;
	}

	@Override
	public int deleteGoods(int goodsId) {
		 String sql = "delete from goods where goodsId = ?";
	        jdbcTemplate.update(sql,new Object[]{goodsId});
			return 1;
	
	}

	@Override
	public Goods orderGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
