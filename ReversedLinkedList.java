

public class ReversedLinkedList {
	public static void main(String[] args) {
		ListNode list1 = 
		new ListNode(1,
		new ListNode(2,
		new ListNode(3,
		new ListNode(4,
		new ListNode(5)))));
		
		reverseList(list1);
		
		
	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode ans = new ListNode();
		ListNode temp = head;
		
		if(head == null || head.next == null) {
			return head;
		}
		
		
		if(head.next.next != null) {
			reverseList(head.next);
			
		}else {
			temp.next = new ListNode(head.val);
			//temp = temp.next;
			return temp.next;
		}
		
		
		
		return ans;
        
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
