package cashregister;

import org.junit.Test;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase() {
        //initialize CashRegister and fake Printer
    	Item[] items = new Item[] {
    			new Item("Noodles", 10), 
    			new Item("Apples", 20)};
    	Purchase purchase = new Purchase(items);
    	MockPrinter mockPrinter = new MockPrinter(); 
    	CashRegister cashRegister = new CashRegister(null);
        cashRegister.process(purchase);

        //verify that printer was called
        mockPrinter.verifyThatPrintWasCalled();
    }
    
    @Test 
    public void should_print_the_stub_purchase() {
    	
    }
}
