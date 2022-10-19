package institues;

import java.util.ArrayList;
import java.util.List;
import core.logging.Logger;
import dataAccess.CategoriesDao;
import entities.CategoriesInfo;

public class CategorieManager {

		
	private CategoriesDao categoriesDao;
	private Logger[] loggers;
	List<String> categoryNames = new ArrayList<>(); //Kategori isimleri ile Array oluşturuldu. Aşağıda kullanılacak

	
	
public CategorieManager(CategoriesDao categoriesDao,Logger[] loggers) 
{
	this.categoriesDao = categoriesDao;
	this.loggers = loggers;
}

	public void addCategory(CategoriesInfo categoriesInfo) throws Exception {

		
		for (String categoryCheck : categoryNames) {

			// Girilen Category Ismi Ile Var Olan Category Ismini Karsilastiriyoruz
			if (categoryCheck == categoriesInfo.getCategoryName()) {

				// Karsilastirilan Degerler Ayni Ise Hata Veriyor
				throw new Exception("Bu kategori ismi mevcut");
			}
		}

		// Girilen Category Ismi Ile Var Olan Category Ismi Ayni Degil Ise ekleme yapıyoruz

		categoryNames.add(categoriesInfo.getCategoryName());

		categoriesDao.addCategory();

		for (Logger logger : loggers) {
			logger.log(categoriesInfo.getCategoryName());
		}

		System.out.println("Kategori eklendi");
	}

	public void deleteCategory(CategoriesInfo categoriesInfo) {
		System.out.println("Kategori silindi");
	}

}
