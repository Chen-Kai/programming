一个 `对象`:
- 拥有**状态**、持有数据
- 拥有**行为**、有所作为
例如`一部手机`
拥有:
    - 一个CPU
    - 一张SIM卡
    - 一个显示器
    - 一块电池
能够:
    - 拨打电话
    - 发送短信
    - 加载网页

---

一个`类`为所有此类对象定义了两件事:
- 它的`状态`
- 它的`行为`

---

##### 变量的生命周期
- 声明于方法体内的变量在方法返回后失效
- 对象的成员变量在对象被赋为`null`时失效
- 静态变量在进程结束时失效

---

##### 对象数组
当你创建了一个**房子**数组，其实是创建了一个**地址**列表（每个地址都为空）。

---

##### 垃圾回收器
GC追踪所有`new`出来的对象，当不再存在指向其的引用时就回收之。

---


##### `final`
`final`意味着**绝版**、**终稿**、**不再更改**，所以：
- 一个`final`变量不可被再次赋值
- 一个`final`方法不可被重写
- 一个`final`类不可被扩展

---

##### 查看A.class文件字节码
    $ javap -c A

---

##### 如何把一个对象写入硬盘
- 告诉Java这个类`Serializable`
- 创建一个`ObjectOutputStream`（对象输出流）对象
- 让oos执行`writeObject()`

---

##### 关于错误处理的原则
- 尽早发现
- 非`public`方法要对参数合法性进行`assert`
- 在构造函数中进行参数合法性检查
- 及时发现错误、报告错误、合理处理错误；不可以哑处理

---

>Objects are at the heart of Java programming. An object consists of data and methods that access (and possibly manipulate) the data. An object also has a state, which consists of the values for the object's data at a particular time. Objects are modeled with classes.

>The difference between static and instance methods is that static methods do not require being associated with an object. 

>Declaring data as private prevents the data from being manipulated from outside the class. 

>The Java keyword `this` provides an object a reference to itself. It is useful when an object needs to pass itself to another object.

> Whenever object are passed as parameters to methods, they are passed by reference.

---

`switch(枚举变量)`要进行非空判断.因为枚举`枚举变量.ordinal()`可能为空

---

`final`关键字有3方面用途：
1. 修饰变量，说明其为只读的。
2. 修饰方法，说明子类不可覆盖之。
3. 修饰类，说明其它类不可继承之。
总之，`final`了的变量、方法、类就是最终版本，不可再做更改了。

---

编译器看到`final`的原始类型变量或者String对象，会进行常量替换。例如：
```Java
private static final int MAX_HEIGHT = 100;
	
public int getMaxHeight () {
	return MAX_HEIGHT;
}
```
编译后：
```java
private static final int MAX_HEIGHT = 100;
	
public int getMaxHeight () {
	return 100;
}
```

---

匹配所有gif文件的正则

```
Pattern.compile(".*.gif").matcher(name).matches();
```

---

Java查看字节码

``` bash
javap -c Cat
```

单例模式：

``` java
public enum Sun {
  INSTANCE;
  public void sayHi() {
  }
}
```

抛出断言异常：

``` java
	throw new AssertionError())
```

