# Part 1

## QUIZ 1

### 1

```
  e.changename(e,"Bob")
  System.out.println(e.getName())
```

从这里可以看出，e.getName() = "Bob"

choose 2

### 2

**Rectangle r = new Rectangle()**:valid  
本身是 class， 可以 initialize

**Figure f = new Rectangle()**:valid  
所有的 Rectangle 都属于 Figure

**Figure f = new 3DFigure()**:invalid  
abstract class can not be initialized.

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

check the demo

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

choose 4

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

## QUIZ 2

### 1

**A generic class used without type arguments is known as a raw type**:true  
raw type means to a generic class object does not specify its refering generic T types.

**You cannot instantiate an array of a generic type using new operator e.g., T[] anArray = new T[100]**:true  
because we dont know the size of T, therefore we cant not instantiate a specific length of array.

**Consider the following method, someMethod(Box<Number> n) { /_.... _/}, this method can take in a Box<Integer> or Box<Double>**:untrue  
We consider Box<Number> a different class from Box<Integer> and unrelated, even the generic class is inheritly related.
when we define generic class Box<T> we dont define a solid class. it can be supported by raw type class or a specific type class. and when we say raw type, it really means any type.

choose 3.

### 2

To answer this question, need to understand the FileNotFoundException is a part of IO Exception. i.e. FileNotFoundException is inherited from IOException.  
Therefore, when we throw FileNotFoundException, at the same time we throw an IO exception as well.
According to the interface implmentation definition, we need to satisfy all the interface criteria.

On the other hand, when we catch we can catch IO exceptions, this means we catch all IOException, including FileNotFoundException.

rule of thumb: throws specific, catch general.

check the demo to see some interface playground demo.

choose 3.

### 3

The key word is add functionality and run-time.  
Double checking with all the descriptions online

1. Visitor pattern:

- seperate algorithms from object it uses.
- provide extra operations without changing class.
- behavior pattern, that changes the behavior of a class(the element class).
- usually, when we want to do anything relates to a class, we add more methods, but in this case, we do not wish to add more methods so we invent the visitor class to visit the elements. But we still need to add accept() method to element, if we didnt have originally.
- in the mean time, how to visit each type of element is also abstracted as an algorithm. (kind of like strategy pattern where each visitor have different strategy for each element.)

2. decorator pattern:

- add functionality to a class during run-time.
- structure pattern, instead of change original class instance behavior, we convert original instance into a new class instance.
- we define the new class behavior.

3. other design patterns listed:

- composite pattern: used to represent a tree or nested data structure. (I have myself).
- abstract factory patterns: used to group a set of related objects' instantiation. (kind of like grouping factory methods)
- factory method patterns: used to abstract instantiate process.
- Observer Pattern: used to seperate observer/subscriber with subject/publisher and remains the notice behavior.

choose 2.

### 4

concern with tree data structure, therefore it is compsite pattern.

Other design patterns:

- singleton: used to limit instantiation of a class into a same instance.
- state: used to dynamically(run-time) change the type of class attribute, ie. change the state of a class.

choose 3.

### 5

this is a decorator pattern, because the return type has changed after you pass original instance.

- strategy patter:

```
  Reader r = new Reader(new LineNumberReader());
```

- State pattern:

```
  Reader r = new Reader(new LineNumberReader());
```

it is similar to strategy pattern because the implementation is the same, but you should be able to change the reader type by calling r.read() in state pattern.

- Factory pattern:

```
  LineNumberReader lnr = new Reader("LineNumber");
```

check if you dont understand:
https://www.javaworld.com/article/2075706/amaze-your-developer-friends-with-design-patterns.html?page=2

choose 1.

### 6

The Errors and RunTimeExceptions can pass through complior check.
Therefore choose the one that is not RunTimeException.
some RuntimeException examples:

- ArithmeticException: the operation on operands are illegal.
- NullPointerException: the pointer address points to null data.
- ArrayIndexOutOfBoundException: the pointer traversed(index) is not within the defined range.
- IllegalArgumentException: a method receives a illegal argument.
- ClassCastException: casting class in an illegal way.

other Exception Types:

- AWTException
- IOException

MalformedURLException is IOException.

choose 2.

### 7

**The Builder Pattern is a violation of the law of demeter**:not true  
usually the law of demeter can be reinforced by breaking the function calls. So no design pattern breaks it. It is a general guide to call other methods within a class method.

