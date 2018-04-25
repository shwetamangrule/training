package java.bank;

import java.util.List;

public interface Account {

		public List deposit(int depositAmmount);
		public List withdrawl(int withdrawAmmount);
		public List<Account> getStatement(List list);

	}

