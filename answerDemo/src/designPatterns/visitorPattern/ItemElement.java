package designPatterns.visitorPattern;

interface ItemElement 
{ 
    public int accept(ShoppingCartVisitor visitor); 
}