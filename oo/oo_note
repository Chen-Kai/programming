For each object that you see, ask yourself two questions:
1. What possible states can this object in?
2. What possible behavior can this object perform?

Take desktop lamp as an example:
1. states: on and off
2. action: turn on and turn off.

Software objects are conceptually similar to real-world objects: they too consist of state and related behavior. An object stores its state in fields (variables in some programming languages) and exposes its behavior through methods (functions in some programming languages).

Methods operate on an object's internal state and serve as the primary mechanism for object-to-object communication. Hiding internal state and requiring all interaction to be performed through and object's methods is known as data encapsulation -- a dundamental principle of object-oriented programming.

By attibuting state and providing methods for changing that state, the object remains in control of how the outside world is allowed to use it.

Object defines its interaction with the outside world through the methods that they expose.

Methods form the object's interface with the outside world.

In its most common form, an interface is a group of related methos with empty bodies.

Implementing an interface allows a class to become more formal about the behavior it promises to provide. Interfaces form a contract between the clas and the ourside world.

开-闭原则：
Software entities should be open for extension, but closed for modification.
也就是说:在设计一个模块的时候，应该使这个模块可以在不被修改的前提下被扩展。

满足开-闭原则的设计可以给一个软件系统两个无可比拟的优越性：
1. 通过扩展自己的软件系统，可以提供新的行为，以满足对软件的新的需求，使变化中的软件系统有一定的适应性和灵活性。
2. 已有的软件模块，特别是最重要的抽象层模块不能再修改，这就使变化中的软件系统有一定的稳定性和延续性。

对可变性的封装原则：找到系统的可变因素，将其封装起来。

对可变性的封装原则意味着两点：
1. 一种可变性不应当散落在代码的很多角落里，而应当被封装到一个对象里面。同一种可变性的不同表象意味着同一个继承等级结构的具体子类，因此，读者可以期待在设计模式中看到继承关系。
	继承应当被看做是封装变化的方法，而不应当被认为是从一般的对象生成特殊的对象的方法。
2. 一种可变性不应当与另一种可变性混合在一起。
	类图的继承结构一般不会超过两层，不然就意味着将两种不同的可变性混合在了一起。

里氏代换原则：任何基类可以出现的地方，子类一定可以出现。

里氏代换原则是对“开-闭”原则的补充。正如前面所谈到的，实现“开-闭”原则的关键步骤就是抽象化。而基类和子类的继承关系就是抽象化的具体体现，所以里氏代换原则是对实现抽象化的具体步骤的规范。

依赖倒转原则：要依赖于抽象，不要依赖于实现。

合成/集合复用原则： 尽量使用合成/聚合，而不是继承关系达到复用的目的。

策略模式：如果有一组算法，那么就将每个算法封装起来，使得它们可以互换。

面向对象的系统里，两个类之间可以发生的三种不同的耦合关系：
- 零耦合：两个类没有耦合关系（谁都不知道对方的存在）
- 具体耦合： 两个具体（可实例化）类之间，经由一个类直接引用另一个具体类。
- 抽象耦合： 一个具体类和一个抽象类（或接口）之间，使两个必须发生关系的类之间存在最大的灵活性。

抽象不应该依赖于细节，细节应该依赖于抽象。

依赖倒转原则要求客户端依赖于抽象耦合。

要针对接口编程，不要针对实现编程。

针对接口编程的意思是说：应当使用Java接口和抽象Java类进行变量的类型声明、参量的类型声明、方法的返回类型声明已经数据类型的转换等。不要针对实现编程的意思是说：不应当使用具体Java类进行变量的类型声明、参数的类型声明、方法的返回类型声明以及数据类型的转换等。

要保证做到这一点，一个具体Java类应当只实现Java接口和抽象Java类中声明过的方法，而不应当给出多余的方法。

只要一个被引用的对象存在抽象类型，就应当在任何引用此对象的地方使用抽象类型，包括参数的类型声明、方法返回类型的声明、属性变量的类型声明等。

以抽象方式耦合是依赖倒转原则的关键。由于一个抽象耦合关系总要涉及具体类从抽象类继承，并且需要保证在任何引用到基类的地方都可以改换成其子类，因此，里氏代换原则是依赖倒转原则的基础。




