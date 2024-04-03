package workingdayeleven.genericscollectionassign;

	public class FriendshipCriteria<T extends Comparable<T>, S extends Comparable<S>> {
	    private T name;
	    private S attribute;
		public FriendshipCriteria(T name, S attribute) {
			super();
			this.name = name;
			this.attribute = attribute;
		}
		public T getName() {
			return name;
		}
		public void setName(T name) {
			this.name = name;
		}
		public S getAttribute() {
			return attribute;
		}
		public void setAttribute(S attribute) {
			this.attribute = attribute;
		}
	    
	 
}
