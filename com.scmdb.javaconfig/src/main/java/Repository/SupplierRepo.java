package Repository;

import model.Supplier;

public interface SupplierRepo {

	public int addSupplier(Supplier supplier);
	public int  updateSupplier(int supplierId,float amount);
	public int removeSupplier(int supplierId);

}