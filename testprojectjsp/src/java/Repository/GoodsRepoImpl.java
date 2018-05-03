package Repository;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Goods;

public class GoodsRepoImpl implements GoodsRepo{

	JdbcTemplate jdbcTemplate;
/*
 * Jdbc template for creating connections
 */
	public GoodsRepoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	/*
	 * (non-Javadoc)
	 * @see Repository.GoodsRepo#addGoods(model.Goods)
	 */
	@Override
	public int addGoods(Goods goods) {

		String query="INSERT INTO goods VALUES('"+goods.getGoodsId()+"','"+goods.getGoodsName()+"','"+goods.getGoodsQuantity()+"','"+goods.getGoodsPrice()+"','"+goods.getSupplierId()+"')";
	     jdbcTemplate.update(query);
	     return goods.goodsId;
	}

/*
 * (non-Javadoc)
 * @see Repository.GoodsRepo#removeGoods(long)
 */
	@Override
	public int removeGoods(long goodsId)
	{
	String query="DELETE FROM goods WHERE goods_id='"+goodsId+"'";	
    return jdbcTemplate.update(query);		
	}
	/*
	 * (non-Javadoc)
	 * @see Repository.GoodsRepo#updategoods(long, float)
	 */
	@Override
	public int updategoods(long goodsId, float price)

	{
		String query="UPDATE goods SET goods_price='"+price+"' WHERE goods_id='"+goodsId+"'";
		return jdbcTemplate.update(query);

	}

}