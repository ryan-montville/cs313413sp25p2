COMP 313/413 Project 2 Report Template

TestList.java and TestIterator.java

	TODO also try with a LinkedList - does it make any difference?

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
								 #1 	#2		#3		#4		#5		#6 	... (as many tests as you ran)
        testArrayListAddRemove:  184	184		182		184		184		181
        testLinkedListAddRemove: 27		23 		23		22 		24		22
		testArrayListAccess:     8		10		8		8		8		10
        testLinkedListAccess:    10		11		9		11		10		10

	SIZE 100
								#1		#2		#3		#4		#5		#6 	... (as many tests as you ran)
        testArrayListAddRemove:  
        testLinkedListAddRemove: val1 val2 val3 val4 val5 val6
		testArrayListAccess:     val1 val2 val3 val4 val5 val6
        testLinkedListAccess:    val1 val2 val3 val4 val5 val6

	SIZE 1000
								  #1   #2   #3   #4   #5   #6 	... (as many tests as you ran)
        testArrayListAddRemove:  val1 val2 val3 val4 val5 val6  ... (fill these in in ms)
        testLinkedListAddRemove: val1 val2 val3 val4 val5 val6
		testArrayListAccess:     val1 val2 val3 val4 val5 val6
        testLinkedListAccess:    val1 val2 val3 val4 val5 val6

	SIZE 10000
								  #1   #2   #3   #4   #5   #6 	... (as many tests as you ran)
        testArrayListAddRemove:  val1 val2 val3 val4 val5 val6  ... (fill these in in ms)
        testLinkedListAddRemove: val1 val2 val3 val4 val5 val6
		testArrayListAccess:     val1 val2 val3 val4 val5 val6
        testLinkedListAccess:    val1 val2 val3 val4 val5 val6

	listAccess - which type of List is better to use, and why?

		Your answer here.

	listAddRemove - which type of List is better to use, and why?

		Your answer here.
