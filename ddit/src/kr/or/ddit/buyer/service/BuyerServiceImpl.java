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

	@Override
	public List<Map<String, String>> buyerListAll(Map<String, String> params) {
		List<Map<String, String>> buyerList = null;
		try {
			buyerList = dao.buyerListAll(params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buyerList;
	}

	@Override
	public BuyerVO buyerInfo(String params) {
		BuyerVO buyerInfo = null;
		try {
			buyerInfo = dao.buyerInfo(params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buyerInfo;
	}

	@Override
	public void deleteBuyerInfo(String buyer_id) {
		try {
			dao.deleteBuyerInfo(buyer_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateBuyerInfo(BuyerVO buyerInfo) {
		try {
			dao.updateBuyerInfo(buyerInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insertBuyerInfo(BuyerVO buyerInfo) {
		try {
			dao.insertBuyerInfo(buyerInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String selectBuyerId(String buyer_lgu) {
		String lgu = "";
		try {
			lgu = dao.selectBuyerId(buyer_lgu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lgu;
	}

	@Override
	public String totalCount(Map<String, String> params) {
		String totalCount = null;
		try {
			totalCount = dao.totalCount(params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalCount;
	}
}
