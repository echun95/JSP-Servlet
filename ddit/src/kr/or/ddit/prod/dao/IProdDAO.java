package kr.or.ddit.prod.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.ProdVO;

public interface IProdDAO {
	public List<ProdVO> prodList() throws Exception;
	public ProdVO prodInfo(Map<String, String> params) throws Exception;
	public void insertProdInfo(ProdVO vo) throws Exception;
	public void updateProdInfo(ProdVO vo) throws Exception;
	public void deleteProdInfo(Map<String, String> params) throws Exception;
}
