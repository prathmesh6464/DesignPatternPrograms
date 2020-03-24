package VisitorDesignPattern;


//INTERFACE ITEM ELEMENT
interface ItemElement
{
	int accept(ShopingCartVisitor shopingCartVisitorObject);
}


//CLASS BOOK
class Book implements ItemElement
{
	//VARIABLES OF BOOK
	private int price;
	private String bookName;

	//CONSTRUCTOR
	public Book(int cost, String bookName)
	{
		this.price = cost;
		this.bookName = bookName;
	}

	//GETTER
	public int getPrice()
	{
		return price;
	}

	//GETTER
	public String getBookName() 
	{
		return bookName;
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
	//VARIABLES
	private int pricePerKG;
	private int weight;
	private String name;

	//CONSTRUCTOR
	public Fruit(int pricePerKG, int weight, String name)
	{
		this.pricePerKG = pricePerKG;
		this.weight = weight;
		this.name = name;
	}

	//GETTER
	public int getPricePerKG() 
	{
		return pricePerKG;
	}

	//GETTER
	public int getWeight()
	{
		return weight;
	}

	//GETTER
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


//CLASS SHOPING CART VISITOR IMPLEMENT
class ShoppingCartVisitorImplement implements ShopingCartVisitor
{
	@Override
	public int visit(Book book) 
	{
		int cost = 0;

		cost = book.getPrice();
		System.out.println("Book name : "+book.getBookName() + " and cost = "+cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) 
	{
		int cost = fruit.getPricePerKG()*fruit.getWeight();
		System.out.println(fruit.getName() + " cost = "+cost);
		return cost;
	}

}


//CLASS VISITOR DESIGN PATTERN
public class VisitorDesignPattern 
{
	private static int calculatePrice(ItemElement[] items)
	{
		ShopingCartVisitor visitor = new ShoppingCartVisitorImplement();
		int sum = 0;
		for(ItemElement item : items)
		{
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

	//MAIN METHOD
	public static void main(String[] args) 
	{
		ItemElement[] items = new ItemElement[]{new Book(20, "Python"),new Book(100, "Java"),new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};

		int total = calculatePrice(items);
		System.out.println("Total cost = "+total);
	}
}
