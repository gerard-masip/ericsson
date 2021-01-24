**Code walkthroug:**

**Task Class:** Represents the task to be executed, in this case it simply prints a String. It contains 
a Thread.sleep clause to show that one task will not start before the previous one finishes. It 
implements runnable interface to allow async execution.

**Consumer Class:** Will run in a thread that listens to a queue. This queue ensures that tasks 
will be executed in FIFO order. When a message is received it will perform the task using a single 
thread executor so one task does not start until de previous one finishes. Having the single thread 
executor allows executing each task in a different thread but not simultaneously.

**Executor Class:** Contains a main method that initializes the queue used by the Consumer and passes
several tasks to it. The Thread.Sleep clause is to demonstrate that Consumer allows execution of more 
tasks after the execution of previous ones already started.


**_Note:_** I tried to keep the code as simple as possible using plain java while performing 
all the functionality required.
