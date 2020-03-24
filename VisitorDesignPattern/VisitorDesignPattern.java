package VisitorDesignPattern;


//INTERFACE ITEM ELEMENT
interface ItemElement
{
	int acccept(ShopingCartVisitor shopingCartVisitorObject);
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
