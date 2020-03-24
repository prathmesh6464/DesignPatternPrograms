package VisitorDesignPattern;


//INTERFACE ITEM ELEMENT
interface ItemElement
{
	int accept(ShopingCartVisitor shopingCartVisitorObject);
}


//CLASS BOOK
class Book implements ItemElement
{
	private int price;
	private String isbnNumber;
	
	public Book(int cost, String isbn)
	{
		this.price = cost;
		this.isbnNumber = isbn;
	}
	
	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShopingCartVisitor shopingCartVisitorObject) 
	{
		return shopingCartVisitorObject.visit(this);
	}
}


//CLASS FRUIT
class Fruit implements ItemElement
{

	@Override
	public int accept(ShopingCartVisitor shopingCartVisitorObject) {
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
