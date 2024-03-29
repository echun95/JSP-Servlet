package kr.or.ddit.prod.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.prod.dao.IProdDAO;
import kr.or.ddit.prod.dao.ProdDAOImpl;
import kr.or.ddit.vo.LProdVO;
import kr.or.ddit.vo.ProdVO;

public class ProdServiceImpl implements IProdService{
	private static IProdService service;
	private IProdDAO dao;

	public static IProdService getInstance() {
		if (service == null) {
			service = new ProdServiceImpl();
		}
		return service;
	}

	private ProdServiceImpl() {
		dao = ProdDAOImpl.getInstance();
	}

	
	
	@Override
	public List<ProdVO> prodList(Map<String, String> params) {
		List<ProdVO> list = null;
		try {
			list = dao.prodList(params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ProdVO prodInfo(Map<String, String> params) {
		ProdVO vo = null;
		try {
			vo = dao.prodInfo(params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public void insertProdInfo(ProdVO vo) {
		try {
			dao.insertProdInfo(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateProdInfo(ProdVO vo) {
		try {
			dao.updateProdInfo(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProdInfo(Map<String, String> params) {
		try {
			dao.deleteProdInfo(params);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<LProdVO> lprodList() {		
		List<LProdVO> list = null;
		try {
			list = dao.lprodList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
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
