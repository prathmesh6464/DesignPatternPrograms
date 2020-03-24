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
	private String isBookNameNumber;

	public Book(int cost, String isBookNameNumber)
	{
		this.price = cost;
		this.isBookNameNumber = isBookNameNumber;
	}

	public int getPrice() {
		return price;
	}

	public String getIsBookNameNumber() {
		return isBookNameNumber;
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
	private int pricePerKG;
	private int weight;
	private String name;

	public Fruit(int pricePerKG, int weight, String name)
	{
		this.pricePerKG = pricePerKG;
		this.weight = weight;
		this.name = name;
	}

	public int getPricePerKg() 
	{
		return pricePerKG;
	}


	public int getWeight()
	{
		return weight;
	}

	public String getName()
	{
		return this.name;
	}

	@Override
	public int accept(ShopingCartVisitor shopingCartVisitorObject)
	{
		return shopingCartVisitorObject.visit(this);
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
