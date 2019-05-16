import org.springframework.context.support.GenericXmlApplicationContext;

import hibernate.dao.GoodDAO;
import hibernate.domain.Good;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		GoodDAO dao = context.getBean(GoodDAO.class);
		
		
		System.out.println(dao.listGood());
		
		/*
		Good good = new Good();
		good.setCode(2000);
		good.setName("감자");
		good.setManufacture("강원도");
		good.setPrice(3000);
		
		dao.insertGood(good);
		*/
		
		//1	개를 가져올 때는 데이터가 없을 때는 null을 리턴 
		System.out.println(dao.get(1));
		System.out.println(dao.get(200011));
		
		
		context.close();

	}

}
