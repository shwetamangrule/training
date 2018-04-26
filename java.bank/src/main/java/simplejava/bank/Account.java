package simplejava.bank;

import java.util.List;

public interface Account {

		public List deposit(float depositAmmount);
		public List withdrawl(float withdrawAmmount);
		public List<Account> getStatement(List list);

	}

