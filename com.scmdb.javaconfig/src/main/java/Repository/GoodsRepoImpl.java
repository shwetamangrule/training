package Repository;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Goods;

public class GoodsRepoImpl implements GoodsRepo{

	JdbcTemplate jdbcTemplate;

	public GoodsRepoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int addGoods(Goods goods) {

		String query="INSERT INTO goods VALUES('"+goods.getGoodsId()+"','"+goods.getGoodsName()+"','"+goods.getGoodsQuantity()+"','"+goods.getGoodsPrice()+"','"+goods.getSupplierId()+"')";
	     jdbcTemplate.update(query);
	     return goods.goodsId;
	}


	@Override
	public int removeGoods(long goodsId)
	{
	String query="DELETE FROM goods WHERE goods_id='"+goodsId+"'";	
    return jdbcTemplate.update(query);		
	}
	@Override
	public int updategoods(long goodsId, float price)

	{
		String query="UPDATE goods SET goods_price='"+price+"' WHERE goods_id='"+goodsId+"'";
		return jdbcTemplate.update(query);

	}

}