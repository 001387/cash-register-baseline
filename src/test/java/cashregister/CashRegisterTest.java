package cashregister;

import org.junit.Test;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase() {
        //initialize CashRegister and fake Printer
    	Item item1 = new Item("Element 1", 27);
    	Item item2 = new Item("Element 2", 77);
    	Item[] items = new Item[] {item1, item2};
    	Purchase purchase = new Purchase(items);
    	
    	CashRegister cashRegister = new CashRegister(null);
        cashRegister.process(purchase);

        //verify that printer was called
    }
}
