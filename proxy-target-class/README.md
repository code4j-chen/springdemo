#proxy-target-class属性解释
proxy-target-class属性值决定是基于接口的还是基于类的代理被创建。
首先说明下proxy-target-class="true"和proxy-target-class="false"的区别，
为true则是基于类的代理将起作用（需要cglib库），
为false或者省略这个属性，则标准的JDK 基于接口的代理将起作用。
proxy-target-class在spring事务、aop、缓存这几块都有设置，其作用都是一样的。
<code>
<tx:annotation-driven transaction-manager="transactionManager" proxy-target-class="true"/>  
<aop:config proxy-target-class="true">  
<cache:annotation-driven proxy-target-class="true"/>
</code>

###总结：
高版本spring自动根据运行类选择JDK或CGLIB代理，我们无需设置proxy-target-class属性，JDK动态代理是模拟接口实现的方式，cglib是模拟子类继承的方式，一般采用前者，因为前者效率高。后者不建议使用。
