<pre><code>
Class - TableManager
Responsibility                        Collaberator
.Keep record of tables and
their states.
.Observe wait list and match         WaitListManager
with number of guests in a party.  

Class - WaitListManager
Responsibility                      Collaberator
.Maintain list of
reservations and number of guests.
.Register reservations              TableManager
.Message confirmation               Customer
.Message cancellation               Customer


Patterns used -
1. State Pattern
This is used by TableManager to maintain states of tables like Empty,Reserved,Occupied.
2. Observer Pattern
This is used by TableManager and WaitListManager to identify and manager wait list.
</code></pre>
