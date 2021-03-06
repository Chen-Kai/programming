**用例图**  
- 描述了一个用户如何使用一个系统获得一项服务
- 从用户的角度来看系统 -- 系统都提供了哪些功能为其所用
- 反映了用户为什么要使用这个系统，用户能用这个系统做什么事
- 体现了用户同系统的>    交互情景，让软件开发人员暂时不考虑软件内部的行为和结构，而专注于理清用户为什么去使用这个系统
- 一个用户就是用户对app的一次使用，就是用户与app的一次交互，就是一个用例。
- 在Android中，一个Activity就是一个用例，因为它是APP同用户交互的窗口，用户从此窗口获得了APP提供的一项服务
- 当用户使用汽车（系统）时，启动、刹车等就是用例

###### 用例图 - 扩展关系： 用以表示一个用例的对话流程可能根觉条件临时插入另一个用例的对话流程
###### 用例图 - 包含关系： 用以表示一个用例的对话流程包含着另一个用例的对话流程。例如，用户从ATM取钱，包含密码验证

##### 状态图
* 用于理清状态变化，以达到控制整个系统的目的。
* 表达事件、状态、行为之间的关系 

> 设计软件时需要充分描述组建的行为，掌握组件的协作关系，灵活地传递消息。
> 方法的执行常令对象内部状态发声变化。例如，取钱后账户余额会发声变化。

用例图用来描述某系统所能提供给用户的功能。其包含3个主要的元素：
* 用户 - 于系统交互的角色
* 系统 - 提供了一些功能
* 用例 - 用户为实现某目的而对系统的某项功能的一次调用（使用）