**Decorators provide a flexible alternative to inheritance for extending functionality.**:true  
pass old object to get a new class object with more functionality. This is not inheritance.

**The observer pattern provides a design where subjects and observers are loosely coupled**:true  
the observer can modify its own methods without affecting subjects. and vise-versa.

**The Factory Method Design Pattern uses inheritance to solve the problem of creating objects without specifying their exact object classes**:true  
By inheritance, we can split one class/abstract class/interface into multiple classes. Then factory method is used to create different type of these sub-class(by passing different argument).

choose 1.

## QUIZ 3

design smell:the class abstraction design is inappropriate, in the project sense.  
code smell: code level inappropriate, program will function but needs refactoring.

- Bloaters:Long Method, Large Class, Long Parameter List, Data Clumps (variable chunk)
- OO Abusers: against our design principles, long switch statements
  - refused bequest: A subclass uses only some of the methods and properties inherited from its parents
- Change Preventers:
  - Divergent change:One class is changed in different ways for different reasons; class changes too often with new features.
  - Shot Gun Surgery:A small change in the code forces lots of little changes to different classes
- Dispensables:
  - data class: Classes that just have attributes with setters and getters and no behaviour
  - Lazy Class: a class does not enough work.
- Couplers:
  - feature envy: A method that is more interested in a class other than the one it actually is
  - inappropriate intimacy: uses a class extensively when it shouldn't.

### 1

**Classes that not only passively store data, but also methods to operate on the data**: not smell  
this is a classical class definition

**Large conditional logic blocks**: smells  
long code is a good indication of code smell, should split the tasks and assign them into appropriate class.

**Methods making extensive use of another class**: smells  
inappropriate intimacy/feature envy

choose 1.

### 2

definition of lazy class.  
choose 4.

### 3

duplicated code means a chuck of code is duplicated. data clumps focuses on variable use.

definition of data clumps

choose 3.

### 4

**The collections.sort() method is a good example of the strategy Pattern**:true  
by passing different comparator, it can sort differently. comparators are the strategyClass in this case.

**The Java IO makes use of the composite pattern**:false  
previously mentioned there are decorator patterns. check question 5 in quiz 2.

**The Java collection framework makes use of the Iterator Pattern**:true  
this is a standard use of iterator pattern. i.hasNext();i.next();

choose 2.

### 5

**As the application iterates through the disparate set of items of the shopping cart, we apply the price computation logic in the class to each item type.**

I am not sure about this question, but above sentence is the key to unlock the answer.  
I think it doesn't imply that we change different strategy at run-time. But strategy design pattern focus on the flexibility to change strategy at run time.  
Meanwhile, visitor pattern sets the price calculation logic in class definition, coherent to 'in the class'.  
Therefore I think it should be visitor pattern.

choose 4.

# Part 2

### Q1

### In the class Account, the instance variables are defined to be public. State which OO principle is violated here and why it is a bad practice for instance variables to be public.

it violates the encapsulation OO principle.  
public variables can be accessed by any other classes, which cause the classes to be coupled. At the same time, class exposes unnecessary data to other classes, and loses control of data value.

### When the above code is run, the output produced is as follows: "Statement for NOVEMBER"

static methods in child class does not override the parent class static method, instead, it hides from child class access. In this case, if we access through parent class, we can still access the original static class definition. a1 is defined with Account, therefore a1.printStatementHeader() = Account.printStatementHeader().

### Describe what changes would you make to the code above to ensure that the classes Account and SavingsAccount are immutable?

I will make the variables private and final, and provide getters to access them without setters to ensure no ways to modify them. static variables does not need a getter.

### Q2

### (A) The Collections.sort() method takes in a Comparator object to specify how elements should be compared. By varying the comparator, you can sort by different criteria. Name the design pattern used in the implementation of the Comparator.

strategy pattern. we provide different strategy in run-time as per discussed before.

### (B) Adding operations to classes without changing the class.

visitor pattern. As per discuss in quiz2 Q3, if no run-time is mentioned, we say visitor pattern.

### (C) Restricting the instantiation of a class to a single instance.

singleton pattern.

### Q3Q4

refer to demos

### Q5

### Provide one important difference between the access modifiers private and protected.

1. same package access:
   under same package, we can access other class with protected, but not with private
2. sub class access:
   sub class can access protected definition, but not private.
