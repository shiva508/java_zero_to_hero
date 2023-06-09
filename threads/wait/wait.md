1. Thread Synchronization in Java
	In a multithreaded environment, multiple threads might try to modify the same resource. 
	If threads aren't managed properly, this will, of course, lead to consistency issues.
	
1.1. Guarded Blocks in Java
	One tool we can use to coordinate actions of multiple threads in Java – is guarded blocks. 
	Such blocks keep a check for a particular condition before resuming the execution.
	With that in mind, we'll make use of:

	Object.wait() – to suspend a thread
	Object.notify() – to wake a thread up
	This can be better understood from the following diagram, that depicts the lifecycle of a Thread:

2. The wait() Method
	Simply put, when we call wait() – this forces the current thread to wait until some other thread invokes 
	notify() or notifyAll() on the same object.
	For this, the current thread must own the object's monitor. According to Javadocs, this can happen when:

	1.we've executed synchronized instance method for the given object
	2.we've executed the body of a synchronized block on the given object
	3.by executing synchronized static methods for objects of type Class
	Note that only one active thread can own an object's monitor at a time.

	This wait() method comes with three overloaded signatures. Let's have a look at these.
	
2.1. wait()
	The wait() method causes the current thread to wait indefinitely until another thread either 
	invokes notify() for this object or notifyAll().
	
2.2. wait(long timeout)
	Using this method, we can specify a timeout after which thread will be woken up automatically. 
	A thread can be woken up before reaching the timeout using notify() or notifyAll().

	Note that calling wait(0) is the same as calling wait().

2.3. wait(long timeout, int nanos)
	This is yet another signature providing the same functionality, with the only difference 
	being that we can provide higher precision.

	The total timeout period (in nanoseconds), is calculated as 1_000_000*timeout + nanos.
	
3. notify() and notifyAll()
	The notify() method is used for waking up threads that are waiting for an access to this 
	object's monitor.
	
3.1. notify()
	For all threads waiting on this object's monitor (by using any one of the wait() method), 
	the method notify() notifies any one of them to wake up arbitrarily. The choice of exactly 
	which thread to wake is non-deterministic and depends upon the implementation.

	Since notify() wakes up a single random thread it can be used to implement mutually exclusive 
	locking where threads are doing similar tasks, but in most cases, it would be more viable to 
	implement notifyAll().
4.2. notifyAll()
	This method simply wakes all threads that are waiting on this object's monitor.

	The awakened threads will complete in the usual manner – like any other thread.

	But before we allow their execution to continue, always define a quick check for the 
	condition required to proceed with the thread – because there may be some situations where 
	the thread got woken up without receiving a notification.

	
	
## What is the difference between wait and sleep?

## Let's discuss the difference between sleep and wait. They may seem to be very similar but there are fundamental differences between them.

###    you call wait on the Object while on the other hand you call sleep on the Thread itself

###   wait can be interrupter (this is why we need the InterruptedException) while on the other hand sleep can not

    wait (and notify) must happen in a synchronized  block on the monitor object whereas sleep does not

    sleep operation does not release the locks it holds while on the other hand wait releases the lock on the object that wait() is called on
	
	
	
	
	
	
	