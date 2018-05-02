package Repository;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Supplier;

public class SupplierRepoImpl implements SupplierRepo {

	JdbcTemplate jdbcTemplate;
	public SupplierRepoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int addSupplier(Supplier supplier) {

		String query = "INSERT INTO supplier VALUES('"
				+ supplier.getSupplierId() + "','" + supplier.getSupplierName()
				+ "','" + supplier.getSupplierAddress() + "','"
				+ supplier.getQuantityOrder() + "','" + supplier.getOrderId()
				+ "','" + supplier.getAmount() + "','"
				+ supplier.getRetailerId() + "')";
		jdbcTemplate.update(query);
		return supplier.getSupplierId();
	}
	@Override
	public int updateSupplier(int supplierId, float amount) {

		String query = "UPDATE supplier SET ammount='" + amount
				+ "' WHERE supplier_id='" + supplierId + "'";
		return jdbcTemplate.update(query);

	}
	@Override
	public int removeSupplier(int supplierId) {

		String query = "DELETE FROM supplier WHERE supplier_id='" + supplierId
				+ "'";
		return jdbcTemplate.update(query);

	}

}