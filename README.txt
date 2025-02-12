COMP 313/413 Project 2 Report Template

TestList.java and TestIterator.java

	Also try with a LinkedList - does it make any difference?

		As far as the tests go, changing it to a LnkedList makes no diffreence, all the tests/asserts pass

TestList.java

	testRemoveObject()

		list.remove(5); // what does this method do?

			It removes the 5th element in the list, which is 77

		list.remove(Integer.valueOf(5)); // what does this one do?

			It removes the int 5 from the list

TestIterator.java

	testRemove()

		i.remove(); // what happens if you use list.remove(77)?

			The program throws a Concurrent Modification Exception and the test fails.

TestPerformance.java

	State how many times the tests were executed for each SIZE (10, 100, 1000 and 10000)
	to get the running time in milliseconds and how the test running times were recorded.
	These are examples of SIZEs you might choose, you can choose others if you wish.

	*****For all the tests I ran, I created 2 long veriables: startTime and endTime. In each 
	test, I set the variables at the start and end of the test method to System.currentTimeMillis(), 
	then call a method I created called calcTime that subtracts the startTime from the endTime and prints it out.

	SIZE 10
                                 #1    #2    #3    #4    #5    #6
        testArrayListAddRemove:  184   184   182   184   184   181
        testLinkedListAddRemove: 27    23    23    22    24    22
		testArrayListAccess:     8     10    8     8     8     10
        testLinkedListAccess:    10    11    9     11    10    10

	SIZE 100
                                 #1    #2    #3    #4    #5    #6
        testArrayListAddRemove:  191   194   192   196   202   189
        testLinkedListAddRemove: 23    25    23    22    23    23
		testArrayListAccess:     9     8     9     9     9     10
        testLinkedListAccess:    20    23    21    26    22    21

	SIZE 1000
                                 #1    #2    #3    #4    #5    #6
        testArrayListAddRemove:  293   291   312   313   312   296
        testLinkedListAddRemove: 23    39    23    44    25    25
		testArrayListAccess:     9     10    9     8     10    9
        testLinkedListAccess:    244   237   240   256   255   241

	SIZE 10000
                                 #1    #2    #3    #4    #5    #6
        testArrayListAddRemove:  1511  1541  1507  1519  1525  1226
        testLinkedListAddRemove: 30    24    25    32    24    25
		testArrayListAccess:     10    8     9     9     8     9
        testLinkedListAccess:    3152  3176  3120  3121  3122  3102

	listAccess - which type of List is better to use, and why?

		For listAccess, array list is better to use because it is much faster

	listAddRemove - which type of List is better to use, and why?

		For listAddRemove, linked list is better because it is much faster
