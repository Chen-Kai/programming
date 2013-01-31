An **Object**:
* Holds data
* Does somthing.

---

A **Class** defines two things for an object of this class:
* The **data** it holds. 
* The **message** it can receive. 

---

##### The lifetime of variables.
* The variables in a method are alive until the method returns.
* object fields are alive until the object points to null.
* static variables are alive as long as the program is running. 

---

##### Array in Java
> When you create an array of objects, you are really creating an array of references, and each of those references is automatically initialized to `null`. You must assign an object to each reference before you use it, and if you try to use a reference that is still `null`, the problem will be reported at run time. When you create an array of primitives, the compiler guarantees initialization because it zeroes the memory for that array. (from "Thinking in Java")

---

##### Garbage collector
> GC looks at all the objects that were created with **new** and figures out which ones are not being referenced anymore. Then it releases that memory for those objects, so the memory can be used for new object. (from "Thinking in Java")

---

`final` means last version, means fixed, CANNOT be modified anymore, so:  
* A `final` variable can not re-assinged.
* A `final` method can not be overrode.
* A `final` class can not be extends.

---

##### Get JVM bytecodes from a A.class
    $ javap -c A

##### `final` class
> An **final class** is simply a class whose instances can not be modified. All of the information contained in each instance is provided when it is created and fixed for lifetime of the object. (from "Effective Java")
