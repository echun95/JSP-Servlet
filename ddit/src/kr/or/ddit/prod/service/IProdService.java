package kr.or.ddit.prod.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.LProdVO;
import kr.or.ddit.vo.ProdVO;

public interface IProdService {
	public List<ProdVO> prodList(Map<String, String> params);
	public ProdVO prodInfo(Map<String, String> params);
	public void insertProdInfo(ProdVO vo);
	public void updateProdInfo(ProdVO vo);
	public void deleteProdInfo(Map<String, String> params);
	public List<LProdVO> lprodList();
	public String totalCount(Map<String, String> params);

}
