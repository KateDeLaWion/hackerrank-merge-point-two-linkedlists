public class Solution {

    // HackerRank Find Merge Point of Two Lists
    // https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
// head1 = 1 -> 3 -> 5 -> 8 -> 9
// head2 = 2 -> 6 -> 8 -> 9
// since these 2 LinkedList have different lengths, we can make them same length by
// head1 = 1 -> 3 -> 5 -> 8 -> 9 -> 2 -> 6 -> 8 -> 9
// head2 = 2 -> 6 -> 8 -> 9 -> 1 -> 3 -> 5 -> 8 -> 9
// my code starts here
        SinglyLinkedListNode currentN1 = head1;
        SinglyLinkedListNode currentN2 = head2;
        while(currentN1 != currentN2){

            if(currentN1 == null){
                currentN1 = head2;
            } else {
                currentN1 = currentN1.next;
            }

            if(currentN2 == null){
                currentN2 = head1;
            } else {
                currentN2 = currentN2.next;
            }
        }
        return currentN1.data;
        // or
        // return currentN2.data;
// my code ends here

    }


}
