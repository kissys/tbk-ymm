package com.tbk.ymm.service;

import java.util.List;

import com.tbk.ymm.commons.dto.YmmCateBarDTO;
import com.tbk.ymm.commons.model.YmmNavigationCate;

/**
 * 分类相关的服务
 * 
 * @author David (qidawei@xiaomi.com)
 */
public interface YmmCateService {

	/**
	 * 获取网站的分类导航数据
	 * 
	 * @param inputCateId
	 *            输入的cid，可能是导航的cid，也 可能是淘宝的二级cid
	 * @return
	 */
	public YmmCateBarDTO getCateBar(long inputCateId);

	/**
	 * 获取导航栏分类；网站的导航栏分类不是取的淘宝原生的一级分类，而是在一级分类的基础上做了一层封装，方便重命名什么的
	 * 
	 * @return
	 */
	public List<YmmNavigationCate> getNavigationCateList();

}
