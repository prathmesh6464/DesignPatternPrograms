package VisitorDesignPattern;


//INTERFACE ITEM ELEMENT
interface ItemElement
{
	int acccept(ShopingCartVisitor shopingCartVisitorObject);
}


//CLASS BOOK
class Book implements ItemElement
{

	@Override
	public int acccept(ShopingCartVisitor shopingCartVisitorObject) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


//CLASS FRUIT
class Fruit implements ItemElement
{

	@Override
	public int acccept(ShopingCartVisitor shopingCartVisitorObject) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}




//INTERFACE SHOPPING CART VISITOR
interface ShopingCartVisitor
{
	int visit(Book bookObject);
	int visit(Fruit fruitObject);
}
 


//CLASS VISITOR DESIGN PATTERN
public class VisitorDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
