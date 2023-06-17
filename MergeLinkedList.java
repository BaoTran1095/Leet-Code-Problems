
public class MergeLinkedList {
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		
		ListNode list2 = new ListNode(2, new ListNode(3, new ListNode(4)));
		
		mergeTwoLists(list1, list2);
	}
	
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode ans = new ListNode();
		ListNode temp = ans;
		if(list1 == null && list2 == null){return null;}
        if(list1 == null && list2 != null){return list2;}
        if(list1 != null && list2 == null){return list1;}
		
		while(list1 != null && list2 != null) {
			if(list1.val == list2.val) {
				temp.next = new ListNode(list1.val);
				temp = temp.next;
				temp.next = new ListNode(list2.val);
				temp = temp.next;
				
				list1 = list1.next;
				list2 = list2.next;
			}else if(list1.val < list2.val) {
				temp.next = new ListNode(list1.val);
				temp = temp.next;
				list1 = list1.next;
			}else {
				temp.next = new ListNode(list2.val);
				temp = temp.next;
				list2 = list2.next;
			}
		}
		
		if(list1 != null) {
			temp.next = list1;
		}else {
			temp.next = list2;
		}
		
		return ans.next;

	}

	
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		public String toString(){ return ""; }
	}
}
