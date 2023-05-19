# Locks

# Intrinsic Lock
## Every object in java has so called lock called intrinsic lock.
## A thread that needs exclusive and consistent access to object fields,has to acquire object's intrinsic lock before access them and once done lock is released.
## Because of intrinsic lock no two threads execute same synchronized method at once.
## Thread owns intrinsic lock between time it has acquired lock and released lock.
## As long as thread owns intrinsic lock, no other thread acquire same lock
## Other thread will block when it attempts to acquire the lock.
## Problem is that every object has single intrinsic lock

## If we have two independent synchronized methods, then threads have to wait each other to release lock.
## as each object has only one lock if one sync method acquires lock other sync method has to wait for loack gets released

## Object level locking happens when synchronized method without static
## Class level locking happens when synchronized method with static

