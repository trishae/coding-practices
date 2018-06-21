## PROBLEM 2: Add Two Numbers of LeetCode problems (https://leetcode.com)

## You are given two non-empty linked lists representing two non-negative integers. 
## The digits are stored in reverse order and each of their nodes contain a single digit. 
## Add the two numbers and return it as a linked list.
## You may assume the two numbers do not contain any leading zero, except the number 0 itself.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        ptr = ListNode(0)
        r = ptr
        
        while (l1 != None or l2 != None):
            if (l1 != None and l2 != None):
                summ = r.val + l1.val + l2.val
            elif (l1 != None and l2 == None):
                summ = r.val + l1.val
            elif (l1 == None and l2 != None):
                summ = r.val + l2.val
                
            if (summ < 10):
                r.val = summ
                if ((l1 != None and l1.next != None) or (l2 != None and l2.next != None)):
                    r.next = ListNode(0)
            else:
                r.val = summ - 10
                r.next = ListNode(1)
                
            if (l1 != None):
                l1 = l1.next
                
            if (l2 != None):
                l2 = l2.next

            r = r.next
        return ptr
        