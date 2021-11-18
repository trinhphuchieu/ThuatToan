class Solution {

 //faster than 67.45% , memory 43%
// make it complicated... enjoy cái moment
// i  mistake when do it and i can fix my solution but i super lazy và trẻ trâu, not perfect don't try :(( 

    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {      
        ListNode res = null;
        int count = 0;
        
        while(l1!=null)
        {
            
            l1.val = l1.val+l2.val;
          
            if(l1.val >= 10)
            {
                if(count == 1) l1.val = l1.val + count;
                l1.val = l1.val % 10;
                count = 1;
            }else
            {
                if(count == 1)
                {          
                    l1.val = l1.val + count;       
                    if(l1.val >= 10)    
                    {
                        l1.val = l1.val % 10;
                        count =  1;
                    }else  count = 0;
                }
            }
         
            ListNode l1_next = l1.next; 
            l1.next = res;
            res = l1;
            
            if(l1_next == null || l2.next == null)
            {
               
                if(count == 1)
                {
                  
                    if(l1_next == null  && l2.next !=null)
                    {
                        ListNode l22 = l2.next;
                        
                        while(l22 !=null)
                        {
                            if(count == 1)
                            {                
                                l22.val = l22.val+count;
                                if(l22.val  >= 10)
                                {
                                    l22.val = l22.val %10; 
                                }else
                                {
                                    count = 0;
                                }
                                
                                ListNode s  = l22.next;
                                l22.next = res;
                                res = l22;
                                if(s == null && count == 1)
                                    {
                                    
                                        ListNode ins = new ListNode(1,null);
                                        ins.next = res;
                                        res = ins; 
                                        count = 0;
                                    }
                                l22 = s;                     
                            }else
                            {
                                ListNode s  = l22.next;
                                l22.next = res;
                                res = l22;
                                l22 = s; 
                            }
                        }           
                    }
                    else if(l1_next != null && l2.next == null)
                    {
                        ListNode l11 = l1_next;
                       
                        while(l11 !=null)
                        {
                            if(count == 1)
                            {      
                                
                                l11.val = l11.val+count;
                                if(l11.val  >= 10)
                                {
                                    l11.val = l11.val %10;
                                   
                                }else
                                {
                                    count = 0;
                                }
                                ListNode s  = l11.next;
                                l11.next = res;
                                res = l11;
                                  
                                if(s == null && count == 1)
                                    {
                                        ListNode ins = new ListNode(1,null);
                                        ins.next = res;
                                        res = ins; 
                                        count = 0;
                                    }
                                   l11 = s;               
                            }else
                            {
                                ListNode s  = l11.next;
                                l11.next = res;
                                res = l11;
                                l11 = s;  
                            }
                        }
                    }else
                    {
                         ListNode ins = new ListNode(1,null);
                                        ins.next = res;
                                        res = ins; 
                                        count = 0;
                    }
                    }
                    else
                    {

                        if(l1_next == null  && l2.next !=null)
                        {
                            ListNode l22 = l2.next;
                            while(l22 !=null)
                            {
                                ListNode s  = l22.next;
                                l22.next = res;
                                res = l22;
                                l22 = s;
                            }
                        }else if(l1_next != null  && l2.next ==null)
                        {
                            ListNode l22 = l1_next;
                            while(l22 !=null)
                            {
                                ListNode s  = l22.next;
                                l22.next = res;
                                res = l22;
                                l22 = s;
                            }
                        }
 
                }
                break;
            }
           l2 = l2.next;
           l1 = l1_next;
        }
        ListNode rs = null;
        while(res !=null)
        {
            ListNode s  = res.next;
            res.next = rs;
            rs = res;
            res = s;
        }
        return rs;
    }
}
