package kr.or.ddit.buyer.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.BuyerVO;

public interface IBuyerService {
	public List<BuyerVO> buyerList(Map<String, String> params);
}