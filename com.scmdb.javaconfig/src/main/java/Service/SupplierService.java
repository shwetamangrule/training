package Service;

import model.Supplier;

public interface SupplierService {

	public int addSupplier(Supplier supplier);
	public int updateSupplier(int supplierId,float amount);
	public int removeSupplier(int supplierId);

}