package kr.or.ddit.prod.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.prod.dao.IProdDAO;
import kr.or.ddit.prod.dao.ProdDAOImpl;
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
	public List<ProdVO> prodList() {
		List<ProdVO> list = null;
		try {
			list = dao.prodList();
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

}