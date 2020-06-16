package kr.or.ddit.buyer.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.buyer.dao.BuyerDaoImpl;
import kr.or.ddit.buyer.dao.IBuyerDao;
import kr.or.ddit.vo.BuyerVO;

public class BuyerServiceImpl implements IBuyerService {
		
	private static IBuyerService service;
	private IBuyerDao dao;
	
	private BuyerServiceImpl() {
		dao = BuyerDaoImpl.getInstance();
	}
	
	public static IBuyerService getInstance(){
		if(service == null){
			service = new BuyerServiceImpl();
		}
		return service;
	}
	
	@Override
	public List<BuyerVO> buyerList(Map<String, String> params) {
		List<BuyerVO> buyerList= null;
		try{
			buyerList = dao.buyerList(params);
		}catch(Exception e){
			e.printStackTrace();
		}
		return buyerList;
	}
}
