This is an example of how the 

Every second an object of (almost) 1KB object is created


k exec --stdin --tty jbang-pod -- bash

jstat -gc $(jps | grep GenerationalGCTest | cut -d " " -f1) 1s

Now you can see Eden and Survivors spaces growing and decreasing
