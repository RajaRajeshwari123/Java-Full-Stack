package CoreJavaTest1.Question2_2;

import java.util.List;

import CoreJavaTest1.Question2_3.CallRecord;

public class InvoiceGenerator {
	public void Invoicegenerator(List<CallRecord> callRecords) {
        double totalCharges = 0.00;
 
        for (CallRecord record : callRecords) {
            double callCharges = calculateCallCharges(record);
            totalCharges += callCharges;
            System.out.println("Call from " + record.getCallerNumber() +
                    " to " + record.getReceiverNumber() +
                    " (Duration: " + record.getCallDuration() + " Minutes)" +
                    " Charges: $" + callCharges);}
        System.out.println("Total Amount Due: $" + totalCharges);
    }
 
    private double calculateCallCharges(CallRecord record) {
        return record.getCallDuration() * 0.10;
    }
}
 
