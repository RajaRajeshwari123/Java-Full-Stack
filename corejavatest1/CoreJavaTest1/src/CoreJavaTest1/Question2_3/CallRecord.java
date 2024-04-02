package CoreJavaTest1.Question2_3;


	public class CallRecord {
		private String callerNumber;
		private String receiverNumber;
		private double callDuration;
		public CallRecord() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public CallRecord(String callerNumber, String receiverNumber, double callDuration) {
			super();
			this.callerNumber = callerNumber;
			this.receiverNumber = receiverNumber;
			this.callDuration = callDuration;
		}

		public String getCallerNumber() {
			return callerNumber;
		}
		public void setCallerNumber(String callerNumber) {
			this.callerNumber = callerNumber;
		}
		public String getReceiverNumber() {
			return receiverNumber;
		}
		public void setReceiverNumber(String receiverNumber) {
			this.receiverNumber = receiverNumber;
		}
		public double getCallDuration() {
			return callDuration;
		}
		public void setCallDuration(double callDuration) {
			this.callDuration = callDuration;
		}
	 

}
