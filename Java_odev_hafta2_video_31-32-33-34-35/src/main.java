
public class main {

	public static void main(String[] args) {
		

		//constructor kullanım
		
		Product product = new Product(1,"Laptop","Acer",5900,4);	
		
		/*
		 * bu normal kullanımı
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Acer");
		product.setPrice(5900);
		product.setStockAmount(4);
		
		*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());
		
		
		
		//OVERLOAD ÇALIŞMASI
		
		Toplama frkn = new Toplama();
		System.out.println(frkn.topla(3,2));
	}
}
