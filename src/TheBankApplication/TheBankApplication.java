package TheBankApplication;

import javax.xml.bind.JAXBException;

public class TheBankApplication {
    public static void main(String[] args) throws JAXBException{
        
        CashMachine machine  = new CashMachine();
        machine.run();
        
//        xml.pack("Accounts");
//        xml.unpack("Accounts");
//        DataHolder d2 = (DataHolder) xml.getObject();
    }
}