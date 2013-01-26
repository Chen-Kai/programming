### DON'Ts in synchronization
* Don't read while writing;
* Don't write while reading;
* Don't write synchronously;

---

### Mutiple threads share same resource
Thread-A trys to access the resource.
* If it is not cloked:
  1. lock it  
  2. do the things  
  3. unlock it  
* Or, wait
