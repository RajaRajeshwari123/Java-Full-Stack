package workingdayeleven.genericscollectionassign;

import java.util.ArrayList;
import java.util.List;

public class FriendFinder {
	    public static void main(String[] args) {
	        List<FriendshipCriteria<String, String>> friends = new ArrayList<>();
	        friends.add(new FriendshipCriteria<>("Raji", "New Delhi"));
	        friends.add(new FriendshipCriteria<>("Roshika", "Chicago"));
	        friends.add(new FriendshipCriteria<>("Elita", "Hyderabad"));
	 
	        String targetLocation = "Hyderabad";
	 
	        for (FriendshipCriteria<String, String> friend : friends) {
	            if (friend.getAttribute().equalsIgnoreCase(targetLocation)) {
	                System.out.println(friend.getName() + " is a friend.");
	            }
	        }
	    }
	}

