### 1

`e.changename(e,"Bob") System.out.println(e.getName())`  
从这里可以看出，e.getName() = Bob

choose 2

### 2

**Rectangle r = new Rectangle()**:valid  
本身是 class， 可以 initialize

**Figure f = new Rectangle()**:valid  
所有的 Rectangle 都属于 Figure

**Figure f = new 3DFigure()**:invalid  
abstract class can not be initialized

choose 3

### 3

**e.addEmployee()**:invalid  
e 是 Employee, Employee 没有 addEmployee() method

**m.addEmployee(a)**:valid  
Manager.addEmployee(Employee emp)  
m is manager,a is employee

**((Director)m).approveExpense(10000)**:valid  
(Director)m casts m to Director, therefore m is Director now

choose 1

### 4

From the problem we can see the child class constructor overrides parent constructor without calling it(same parameter passed in). Therefore parent class attribute and methods can not be initialized, therefore compilor error.  
only last answer relates to this.  
see the demo code to experiment.

choose 4

### 5

immutable = do not change attributes after created.

**All attributes must be private to prevent access from outside the class**: true  
we can provide access to the attributes by getters (encapsulation) and make them private, then disable setters to make them immutable for outter classes.

**Have a constructor that enables an object to be instantiated the first time with values**:true  
this coherent to the immutable because we can initialize values, and after that, we disable all possible change actions to make them immutable.

**An object instance cannot be changed after it is created**:true  
this is exactly the definition

**Provide only setter and getter methods to access the attributes from outside the class**:untrue  
we should not provide setters as it will change attributes.

choose 4

### 6

abstract method does not have a method implementation.
that is it can only be over-ridden.  
`protected abstract Boolean printName(String name);`  
is a valid statement within a abstract class  
note ';' and it is only legal within abstract class

choose 1

### 7

**A class can extend multiple interfaces**:true  
the word extend is really odd here, it should really be implement, but because we have a definite wrong answer later we define this as true.

**An interface can extend multiple interfaces**:true  
you can see the demo for this

**A class can extend another class and implement multiple interfaces**:true  
as long as they dont conflict, you can extend or implement multiply classes and interfaces.

**All methods in an interface are implicitly abstract, unless provided with a default implementation**:untrue  
you can only provide method definition to interface

choose 4

### 8

**Constructors cannot be overridden**:true  
we have demo this in Q4, constructors can only be overloaded

**If a static method in the base class, is redefined in the sub-class, the later hides the method in the base class**:true  
the static method is binded with the defined class name, it does not matter wether it is inherited or not. The child class hides the parent class static method, but parent static class is still there.  
we can access Class.staticMethod() or Class.staticAttribute anywhere without actual instance.

**In method overriding, run-time polymorphism ensures that instantiated, the call to any method in the base class will be resolved to the correct method, based on the run-time type of the object instantiated.**:true  
this is what actually dynamic data-binding is defined.
we can assign instance into different class/interface type(as long as there is inheritate/realisation relationship), and it will call the right method at run-time.

**During method overriding, the overridden method in the sub-class can specify a weaker access modifier**:untrue  
if you can access a parent method, you should be allowed to access same child overriding method as well. That is, if a parent method is public, you can only define public in child overrided method. that is, the child can not have weaker access modifier.

note: a strong access modifier means it allows more people to access.
therefore 'public' is the strongest modifier and 'private' is weakest access modifier. access modifier != access restriction

check:https://way2java.com/oops-concepts/rules-of-access-specifiers-in-method-overriding/

### 9

assume we have an object o with class O and there is a method o.m, and we are in o.m:

```
class O {
  A a;
  public void m(T p){
    //we are here
    B anotherB = new B();
    anotherB.otherMethods()//this is legal
    a.method();//this is legal
    p.method();//this is legal
    print();//this is legal
    a.b().c().d()//this is not legal
  }
  public void print(){
    //a random print function
  }
}

```

The principle of least knowledge says 4 things:

1. we can use the method of parameter passed in, ie. p.anything()
2. we can initialize an object within m, and call its methods.
3. if we have attributes in o that belongs to other classes, we can use their methods. ie. if class O have attribute object a belongs to class A, we can call a.othermethods().
4. we call call all other method in class O.
   but, we can not do o.a().b().c().d(). because d() is nothing related to o.

**The principle of least knowledge reduces dependencies between objects and promotes loose coupling**:true  
since we cant do chaining call,we only know the object methods we have directly access with. that is we have loose coupling for all other indirect methods. o.a().b().c().d() means o knows what c return, and call d();

**The code below is a good example of the principle of least knowledge**:true  
because we dont do car.getDriver().getAddress(). so it is good.

**According to the principle of least knowledge, accessing the methods on objects returned by a method call is invalid**:untrue  
we can access, as long as we initialize a variable and assign it, like option 2.

**The principle of least knowledge states that accessing methods of objects passed in as parameters or instantiated inside the method is valid**:true  
check rule1,rule2.  
choose 3.

### 10
