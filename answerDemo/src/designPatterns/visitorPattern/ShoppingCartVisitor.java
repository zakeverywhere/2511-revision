package designPatterns.visitorPattern;

interface ShoppingCartVisitor  
{ 
   
    int visit(Book book); 
    int visit(Fruit fruit); 
}