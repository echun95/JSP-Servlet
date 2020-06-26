package kr.or.ddit.buyer.dao;

import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.factory.SqlMapClientFactory;
import kr.or.ddit.vo.BuyerVO;

public class BuyerDaoImpl implements IBuyerDao {
	
	private static IBuyerDao dao;
	private SqlMapClient smc;
	
	public BuyerDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IBuyerDao getInstance(){
		if(dao ==null){
			dao = new BuyerDaoImpl();
		}
		return dao;
	}
	
	@Override
	public List<BuyerVO> buyerList(Map<String, String> params) throws Exception {
		
		return smc.queryForList("buyer.buyerList", params);
	}

	@Override
	public List<Map<String, String>> buyerListAll(Map<String, String> params) throws Exception {
		return smc.queryForList("buyer.buyerListAll",params);
	}

	@Override
	public BuyerVO buyerInfo(String params) throws Exception {
		return (BuyerVO)smc.queryForObject("buyer.buyerInfo",params);
	}

	@Override
	public void deleteBuyerInfo(String buyer_id) throws Exception {
		smc.delete("buyer.deleteBuyerInfo",buyer_id);
	}

	@Override
	public void updateBuyerInfo(BuyerVO buyerInfo) throws Exception {
		smc.update("buyer.updateBuyerInfo",buyerInfo);
	}

	@Override
	public void insertBuyerInfo(BuyerVO buyerInfo) throws Exception {
		smc.insert("buyer.insertBuyerInfo",buyerInfo);
	}

	@Override
	public String selectBuyerId(String buyer_lgu) throws Exception {
		return (String)smc.queryForObject("buyer.selectBuyerId",buyer_lgu);
	}

	@Override
	public String totalCount(Map<String, String> params) throws Exception {
		return (String) smc.queryForObject("buyer.totalCount",params);
	}
	
}
