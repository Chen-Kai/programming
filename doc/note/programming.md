### DON'Ts in synchronization
* Don't read while writing;
* Don't write while reading;
* Don't write synchronously;

---

### Mutiple threads share same resource
Thread X trys to access the resource.
* If it is not cloked:
  1. lock it  
  2. do the things  
  3. unlock it  
* Or, wait

### Stack & Heap & Constant storage (data area)
> The stack lives in the general random-access memory (RAM) area, but has direct support from the processor via its stack pointer. The stack pointer is moved down to create new memory and moved up to release that memory. (Object references are stored on the stack)
> The heap is a general-purpose pool of memory (also in the RAM area) where all Java objects live. Whenever you need an object, you simply write the code to create it by using **new**, and the strorage is allocated on the heap when that code is executed.
> Constant values are often placed directly in the program code, which is safe since they can never change.
