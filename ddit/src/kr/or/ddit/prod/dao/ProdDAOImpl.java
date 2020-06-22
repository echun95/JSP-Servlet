package kr.or.ddit.prod.dao;

import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.factory.SqlMapClientFactory;
import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.vo.LProdVO;
import kr.or.ddit.vo.ProdVO;

public class ProdDAOImpl implements IProdDAO {

	private static IProdDAO dao;	
	private SqlMapClient smc;

	public static IProdDAO getInstance(){
		if(dao == null){
			dao = new ProdDAOImpl();
		}
		return dao;
	}
	
	public ProdDAOImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}

	@Override
	public List<ProdVO> prodList(Map<String, String> params) throws Exception {
		return smc.queryForList("prod.prodList",params);
	}
	@Override
	public ProdVO prodInfo(Map<String, String> params) throws Exception {
		return (ProdVO) smc.queryForObject("prod.prodInfo",params);
	}
	@Override
	public void insertProdInfo(ProdVO vo) throws Exception {
		smc.insert("prod.insertProdInfo",vo);
	}
	@Override
	public void updateProdInfo(ProdVO vo) throws Exception {
		smc.update("prod.updateProdInfo",vo);
	}
	@Override
	public void deleteProdInfo(Map<String, String> params) throws Exception {
		smc.delete("prod.deleteProdInfo",params);
	}
	@Override
	public List<LProdVO> lprodList() throws Exception {
		return smc.queryForList("prod.lprodList");
	}

}
