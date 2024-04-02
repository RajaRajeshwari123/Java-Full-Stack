package CoreJavaTest1.Question2_2;

import java.util.List;

import CoreJavaTest1.Question2_3.CallRecord;

public class CallDetailsPresenter {
	public void displayCallDetails(List<CallRecord> callRecords) {
    	System.out.println("Call Details:");
        for(CallRecord record : callRecords) {
            System.out.println("Caller: " + record.getCallerNumber());
            System.out.println("Receiver: " + record.getReceiverNumber());
            System.out.println("Call Duration: " + record.getCallDuration() + " Minutes");
            System.out.println("***************************************************");
        }
    }

}
