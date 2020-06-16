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
}