package Service;

import Repository.SupplierRepo;
import model.Supplier;

public class SupplierServiceImpl implements SupplierService{

     SupplierRepo supplierRepo;

     
	public SupplierServiceImpl(SupplierRepo supplierRepo) {

		super();
		this.supplierRepo = supplierRepo;
	}
	/*
	 * (non-Javadoc)
	 * @see Service.SupplierService#addSupplier(model.Supplier)
	 */
     @Override
	public int addSupplier(Supplier supplier) {

		return supplierRepo.addSupplier(supplier);
	}
	/*
	 * (non-Javadoc)
	 * @see Service.SupplierService#updateSupplier(int, float)
	 */
	@Override
	public int updateSupplier(int supplierId, float amount) {

		return supplierRepo.updateSupplier(supplierId, amount);

		}
	/*
	 * (non-Javadoc)
	 * @see Service.SupplierService#removeSupplier(int)
	 */
	@Override
	public int removeSupplier(int supplierId) {

		return supplierRepo.removeSupplier(supplierId);
	}
	
}