"""
 Delete Node at a given position in a linked list
 Node is defined as
 
 class Node(object):
 
   def __init__(self, data=None, next_node=None):
       self.data = data
       self.next = next_node

 return back the head of the linked list in the below method. 
"""

def Delete(head, position):
    if head == None:
        return None
    
    if position == 0:
        return head.next
    
    node = head
    i = 1
    while i < position:
        node = node.next
        i += 1
        
    node.next = node.next.next
    
    return head

